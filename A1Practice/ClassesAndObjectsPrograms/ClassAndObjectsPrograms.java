package ClassesAndObjectsPrograms;

public class ClassAndObjectsPrograms 
{

    // Class and Object - Blueprint and instance of class
    static class Student 
    {
        String name;
        int age;

        void display() 
        {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Abstract Class - Can't be instantiated; used for base definition
    abstract static class Animal 
    {
        abstract void sound(); // Abstract method must be implemented by child class
    }

    static class Dog extends Animal 
    {
        void sound() 
        {
            System.out.println("Dog barks");
        }
    }

    // Singleton Class - Only one object is allowed for the class
    static class Singleton 
    {
        private static Singleton instance;

        private Singleton() {} // Private constructor

        public static Singleton getInstance() 
        {
            if (instance == null) 
            {
                instance = new Singleton(); // Object created once
            }
            return instance;
        }

        public void show() 
        {
            System.out.println("Singleton instance called");
        }
    }

    // Interface - Only method declaration; implementation done in child class
    interface Vehicle 
    {
        void run(); // No body here
    }

    static class Car implements Vehicle 
    {
        public void run() 
        {
            System.out.println("Car is running"); // Body provided
        }
    }

    // Encapsulation - Binding data and methods using private with getter/setter
    static class Person 
    {
        private String name; // Data hidden

        public String getName() 
        {
            return name;
        }

        public void setName(String name) 
        {
            this.name = name;
        }
    }

    // Inheritance - One class gets the properties of another
    static class A 
    {
        void showA() 
        {
            System.out.println("Class A");
        }
    }

    static class B extends A 
    {
        void showB() 
        {
            System.out.println("Class B");
        }
    }

    // Data Hiding - Sensitive data hidden using private keyword
    static class BankAccount 
    {
        private double balance = 1000; // Only accessible via methods

        public double getBalance() 
        {
            return balance;
        }

        public void deposit(double amount) 
        {
            balance += amount;
        }
    }

    // Polymorphism - Method Overloading (same method, different parameters)
    static class Calculator 
    {
        int add(int a, int b) 
        {
            return a + b;
        }

        double add(double a, double b) 
        {
            return a + b;
        }
    }

    // Polymorphism - Method Overriding (child class redefines parent method)
    static class Parent 
    {
        void greet() {
            System.out.println("Hello from Parent");
        }
    }

    static class Child extends Parent 
    {
        void greet() 
        {
            System.out.println("Hello from Child"); // Overriding
        }
    }

    // Super Keyword - Calls parent class method or constructor
    static class SuperParent 
    {
        void greet() 
        {
            System.out.println("Hello from SuperParent");
        }
    }

    static class SuperChild extends SuperParent 
    {
        void greet() 
        {
            super.greet(); // Call to parent method
            System.out.println("Hello from SuperChild");
        }
    }

    // This Keyword - Refers to current class object
    static class ThisExample 
    {
        int x;

        ThisExample(int x) 
        {
            this.x = x; // this.x refers to current object’s x
        }

        void show() 
        {
            System.out.println("Value: " + this.x);
        }
    }

    // Static Keyword - Belongs to class, shared among all objects
    static class StaticExample 
    {
        static int count = 0; // Shared variable

        StaticExample() 
        {
            count++;
            System.out.println("Object count: " + count);
        }
    }

    // Access Modifiers - Control visibility of data/methods
    static class AccessDemo 
    {
        public int pub = 1;      // Accessible everywhere
        protected int prot = 2;  // Accessible in same package + subclass
        int def = 3;             // Default: accessible in same package only
        private int priv = 4;    // Accessible within class only

        public void showAccess() 
        {
            System.out.println("public: " + pub);
            System.out.println("protected: " + prot);
            System.out.println("default: " + def);
            System.out.println("private: " + priv);
        }
    }
}
