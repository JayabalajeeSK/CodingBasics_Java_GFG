package ExceptionAndError;

public class ExceptionAndErrorPrograms {

    // 1. Show Runtime Exceptions
    public static void runtimeExceptionDemo() 
    {
        try 
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } 
        catch (RuntimeException e) 
        {
            System.out.println("Runtime Exception: " + e);
        }
    }
// 1. Runtime Exception:
// Runtime Exception: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

    // 2. Show Types of Errors
    public static void typesOfErrorsDemo() 
    {
        // Compile-time error: Uncommenting this line causes error
        // int x = "abc"; // Type mismatch

        try 
        {
            String s = null;
            s.length(); // NullPointerException
        } 
        catch (Error | Exception e) 
        {
            System.out.println("Caught error or exception: " + e);
        }
    }
// 2. Types of Errors:
// Caught error or exception: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

    // 3. Exception Hierarchy
    public static void exceptionHierarchyDemo() 
    {
        try 
        {
            throw new IllegalArgumentException("Invalid Argument");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Caught: " + e.getClass().getSuperclass().getSimpleName() + " → " + e.getClass().getSimpleName());
        }
    }
// 3. Exception Hierarchy:
// Caught: RuntimeException ? IllegalArgumentException

    // 4. Exception Methods
    public static void exceptionMethodsDemo() 
    {
        try 
        {
            throw new ArithmeticException("Divide by zero");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Class: " + e.getClass().getName());
            e.printStackTrace(System.out);
        }
    }
// 4. Exception Methods:
// Message: Divide by zero
// Class: java.lang.ArithmeticException
// java.lang.ArithmeticException: Divide by zero
//         at ExceptionAndError.ExceptionAndError.exceptionMethodsDemo(ExceptionAndError.java:40)
//         at ExceptionAndError.ExceptionAndError.main(ExceptionAndError.java:127)

    // 5. Checked Exception (FileNotFound)
    public static void checkedExceptionDemo() 
    {
        try 
        {
            java.io.FileReader file = new java.io.FileReader("nofile.txt"); // FileNotFoundException
        } 
        catch (java.io.FileNotFoundException e) 
        {
            System.out.println("Checked Exception: " + e);
        }
    }
// 5. Checked Exception:
// Checked Exception: java.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)

    // 6. Unchecked Exception (Divide by zero)
    public static void uncheckedExceptionDemo() 
    {
        try 
        {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Unchecked Exception: " + e);
        }
    }
// 6. Unchecked Exception:
// Unchecked Exception: java.lang.ArithmeticException: / by zero

    // 7. Multiple Exceptions
    public static void multipleExceptionsDemo() 
    {
        try 
        {
            int a = 10 / 0;
            int[] b = new int[2];
            System.out.println(b[5]);
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught Multiple Exception: " + e);
        }
    }
// 7. Multiple Exceptions:
// Caught Multiple Exception: java.lang.ArithmeticException: / by zero

    // 8. Unreachable Code Error (compile-time error, shown logically)
    public static void unreachableCodeDemo() 
    {
        System.out.println("Unreachable code example:");
        System.out.println("Code after return or System.exit is unreachable (not executed)");
        // Example:
        // if (true) return;
        // System.out.println("This is unreachable"); // compile-time error
    }
// 8. Unreachable Code:
// Unreachable code example:
// Code after return or System.exit is unreachable (not executed)

    // 9. Thread Interface & Memory Consistency Error (simple demo)
    public static void memoryConsistencyDemo() 
    {
        class SharedObject 
        {
            boolean flag = false;
        }

        SharedObject shared = new SharedObject();

        Thread writer = new Thread(() -> {
            shared.flag = true;
            System.out.println("Writer: flag set to true");
        });

        Thread reader = new Thread(() -> {
            while (!shared.flag) {
                // busy wait
            }
            System.out.println("Reader: flag read as true");
        });

        writer.start();
        reader.start();
        try 
        {
            writer.join();
            reader.join();
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted");
        }
    }
// 9. Thread Interface & Memory Consistency:
// Writer: flag set to true
// Reader: flag read as true

    public static void main(String[] args) {
        System.out.println("1. Runtime Exception:");
        runtimeExceptionDemo();

        System.out.println("\n2. Types of Errors:");
        typesOfErrorsDemo();

        System.out.println("\n3. Exception Hierarchy:");
        exceptionHierarchyDemo();

        System.out.println("\n4. Exception Methods:");
        exceptionMethodsDemo();

        System.out.println("\n5. Checked Exception:");
        checkedExceptionDemo();

        System.out.println("\n6. Unchecked Exception:");
        uncheckedExceptionDemo();

        System.out.println("\n7. Multiple Exceptions:");
        multipleExceptionsDemo();

        System.out.println("\n8. Unreachable Code:");
        unreachableCodeDemo();

        System.out.println("\n9. Thread Interface & Memory Consistency:");
        memoryConsistencyDemo();
    }
}
// 1. Runtime Exception:
// Runtime Exception: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

// 2. Types of Errors:
// Caught error or exception: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

// 3. Exception Hierarchy:
// Caught: RuntimeException ? IllegalArgumentException

// 4. Exception Methods:
// Message: Divide by zero
// Class: java.lang.ArithmeticException
// java.lang.ArithmeticException: Divide by zero
//         at ExceptionAndError.ExceptionAndError.exceptionMethodsDemo(ExceptionAndError.java:40)
//         at ExceptionAndError.ExceptionAndError.main(ExceptionAndError.java:127)

// 5. Checked Exception:
// Checked Exception: java.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)

// 6. Unchecked Exception:
// Unchecked Exception: java.lang.ArithmeticException: / by zero

// 7. Multiple Exceptions:
// Caught Multiple Exception: java.lang.ArithmeticException: / by zero

// 8. Unreachable Code:
// Unreachable code example:
// Code after return or System.exit is unreachable (not executed)

// 9. Thread Interface & Memory Consistency:
// Writer: flag set to true
// Reader: flag read as true