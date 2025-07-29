package Rec.Part1;

public class R10_SumOfFibonacciDP {
    static int[] dp;

    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dp[n] != -1) // already computed
            return dp[n];

        dp[n] = fib(n - 1) + fib(n - 2); // store result
        return dp[n];
    }

    static int sumFib(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += fib(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1; // initialize array
        }

        System.out.println("Sum of first " + (n + 1) + " Fibonacci numbers is: " + sumFib(n));
    }
}

// Sum of first 11 Fibonacci numbers is: 143