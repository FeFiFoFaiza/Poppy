public class countHi{
	
	/*
	Return the number of times that the string "hi" appears anywhere in the given string.
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
		countHi test = new countHi();

		System.out.println(test.countHi("hiho not HOHIhi")); // → 2
		System.out.println(test.countHi("hiHIhi")); // → 2
		System.out.println(test.countHi("h")); // → 0
	}
}
