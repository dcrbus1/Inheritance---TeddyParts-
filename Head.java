// Head class inherits name, colour, price, serialNumber and currentStock from the Part class.
public class Head extends Part{
  private String eyeColour = "";

  public Head(String name, String colour, float price, double serialNumber, int currentStock, String eyeColour){
    // Calls the constructor of the superclass Part and passes in the inherited variables.
    super(name, colour, price, serialNumber, currentStock); 
    this.eyeColour = eyeColour;
  }

  //Returns the eye colour.
  public String getEyeColour(){
    return this.eyeColour;
  }  
}