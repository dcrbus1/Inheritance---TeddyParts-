// The Legs class inherits name, colour, price, serialNumber and currentStock from the Part class.
public class Legs extends Part{
  private String legBendsOrNot = "";
  
  public Legs(String name, String colour, float price, double serialNumber, int currentStock, String legBendsOrNot){
  // Calls the constructor of the superclass Part and passes in the inherited variables.  
  super(name, colour, price, serialNumber, currentStock);
this.legBendsOrNot = legBendsOrNot;
  }

  // Returns the String passed to the variable legBendsOrNot. 
  public String bendsOrNot(){
      return legBendsOrNot; 
  }  
}