// The Arms class inherits name, colour, price, serialNumber and currentStock from the Part class.
public class Arms extends Part{
  private float length = 0f;

  public Arms(String name, String colour, float price, double serialNumber, int currentStock,float length){
    // Calls the constructor of the superclass Part and passes in the inherited variables.
    super(name, colour, price, serialNumber, currentStock);
    this.length = length;
  }

  //Returns the length of the arms
  public float getLength(){
    return this.length;
  }  
}