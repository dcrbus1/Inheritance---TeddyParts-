// The Customer class allows to create customer objects.
public class Customers{
  String customerName = "";
  
  public Customers(String customerName){
    this.customerName = customerName;
  }

  // Returns the name of the customer. 
  public String getName(){
    return this.customerName;
  }
}