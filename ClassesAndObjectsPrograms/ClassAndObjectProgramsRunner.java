package ClassesAndObjectsPrograms;

public class ClassAndObjectProgramsRunner extends ClassAndObjectsPrograms
{
    public static void main(String[] args) 
    {
        // Class & Object
        Student s = new Student();
        s.name = "John";
        s.age = 20;
        s.display(); //Name: John, Age: 20

        // Abstract Class
        Animal d = new Dog();
        d.sound(); //Dog barks

        // Singleton
        Singleton.getInstance().show(); //Singleton instance called

        // Interface
        Vehicle v = new Car();
        v.run(); //Car is running

        // Encapsulation
        Person p = new Person();
        p.setName("Ravi");
        System.out.println("Encapsulated Name: " + p.getName()); //Encapsulated Name: Ravi

        // Inheritance
        B bObj = new B();
        bObj.showA(); //Class A
        bObj.showB(); //Class B

        // Data Hiding
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance()); //Balance: 1500.0

        // Polymorphism - Overloading
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(3, 4)); //Add int: 7
        System.out.println("Add double: " + calc.add(2.5, 3.5)); //Add double: 6.0

        // Polymorphism - Overriding
        Parent parent = new Child(); //
        parent.greet(); // Hello from Child
 
        // Super Keyword
        SuperChild sc = new SuperChild();
        sc.greet(); // Hello from SuperParent

        // This Keyword
        ThisExample te = new ThisExample(42);
        te.show();  // Hello from SuperChild

        // Static Keyword
        new StaticExample(); //Object count: 1
        new StaticExample(); //Object count: 2

        // Access Modifiers
        AccessDemo ad = new AccessDemo();
        ad.showAccess(); 
        // public: 1
        // protected: 2
        // default: 3
        // private: 4
    }
    
}
// Class & Object	- Class is a template, Object is an instance of that template
// Abstract Class	- Can't be instantiated; must be extended and methods implemented
// Singleton	    - Design pattern that allows only one object of a class
// Interface	    - Blueprint of class with only method declarations
// Encapsulation	- Wrapping data using private fields and public methods
// Inheritance	    - Child class reuses fields/methods of parent class
// Data Hiding	    - Hiding internal class details using private
// Polymorphism	    - Same method behaving differently - overloading & overriding
// Super Keyword	- Used to call parent class methods or constructors
// This Keyword	    - Refers to current object of the class
// Static Keyword	- Belongs to the class, not object
// Access Modifiers	- Defines visibility (public, private, protected, default)