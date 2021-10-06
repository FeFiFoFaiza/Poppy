/*
 TNPG: Money Hags | Alpaca, Faiza Huda, Ziying Jian, Nina Jiang, Truthful Tom, Scruffy
 APCS
 HW10 -- Refactor Big Sib One
 2021-10-04

*/

public class BigSib{

  String helloMsg;

  public void setHelloMsg (String phrase) {
    helloMsg = phrase;
  }

  public String greet (String name) {
    return helloMsg + " " + name; 
  }

}
