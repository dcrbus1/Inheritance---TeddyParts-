import java.util.*;

// The Database class creates an ArrayList that contains the list of body parts and it prints an inventory. 
public class Database{
  String eyeColour; // Declares variable eyeColour of type String.
  String torsoSize;
  float armsLength;
  String legBends;
  int totalHeads;
  int totalStock;
  //Creates a partList .
  private ArrayList<Part> partList;

  //Initialises the partList array.
  public Database(){
    partList = new ArrayList<Part>(); 
  }

  //Adds a body part to the partList array.
  public void addPart(Part part){
    partList.add(part);
  }

  // Prints the inventory.
  public void printInventory(){  
    System.out.println();
    System.out.println();
    System.out.println("             INVENTORY");
    System.out.println();    
    System.out.println("Name\tColour\tPrice(£)\tSerialNumber\tStock\tEye Colour\tBendable legs?\t");
    // For-loop runs trough every part in the partList array.
    for(Part part:partList){
      System.out.print(part.getName()+ "\t" +part.getColour()+ "\t" +part.getPrice()+ "\t\t" +part.getSerialNumber()+ "\t\t\t" +part.getCurrentStock()+ "\t"); 
      // If a part is an instance of Head, the method getEyeColour is called on that part and the result of the method is stores in the variable eyeColour. If the part is not an instance of Head, a blank string is stored in eyeColour. 
      eyeColour = part instanceof Head ?
  ((Head)part).getEyeColour(): "";
      legBends = part instanceof Legs ?
  ((Legs)part).bendsOrNot():"";
      System.out.print ("\t"+eyeColour + "\t\t\t" + legBends);
      System.out.println();
}
      System.out.println();
 } 
  } 
  
  

  
   

  