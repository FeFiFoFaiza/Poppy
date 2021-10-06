/*
 TNPG: Damning Duo of Salvation| Faiza Huda, Truthful Tom, Lauren Lee
 APCS
 HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
 2021-10-05

*/

public class BigSibTest{

  String helloMsg;

  public BigSibTest(String Msg){
   setHelloMsg(Msg);
  }

  public void setHelloMsg (String phrase) {
    helloMsg = phrase;
  }

  public String greet (String name) {
    return helloMsg + " " + name; 
  }

}
