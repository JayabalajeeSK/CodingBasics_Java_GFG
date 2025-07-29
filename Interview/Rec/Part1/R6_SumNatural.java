package Rec.Part1;

public class R6_SumNatural {
    static int sum(int n) {
        if (n == 1) // base case
            return 1;
        return sum(n - 1) + n; // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }
}
// Sum of first 5 natural numbers is: 15
