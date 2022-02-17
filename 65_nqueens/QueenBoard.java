/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size ) 
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition: 
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   * backtracks
   */
  public boolean solve()
  {
    if (solveH(0)){
      printSolution();
      return true;
    } else {
      System.out.println("Turns out it doesn't exist...oops");
      return false;
    }
  }


  /**
   *Helper method for solve. 
   // CHECKS IF YOU CAN PLACE A QUEEN
   */
  private boolean solveH( int col ) 
  {
    if (col < _board.length && col >= 0){
      for (int row = 0; row < _board.length; row++){
        if (addQueen(row, col)){
          if ((col == _board.length - 1) || (solveH(col + 1))) {
            return true;
          }
          removeQueen(row, col);
        }
      }
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    for (int row = 0; row < _board.length; row++){
      for (int col = 0; col < _board[row].length; col++){
        if (_board[row][col] <= 0){
          System.out.print("_");
        }
        else if (_board[row][col] == 1){
          System.out.print("Q");
        }
      }
      System.out.print("\n");
    }
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * Adds a queen at a specific space if possible
   * precondition: row and col < size 
   * postcondition: Every value in the array is <= 1
   *                There is a new Queen is possible
   *                Possible attacks right of it are marked (down --)
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * Removes a queen at a specific space if possible
   * precondition: row and col < size 
   * postcondition: Every value in the array is <= 1
   *                There is not a Queen in that space
   *                Appropriate attacks were removed (++)
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * Prints out array values
   * precondition: _board exists
   * postcondition: stringified _board returned
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    //QueenBoard b = new QueenBoard(5);
    //System.out.println(b);
    /** should be...
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
    */

    //b.addQueen(3,0);
    //b.addQueen(0,1);
    //System.out.println(b);
    /** should be...
       0	1	-1	-2	-1	
       0	0	-2	0	0	
       0	-1	0	-1	0	
       1	-1	-1	-1	-2	
       0	-1	0	0	0	
    */

    //b.removeQueen(3,0);
    //System.out.println(b);
    /** should be...
       0	1	-1	-1	-1	
       0	0	-1	0	0	
       0	0	0	-1	0	
       0	0	0	0	-1	
       0	0	0	0	0	 
    */
    
    //==========================solve() testing=======================
    System.out.println("7x7 solution:");
    QueenBoard a = new QueenBoard(7);
    a.solve();

    System.out.println("8x8 solution:");
    QueenBoard c = new QueenBoard(8);
    c.solve();

    System.out.println("9x9 solution:");
    QueenBoard d = new QueenBoard(9);
    d.solve();

    System.out.println("11x11 solution:");
    QueenBoard e = new QueenBoard(11);
    e.solve();

    System.out.println("100x100 solution:");
    QueenBoard f = new QueenBoard(100);
    f.solve();
  }

}//end class
