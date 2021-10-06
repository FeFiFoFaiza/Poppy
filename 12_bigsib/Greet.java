/*
 TNPG: Damning Duo of Salvation| Faiza Huda, Truthful Tom, Lauren Lee
 APCS
 HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
 2021-10-05

 Disco:
 - You can just declare variables without assigning them a value upfront
 
 QCC:
 - Do I need static if I'm using instances? 
*/

public class Greet {
 
  public static void main( String[] args ) {
   
    String greeting;

    BigSib richard = new BigSib();

    richard.setHelloMsg("Word up");
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
