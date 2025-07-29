package Rec.Part1;

public class R1_RecursionExample {
    static void printNumbers(int n) {
        if(n > 5) {
            return; // Base Case - stop condition
        }
        System.out.println(n); // Work
        printNumbers(n + 1);   // Recursive Call
    }

    public static void main(String[] args) {
        printNumbers(1); // Start from 1
    }
}
// 1
// 2
// 3
// 4
// 5
