/*
 TNPG: Money Hags | Alpaca, Faiza Huda, Ziying Jian, Nina Jiang, Truthful Tom, Scruffy
 APCS
 HW10 -- Refactor Big Sib One
 2021-10-04
 
 Discoveries:
 - Since Greet is doing the printing, BigSib needs to return the value instead. 
 - You need to remember to change the return type depending on the type of output the method displays.
 - Don't need to compile BigSib.java as long as you compile the java file with the main method- in this case -> Greet.java

 Unresolved Questions:
 - Why does is the return type of the main method void?

*/

public class Greet{
  
  public static void main (String[]args) {
    System.out.println( BigSib.greet("Muskaan") );
    System.out.println( BigSib.greet("Hafsa") );
    System.out.println( BigSib.greet("Nur") );
  }
 
}
