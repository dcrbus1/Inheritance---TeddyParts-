// The Torso class inherits name, colour, price, serialNumber and currentStock from the Part class.
public class Torso extends Part{
  private String size = "";

  public Torso(String name, String colour, float price, double serialNumber, int currentStock,String size){
    // Calls the constructor of the superclass Part and passes in the inherited variables
    super(name, colour, price, serialNumber, currentStock);
    this.size = size;
  }

  //Returns the size of the torso
  public String getSize(){
    return this.size;
  }
}