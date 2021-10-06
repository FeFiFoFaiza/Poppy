/*
 TNPG: Money Hags | Alpaca, Faiza Huda, Ziying Jian, Nina Jiang, Truthful Tom, Scruffy
 APCS
 HW10 -- Refactor Big Sib One
 2021-10-04

 Disco 
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
