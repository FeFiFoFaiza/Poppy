/*
 TNPG: Tobias_Hillary_7 | Diana Akhmedova, Tasnim Chowdhury, Faiza Huda
 APCS
 HW08 -- Refactor Freshie Zero
 2021-09-30
 
 Discoveries:
 - You can't define a method within a method
 - You need an argument when you're calling a method within a method
 
 Unresolved Questions:
 - How do you clone only a folder using git?
*/

public class Greet{
  
  public static void Greet (String name) {
    System.out.println("Why, hello there " + name + ". How do you do?");
  }
  
  public static void main (String[]args) {
    Greet("fellow brethren");
    Greet("Cthulhu");
    Greet("Christopher");
  }
 
}
