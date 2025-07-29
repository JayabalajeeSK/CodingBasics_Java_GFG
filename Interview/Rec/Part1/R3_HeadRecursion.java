package Rec.Part1;

public class R3_HeadRecursion {
    static void head(int n) {
        if (n == 0) return;
        head(n - 1);           // recursive call first
        System.out.println(n); // action after recursion
    }

    public static void main(String[] args) {
        head(5);
    }
}
// 1
// 2
// 3
// 4
// 5
