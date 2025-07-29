package Rec.Part1;

public class R9_SumOfFibonacci {
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static int sumFib(int n) {
        if (n == 0) return 0;
        return fib(n) + sumFib(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + (n + 1) + " Fibonacci numbers is: " + sumFib(n));
    }
}
// Sum of first 6 Fibonacci numbers is: 12