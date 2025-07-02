package Top20Programs;

import java.util.Scanner;

public class Top20JavaProgramsRunner extends Top20JavaPrograms
{
        public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        fibonacci(10);
        // Fibonacci Series: 0 1 1 2 3 5 8 13 21 34

        isPrime(17);
        // 17 is a Prime Number
        printNPrimes(5);
        // First 5 prime numbers:2 3 5 7 11

        factorial(5);
        // Factorial: 120

        isPalindrome(121);
        // 121 is a Palindrome
        isPalindrome("Jaya");
        // Jaya is not a Palindrome

        isArmstrong(153);
        // 153 is an Armstrong Number

        swap(5, 10);
        // Before Swap: a = 5, b = 10
        // After Swap: a = 10, b = 5

        reverseString("hello");
        // Reversed String: olleh
        reverseNumber(1234);
        // Reversed Number: 4321

        minMaxArray(new int[]{4, 2, 9, 1});
        // Max: 9, Min: 1

        bubbleSort(new int[]{5, 3, 8, 1});
        // Sorted Array: [1, 3, 5, 8]

        countVowels("Java Programming");
        // Vowels: 5, Consonants: 10

        checkEvenOdd(6);
        // 6 is Even

        isLeapYear(2024);
        // 2024 is a Leap Year

        sumOfDigits(123);
        // Sum of Digits: 6

        starPattern(5);
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        countChar("programming", 'g');
        // Count of 'g': 2

        isAnagram("listen", "silent");
        // Anagram

        findDuplicates(new int[]{1, 2, 3, 2, 4, 1});
        // Duplicates: [1, 2]

        binarySearch(new int[]{11, 1, 6, 4, 8, 2},11);
        // Found at index: 2

        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        matrixAddition(mat1, mat2);
        // [6, 8]
        // [10, 12]

        scanner.close();
    }
    
}
