/*
 TNPG: Watur| Faiza Huda, Truthful Tom, Lauren Lee
 APCS
 HW13 -- Where do Big Sibs Come From?
 2021-10-05
 
*/

public class Greet {
 
  public static void main( String[] args ) {
   
    String greeting;

    BigSib richard = new BigSib("Word up");
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);

    richard.setHelloMsg("Salve");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);

    richard.setHelloMsg("Let's boogey");
    greeting = richard.greet("Hong Kong Phooey");
    System.out.println(greeting);

    richard.setHelloMsg("Sup");
    greeting = richard.greet("ma");
    System.out.println(greeting);
  } 

} 
