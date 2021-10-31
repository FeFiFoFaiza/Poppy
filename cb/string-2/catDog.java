public class catDog{
	
	/*
	Return true if the string "cat" and "dog" appear the same number of times in the given 
  string.
	*/
	
	public int countHi(String str) {
  int hiCtr = 0;
    for(int i = 0; i < str.length() - 1; i++){
      if (str.substring(i, i + 2).equals("hi")){
        hiCtr++;
      }
    }
  return hiCtr;
  }

	public static void main (String[] args){
		catDog test = new catDog();

		System.out.println(test.catDog("catdog")); // → true
		System.out.println(test.catDog("1cat1cadodog")); // → true
		System.out.println(catDog("dogogcat")); // → true
	}
}
