package MethodProgram;

public class MethodProgram {

    // 1. Main() Method - Entry point of the program
    public static void main(String[] args) 
    {
        staticMethod(); // Call static method directly

        MethodProgram obj = new MethodProgram(); // Create object to call non-static method
        obj.nonStaticMethod(); // Call non-static method

        useForEach();           // Demonstrates for-each loop

        useToString();          // Demonstrates toString() method

        useCodePointAt();       // Demonstrates codePointAt() method

        useCompare();           // Demonstrates compareTo() method

        useEquals();            // Demonstrates equals() and equalsIgnoreCase() methods

        useHasNextAndNext();    // Demonstrates hasNext() and next() using Scanner

        useThreadByExtending(); // Demonstrates thread using Thread class

        useThreadByRunnable();  // Demonstrates thread using Runnable interface

        threadLifecycle();      // Demonstrates thread lifecycle and states
    }

    // 2. Static Method - Can be called without object creation
    public static void staticMethod() 
    {
        System.out.println("This is a static method.");
    }
// This is a static method.

    // 3. Non-Static Method - Requires object to be called
    public void nonStaticMethod() 
    {
        System.out.println("This is a non-static method.");
    }
// This is a non-static method.

    // 4. forEach() Method - Iterating over array elements using enhanced for loop
    public static void useForEach() 
    {
        System.out.println("Using forEach method:");
        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }
    }
// Using forEach method:
// Apple
// Banana
// Mango

    // 5. toString() Method - Returns string representation of an object
    public static void useToString() 
    {
        MethodProgram obj = new MethodProgram();
        System.out.println("Using toString: " + obj.toString()); // Default toString from Object class
    }
// Using toString: MethodProgram.MethodProgram@36baf30c

    // 6. codePointAt() Method - Returns Unicode code point at the specified index
    public static void useCodePointAt() 
    {
        String str = "Hello";
        int codePoint = str.codePointAt(1); // Gets code point of 'e'
        System.out.println("Unicode of 'e': " + codePoint);
    }
// Unicode of 'e': 101

    // 7. compare() Method - Lexicographically compares two strings
    public static void useCompare() 
    {
        String s1 = "apple";
        String s2 = "banana";
        System.out.println("Compare result: " + s1.compareTo(s2)); // Returns negative if s1 < s2
    }
// Compare result: -1

    // 8. equals() Method - Compares two strings for equality
    public static void useEquals() 
    {
        String a = "Hello";
        String b = "hello";
        System.out.println("Equals: " + a.equals(b));               // Case-sensitive comparison
        System.out.println("EqualsIgnoreCase: " + a.equalsIgnoreCase(b)); // Case-insensitive
    }
// Compare result: -1
// EqualsIgnoreCase: true

    // 9. hasNext() and next() - Reading words from a string using Scanner
    public static void useHasNextAndNext() 
    {
        java.util.Scanner sc = new java.util.Scanner("one two three");
        System.out.println("Using hasNext and next:");
        while (sc.hasNext()) 
        { // Checks if there is another word
            System.out.println(sc.next()); // Reads the next word
        }
        sc.close(); // Always close Scanner to avoid resource leaks
    }
// Using hasNext and next:
// one
// two
// three

    // 10. Create Thread using Thread class - By extending Thread
    public static void useThreadByExtending() 
    {
        System.out.println("Thread by extending Thread class:");
        MyThread t = new MyThread();
        t.start(); // Starts the new thread which will call run()
    }

    // Custom thread class extending Thread
    static class MyThread extends Thread 
    {
        public void run() 
        {
            System.out.println("Running thread from Thread class.");
        }
    }

    // 11. Create Thread using Runnable interface - More flexible way
    public static void useThreadByRunnable() {
        System.out.println("Thread by implementing Runnable:");
        Thread t = new Thread(new MyRunnable());
        t.start(); // Starts the thread
    }

    // Runnable implementation class
    static class MyRunnable implements Runnable 
    {
        public void run() 
        {
            System.out.println("Running thread from Runnable interface.");
        }
    }

    // 12. Thread Lifecycle Methods - Demonstrates states of a thread
    public static void threadLifecycle() 
    {
        // Creating a thread using lambda expression
        Thread t = new Thread(() -> 
        {
            try 
            {
                System.out.println("Thread running.");
                Thread.sleep(500); // Simulate delay
                System.out.println("Thread woke up.");
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread interrupted.");
            }
        });

        System.out.println("Thread state before start: " + t.getState()); // NEW
        t.start(); // Starts the thread
        try 
        {
            Thread.sleep(100); // Delay to allow thread to enter RUNNABLE
            System.out.println("Thread state after start: " + t.getState()); // RUNNABLE
            t.join(); // Wait for thread to finish
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Thread state after complete: " + t.getState()); // TERMINATED
    }
}
// Thread by extending Thread class:

// Thread by implementing Runnable:

// Running thread from Thread class.


// Running thread from Runnable interface.

// Thread state before start: NEW
// Thread running.

// Thread state after start: TIMED_WAITING
// Thread woke up.

// Thread state after complete: TERMINATED
