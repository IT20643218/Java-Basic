class Person {
    //attribute
    protected String name;
    protected String mobileNo;

    //default constructor
    public Person() {
        mobileNo = "071xxxxxxxx";
        name = "";
    }
    //overlorded constructor
    public Person(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }
    //geter for name
    public String getName() {
        return this.name;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //geter for mobile
    public String getMobileNo() {
        return this.mobileNo;
    }
    //setter for mobile number
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    //display super class attribute
    public void display() {
        System.out.println("Name = " + this.name + ", Mobile No = " + this.mobileNo);
    }
}

//child class
class Student extends Person {
    //child class attribute
    protected int studentId;
    protected float gpa;


    public Student() {
        gpa = 2.0f;
    }

    public Student(int studentId, String name, String mobileNo, float gpa) {
        super(name, mobileNo);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return this.studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public float getGpa() {
        return this.gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void display() {
        super.display();
        System.out.println("Student Id = " + this.studentId + ", GPA = " + this.gpa);
    }
    public void displayClass() {
        if (gpa < 3 )
            System.out.println("Pass");
        else
            System.out.println("You have graduated with a class");
    }
}

class Main {
    public static void main(String[] args){
        Student std;
        std = new Student(100, "Geetha", "0782343322", 3.2f);
        std.display();
        std.displayClass();
        System.out.println("******************");
        //Superclass x = new Superclass();
        //Superclass y = new Subclass();

        Person p;
        //Student p;
        p = new Student(10, "Namalie", "077623232", 3.1f);
        p.display();
        Student s = (Student) p;
        s.displayClass();
        //p.displayClass();
        //Subclass z = (Subclass) [super class variable]
        //Student s = (Student) p;
        //s.displayClass();
    }
}