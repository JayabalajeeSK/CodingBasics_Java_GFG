package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StringPrograms 
{
    public static void getCharAt(String str, int index) 
    {
        System.out.println("Character at index " + index + ": " + str.charAt(index));
    }
// String sample = "The quick brown fox jumps over the lazy dog";
// Character at index 5: u

    public static void replaceCharAt(String str, int index, char ch) 
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, ch);
        System.out.println("After replace: " + sb.toString());
    }
// (sample, 4, 'Z');
// After replace: The Zuick brown fox jumps over the lazy dog

    public static void reverseString(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: " + sb.reverse());
    }
// Reversed using stack: god yzal eht revo spmuj xof nworb kciuq ehT

    public static void reverseUsingStack(String str) 
    {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println("Reversed using stack: " + sb.toString());
    }
// Reversed using stack: god yzal eht revo spmuj xof nworb kciuq ehT

    public static void sortString(String str) 
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted: " + new String(arr));
    }
// dcba
// Sorted: abcd

    public static void swapPairs(String str) 
    {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i = i+ 2) 
        {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("Swapped pairs: " + new String(arr));
    }
// abcdef
// Swapped pairs: badcfe

    public static void isPangram(String str) 
    {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) set.add(ch);
        System.out.println(set.size() == 26 ? "Pangram" : "Not Pangram");
    }
// String sample = "The quick brown fox jumps over the lazy dog";
//Pangram

    public static void printFirstLetters(String str) 
    {
        String[] words = str.trim().split("\\s+");
        for (String word : words) System.out.print(word.charAt(0));
        System.out.println();
    }
// Tqbfjotld

    public static void unicodeAt(String str, int index) 
    {
        System.out.println("Unicode of character at index " + index + ": " + str.codePointAt(index));
    }
// Unicode of character at index 0: 84

    public static void removeLeadingZeros(String str) 
    {
        System.out.println("Removed leading zeros: " + str.replaceFirst("^0+", ""));
    }
// 00012345
// Removed leading zeros: 12345
    public static void removeInbetweenZeros(String str) 
    {
        System.out.println("Removed in-between zeros: " + str.replaceAll("(?<=\\d)0+(?=\\d)", ""));
    }
// 1020304050
// Removed in-between zeros: 123450
    public static void removeTrailingZeros(String str) 
    {
        System.out.println("Removed trailing zeros: " + str.replaceFirst("0+$", ""));
    }
// 1234000
// Removed trailing zeros: 1234
    public static void removeAllZeros(String str) 
    {
        System.out.println("Removed all zeros: " + str.replace("0", ""));
    }
// 1020304050
// Removed all zeros: 12345

    public static void compareStrings(String a, String b) 
    {
        System.out.println("Equal? " + a.equals(b));
    }
// ("hello", "Hello")
// Equal? false

    public static void lexicographicCompare(String a, String b) 
    {
        System.out.println("Lexicographic compare result: " + a.compareTo(b));
    }
// ("apple", "banana")
// Lexicographic compare result: -1

    public static void evenLengthWords(String str) 
    {
        for (String word : str.split(" ")) 
        {
            if (word.length() % 2 == 0) System.out.print(word + " ");
        }
        System.out.println();
    }
// over lazy

    public static void insertString(String main, String insert, int position) 
    {
        StringBuilder sb = new StringBuilder(main);
        sb.insert(position, insert);
        System.out.println("After insertion: " + sb.toString());
    }
// ("HelloWorld", "Java", 5)
// After insertion: HelloJavaWorld

    public static void splitIntoSubstrings(String str, int length) 
    {
        for (int i = 0; i < str.length(); i = i+length) 
        {
            System.out.println(str.substring(i, Math.min(str.length(), i + length)));
        }
    }
// Hel
// loW
// orl
// d
}