class Main {
  public static void main(String[] args) {
    //Creates a new Database instance.
    Database db = new Database();
    // Creates objects (i.e. head1) of the Part subclasses, which are the teddy bear pody parts (i.e. Head).
    Head head1 = new Head("Head", "yellow", 45, 12552, 2, "brown");
    Head head2 = new Head("Head", "red   ", 20, 15428, 3, "blue");
    Arms arms1 = new Arms("Arms", "red   ", 10, 2458, 6, 4);
    Torso torso1 = new Torso("Torso", "green", 13, 485, 5,"S");
    Legs legs1 = new Legs("Legs", "red   ", 10, 42568, 3, "yes");
    Legs legs2 = new Legs("Legs", "red   ", 10, 42568, 3, "no"); 
    //Passes the arguments of each Part subclass to the addPart method.
    db.addPart(head1);
    db.addPart(head2);
    db.addPart(arms1);
    db.addPart(torso1);
    db.addPart(legs1);  
    db.addPart(legs2); 
    //Calls the printInventory() method.
    db.printInventory();
    System.out.println();
    System.out.println();
    System.out.println();
    // Creates a BuildTeddyBear object bear1. 
    BuildTeddyBear bear1 = new BuildTeddyBear();
    //Passes the arguments of each Part subclass to the set methods.
    bear1.setHead(head2);
    bear1.setTorso(torso1);
    bear1.setArms(arms1);
    bear1.setLegs(legs1);
    // Calls the BuildATeddyBear methodo on the "bear1" object, with a new customer object named "Jack" as the argument.
    bear1.BuilATeddyBear(new Customers("Jack"));
  } 
}