/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhemedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class count7 {

	public static int count7(int n) {
		if ( n > 0) {
			if ( n%10 == 7)
				return 1 + count7(n/10);
			return count7(n/10);
		}
		return 0;
	}
	
	public static void main (String[] args){
		System.out.println(count7(717));
		System.out.println(count7(7));
		System.out.println(count7(123));
	}
}
