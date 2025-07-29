package Rec.Part1;

public class R8_FibonacciRecursion {
    static int fib(int n) {
        if (n == 0)
            return 0; // base case 1
        if (n == 1)
            return 1; // base case 2
        return fib(n - 1) + fib(n - 2); // recursive calls
    }

    public static void main(String[] args) {
        int n = 7; // print 0 to n-1 terms
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

// Fibonacci series: 0 1 1 2 3 5 8 