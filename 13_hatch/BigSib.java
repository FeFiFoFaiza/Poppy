/*
 TNPG: Watur| Faiza Huda, Truthful Tom, Lauren Lee
 APCS
 HW13 -- Where do Big Sibs Come From?
 2021-10-06

 DISCO:
 - Constructors need parameters
 QCC:
 - In order to output more things i.e "Sup ma," you'd need to invoke setHelloMsg
*/

public class BigSib{

  String helloMsg;

  public BigSib(String Msg){
   setHelloMsg(Msg);
  }

  public void setHelloMsg (String phrase) {
    helloMsg = phrase;
  }

  public String greet (String name) {
    return helloMsg + " " + name; 
  }

}
