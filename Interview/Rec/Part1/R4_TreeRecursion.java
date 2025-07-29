package Rec.Part1;

public class R4_TreeRecursion {
    static void tree(int n) {
        if (n == 0) return;
        System.out.println(n);
        tree(n - 1);  // first recursive call
        tree(n - 1);  // second recursive call
    }

    public static void main(String[] args) {
        tree(3);
    }
}
// 3
// 2
// 1
// 1
// 2
// 1
// 1