/**
CATVLLVS VIII x II | Faiza Huda, Diana Akhemedova, Truthful Tom, Ajax, Huebert
APCS pd8
HW64 -- Revistitation
time spent: 1 hr
**/

public class factorial{

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n-1);
	}

	public static void main(String[] args){
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
	}
}
