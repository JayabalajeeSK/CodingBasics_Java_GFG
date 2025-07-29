package Rec.Part1;


public class R2_TailRecursion {
    static void tail(int n) {
        if (n == 0) return; // base case
        System.out.println(n);
        tail(n - 1); // last action → recursive call
    }

    public static void main(String[] args) {
        tail(5);
    }
}
// 5
// 4
// 3
// 2
// 1