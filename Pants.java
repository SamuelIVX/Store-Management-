import java.io.*;
import java.util.*;

public class Pants extends Shirts {
  private String pantSize;
  private String hasBelt;

  public Pants() {
    pantSize = "small";
    hasBelt = "no";
  }

  public Pants(String newPantSize, String newBelt) {
    pantSize = newPantSize;
    hasBelt = newBelt;
  }

  public String getPantSize() {
    return pantSize;
  }

  public String getBelt() {
    return hasBelt;
  }

  public void setPantSize(String newPantSize) {
    pantSize = newPantSize;
  }

  public void setBelt(String newBelt) {
    hasBelt = newBelt;
  }

  public String toStringPants() {
    return "\nSize of Pants: " + pantSize  + "\nHas Belt: " + hasBelt;
  }

// I will be instantiaing a pants object and calling this method
  public void startShop() {
    
// Creates objects by using the bobbyBob, Shirts and Pants class to use the setters and getters from each class
    Shirts createShirt = new Shirts(); 
    Pants createPants = new Pants();
    bobbyBob getInfo = new bobbyBob();
    Scanner input = new Scanner(System.in);
    int choice = 0; 
    int userChoice = 0;

// Will gather information from the user and guide them to picking out there shirts and pants
    while (choice == 0) {
       System.out.println("Hello and welcome to our store! We have a variety of items for you to buy from! But before we get to that, we would like to ask you some questions! ");
      System.out.println("What is your name: ");
      String newName = input.nextLine();
      getInfo.setName(newName);
      System.out.println("What is your Address so we can deliver it to you: ");
      String newAddress = input.nextLine();
      getInfo.setAddress(newAddress);
      
//Will ask the user if they want to start shopping or decide not to...
      System.out.println("If you are ready to begin your shopping, please input 1 else input 9 if you changed your mind not to... ");
      choice = input.nextInt();
      input.nextLine();

// Main part of the program which accesses each class to recieve info from the user and give information to the user
      if (choice == 1) {
        System.out.println("Welcome to the Shirt section!\n Please pick what type of shirt size will fit your fancy:\n small, medium or large?");
        String newSize = input.nextLine();
        createShirt.setSize(newSize);
        
        System.out.println("Would you like your shirt to be short or long sleeved?");
        String newSleeves = input.nextLine();
        createShirt.setSleeves(newSleeves);
        
        System.out.println("Now welcome to the Pants section!\n Please pick what type of pant size will fit your fancy:\n small, medium or large?");
        String newPantSize = input.nextLine();
        createPants.setPantSize(newPantSize);
        
        System.out.println("Many people wear belts to tighten up their pants. Would you like your pants to come with a belt (yes or no)?");
        String newBelt = input.nextLine();
        createPants.setBelt(newBelt);
        
// Uses the toString method from each of the classes to return each value the user has entered
        
    System.out.print("-----------------------------------");
    System.out.println(getInfo.toStringBob());
    System.out.println("---------------------------------");
    System.out.print("\"Shirt-Information\"");
    System.out.println(createShirt.toStringShirts());
    System.out.println("---------------------------------");
    System.out.print("\"Pants-Information\"");
    System.out.println(createPants.toStringPants());
    System.out.println("---------------------------------");

// Asks the user if the information they've entered is correct or not. IF CORRECT, the program will end and gives them a message. IF the information is NOT CORRECT, they will restart from the beginning.
    
      System.out.println("Do you find the information you've entered correct or wrong? Please input 1 if correct or 0 to start over: ");
    userChoice = input.nextInt();
    input.nextLine();
        
    if (userChoice == 1) {
      System.out.println("Okay please wait as I process your information...");
      try{Thread.sleep(3500);}catch(InterruptedException e){System.out.println(e);}    
      System.out.print("Information proccessed. Your items will arrive in 2-3 business days. Thank you for shopping with us!");
        }
        if (userChoice == 2) {
          continue;
        }
      }
      else if (choice == 9) {
        System.out.print("FINE, I didn't want to help you shop anyways...");
      }
    }
    input.close();
  }
}
