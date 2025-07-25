


import java.util.*;

public class OccuranceOfAcharacterString {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Str: ");
        String input = scanner.nextLine(); // Only once

        input = input.toLowerCase();

        int[] charFrq = new int[256];
        char[] chars = input.toCharArray(); // Fixed line

        for (char c : chars) {
            charFrq[c]++;
        }

        System.out.println("Character occurrence:");
        boolean[] printed = new boolean[256];

        for (char c : chars) {
            if (!printed[c] && c != ' ') {
                System.out.println(c + ": " + charFrq[c]);
                printed[c] = true;
            }
        }

        scanner.close();
    }
}
