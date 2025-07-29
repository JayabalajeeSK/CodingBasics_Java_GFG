package Rec.Part1;
public class R5_NestedRecursion {
    static int nested(int n) {
        if (n > 100)
            return n - 10;
        return nested(nested(n + 11)); // recursion inside recursion
    }

    public static void main(String[] args) {
        System.out.println(nested(95));
    }
}
// 95
