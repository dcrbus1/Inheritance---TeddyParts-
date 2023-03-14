// The Part class is a superclass, which contains methods and fields that the body parts classes will inherit. 
public class Part{
  private String name = "";
  private String colour = "";
  private float price = 0f;
  private double serialNumber =0;
  private int currentStock = 0;

  public Part(String name, String colour, float price, double serialNumber, int currentStock){
    // Assigns the value of the Part parameters to the private variables of the Part class.
    this.name = name;
    this.colour = colour;
    this.price = price;
    this.serialNumber = serialNumber;
    this.currentStock = currentStock;
} 
  
  //Returns the name of the body part.
  public String getName(){
    return this.name;
  }

  //Returns the colour of the body part.
  public String getColour(){
    return this.colour;
  }

  //Returns the price of the body part.
  public float getPrice(){
    return this.price;
  }

  //Returns serial no. of the body part. 
  public double getSerialNumber(){
    return this.serialNumber;
  }

  // Modifies the amount of the variable currentStock.
  public boolean modifyStock(int amount){
    if(this.currentStock+amount>0){
       this.currentStock += amount;
       return true;
    }
    return false;
  }
  
   //Returns the current stock
   public int getCurrentStock(){
    return this.currentStock;
  }
}