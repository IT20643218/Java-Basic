class MainApplicaion {
  public static void main(String[] args) {
     //Animal animal1 = new Animal("test");
     //animal1.display();						//Animal class is abstract class
     
     Cat mycat = new Cat("Micky");
     mycat.display();
     
     Dog mydog = new Dog("Rover");
     mydog.display();
     
     ToyCat mytoy = new ToyCat("kittie","Toysrus");
     mytoy.display();
     
     ToyCat toy2 = new ToyCat();
     
     // 1.  Make the Animal class an abstract class
     //     Make the speak method an abstract method
     //     Modifiy the main function.  
     //     What needs to be removed and why?
     
     // 2. Add default constructors to each of the
     //    classes.  Display a message giving
     //   details of the name of the constructor.
     //   e.g. 
     
     //    public Animal() {
     //         System.out.println
     //             ("Animal constructor called");
     //    }
     //    Create an object of the ToyCat classes
     //   call the default constructor
     //   What will be the output?
     //   Can you explain how why the output
     //  appears as displayed?
     
  }
}