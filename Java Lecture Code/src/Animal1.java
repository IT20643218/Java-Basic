/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :;
 * @since :;
 **/

//animal class
public class Animal1 {

    public Animal1(String no_name) {
    }
    //speak method
    public void speak() {
        System.out.println("This is parent Animal class");
    }
}

//Cat
class Cat extends Animal1{

    public Cat(String micky_the_cat) {
        super(micky_the_cat);
    }
    //speak method
    public void speak(){
        System.out.println("Meow....Meow....");
    }
}

//Dog
class Dog extends Animal1{

    public Dog(String rover_the_dog) {
        super(rover_the_dog);
    }
    //speak method
    public void speak(){
        System.out.println("Bow....Bow....");
    }
}

//Cow
class Cow extends Animal1{

    public Cow(String roo_the_cow) {
        super(roo_the_cow);
    }
    //speak method
    public void speak(){
        System.out.println("Moo...Moo...");
    }
}

//Main App
class Animal1App{
    public static void main(String[] args){
        Animal1 ani[] = new Animal1[4];
        ani[0] = new Cat("Micky the Cat");
        ani[1] = new Dog("Rover the Dog");
        ani[2] = new Cow("Roo the Cow");
        ani[3] = new Animal1("no name");
        for (int r=0;r<4;r++)
            ani[r].speak();
    }
}
