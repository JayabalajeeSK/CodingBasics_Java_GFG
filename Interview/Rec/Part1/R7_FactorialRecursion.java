package Rec.Part1;

public class R7_FactorialRecursion {
    static int factorial(int n) {
        if (n == 1) // base case
            return 1;
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
// Factorial of 5 is: 120
