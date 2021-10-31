public class catDog{
	
	/*
	Return true if the string "cat" and "dog" appear the same number of times in the given 
  string.
	*/
	
public boolean catDog(String str) {
  	int catCtr = 0;
  	int dogCtr = 0;
  	for(int i = 0; i < str.length() - 2; i++){
    		if (str.substring(i, i + 3).equals("cat")){
      			catCtr++;
    		}
  	}
  	for(int i = 0; i < str.length() - 2; i++){
    		if (str.substring(i, i + 3).equals("dog")){
      			dogCtr++;
    		}
 	}
  	return dogCtr == catCtr;
}

	public static void main (String[] args){
		catDog test = new catDog();

		System.out.println(test.catDog("catdog")); // → true
		System.out.println(test.catDog("1cat1cadodog")); // → true
		System.out.println(test.catDog("dogogcat")); // → true
	}
}
