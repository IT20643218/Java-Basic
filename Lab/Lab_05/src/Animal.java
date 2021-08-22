// Lab Sheet on Abstract Classes
// Starter Code

class Animal {
   private String name;
   public Animal(String name) {
       this.name = name;
   }
  public String speak() {
      return "";
  }
  public void display() {
      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
  }
}

class Dog extends Animal {
   public Dog(String name) {
      super(name);
   }
   public String speak() {
       return "Bow Wow";
   }
}

class Cat extends Animal {
  public Cat(String name) {
      super(name);
   }
  public String speak() {
      return "Meow Meow";
  }
}

class ToyCat extends Cat {
  String manufacturer;
  
  
  public ToyCat(String name, String manufacturer) {
     super(name);
     this.manufacturer = manufacturer;
  }
  public void display() {
     super.display();
     System.out.println("I am from " + manufacturer + ".");
  }
}

