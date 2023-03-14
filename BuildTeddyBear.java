// The BuildTeddyBear class methods that build the teddy bear.
public class BuildTeddyBear{
  private Head head;
  private Arms arms;
  private Torso torso;
  private Legs legs;

  public BuildTeddyBear(){
    //do nothing
  }

  // Builds the teddy bear and prints the set body parts. The name of the customer is passed as an argument to the method.
  public void BuilATeddyBear(Customers customer){
    // If all parts have a stock, it builds the teddy bar. 
    if(head!= null && torso!= null && arms!= null && legs!= null ){
      System.out.println("Building teddy bear with the following parts:");
      System.out.println();
      System.out.print(head.getName()+"    Colour: "+head.getColour()+"Eye colour: "+head.getEyeColour()+"\t");
      head.modifyStock(-1); // After a head is used to build the teddy bear, the stock is modified to subtract one head from the stock. 
      System.out.println("New Stock: "+head.getCurrentStock());
      System.out.print(torso.getName()+"   Colour: "+torso.getColour()+"\t");
      torso.modifyStock(-1);
      System.out.println("New Stock: "+torso.getCurrentStock());
      System.out.print(arms.getName()+"    Colour: "+arms.getColour()+"\t");
      arms.modifyStock(-1);
      System.out.println("New Stock: "+arms.getCurrentStock());
      System.out.print(legs.getName()+"    Colour: "+legs.getColour()+"Bends or not?: "+legs.bendsOrNot()+"\t");
      legs.modifyStock(-1);
      System.out.println("New Stock: "+legs.getCurrentStock());
      // Calculates the total price of the teddy bear and stores it in the variable totalPrice. 
      float totalPrice = head.getPrice()+torso.getPrice()+arms.getPrice()+legs.getPrice();
      System.out.println("Total price is: £" + totalPrice);
      System.out.println();
      System.out.println("Assembling the teddy bear..."); //Prints "Assembling the teddy bear".
      System.out.println();
      System.out.println("Delivering teddy bear to " + customer.getName()+"..."); // Prints Delivering teddy bear to name of the customer.    
      }
    // If a body part is missing, the teddy bear will not assemble, and a message will be printed.
    else{  
      System.out.println("One or more teddy bear body part(s) are missing, this teddy bear can not be assembled.");
    }
}

  // Sets head.
  public void setHead(Head head){
    this.head = head;
  }

  // Sets torso.
  public void setTorso(Torso torso){
    this.torso = torso;
  }

  // Sets arms.
  public void setArms(Arms arms){
    this.arms = arms;
  }

  // Sets legs.
  public void setLegs(Legs legs){
    this.legs = legs;
  }
}