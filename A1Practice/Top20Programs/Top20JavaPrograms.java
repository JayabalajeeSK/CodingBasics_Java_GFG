package Top20Programs;

import java.util.*;

public class Top20JavaPrograms 
{

    // 1. Fibonacci Series -----------------------------------
    public static void fibonacci(int n) 
    {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) 
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    // Fibonacci Series: 0 1 1 2 3 5 8 13 21 34

    // 2. Prime Number Check -----------------------------------
    public static boolean checkPrime(int num) 
    {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Checks and prints if a number is prime (used when you want output)
    public static boolean isPrime(int num) 
    {
        boolean result = checkPrime(num);
        System.out.println(num + (result ? " is a Prime Number" : " is not a Prime Number"));
        return result;
    }
    // 17 is a Prime Number

    // Prints the first n prime numbers (silently)
    public static void printNPrimes(int n) 
    {
        int count = 0;
        int number = 2;
        System.out.print("First " + n + " prime numbers: ");
        while (count < n) 
        {
            if (checkPrime(number)) 
            {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
    // First 5 prime numbers: 2 3 5 7 11

    // 3. Factorial of a Number -----------------------------------
    public static void factorial(int n) 
    {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact = fact * i;
        System.out.println("Factorial: " + fact);
    }

    // 4. Palindrome Check (number, number) -----------------------------------
    public static void isPalindrome(int n) 
    {
        int rev = 0, temp = n;
        while (n != 0) 
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(temp + (temp == rev ? " is a Palindrome" : " is not a Palindrome"));
    }
    //--
    public static void isPalindrome(String str) 
    {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str + (str.equals(reversed) ? " is a Palindrome" : " is not a Palindrome"));
    }

    // 5. Armstrong Number Check -----------------------------------
    public static void isArmstrong(int n) 
    {
        int temp = n, sum = 0;
        int len = String.valueOf(n).length();
        while (n > 0) 
        {
            int digit = n % 10;
            sum = (int) (sum + Math.pow(digit, len));
            n = n/10;
        }
        System.out.println(temp + (temp == sum ? " is an Armstrong Number" : " is not an Armstrong Number"));
    }

    // 6. Swap Two Numbers (without temp) -----------------------------------
    public static void swap(int a, int b) 
    {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // 7. Reverse a String -----------------------------------
    public static void reverseString(String str) 
    {
        // StringBuilder sb = new StringBuilder(str);
        // System.out.println("Reversed String: " + sb.reverse());

        String revered = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + revered);
        
    }

    // 8. Reverse a Number -----------------------------------
    public static void reverseNumber(int n) 
    {
        int rev = 0;
        while (n != 0) 
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    // 9. Find Largest/Smallest in Array -----------------------------------
    public static void minMaxArray(int[] arr) 
    {
        
        int min = arr[0], max = arr[0];
        for (int num : arr) 
        {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min); //Max: 9, Min: 1
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + ", Max: " + arr[arr.length-1]); //Min: 1, Max: 9

    }

    // 10. Bubble Sort -----------------------------------
    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // 11. Count Vowels and Consonants -----------------------------------
    public static void countVowels(String str) 
    {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // 12. Check Even or Odd -----------------------------------
    public static void checkEvenOdd(int n) 
    {
        System.out.println(n + (n % 2 == 0 ? " is Even" : " is Odd"));
    }

    // 13. Check Leap Year -----------------------------------
    public static void isLeapYear(int year) 
    {
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (leap ? " is a Leap Year" : " is not a Leap Year"));
    }

    // 14. Sum of Digits -----------------------------------
    public static void sumOfDigits(int n) 
    {
        int sum = 0;
        while (n != 0) 
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    // 15. Print Star Pattern -----------------------------------
    public static void starPattern(int rows) 
    {
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) System.out.print(i+""+j+" "); //* */
            System.out.println();
        }
    }

    // 16. Count Occurrences of Character -----------------------------------
    public static void countChar(String str, char ch) 
    {
        int count = 0;
        for (char c : str.toCharArray()) 
        {
            if (c == ch) count++;
        }
        System.out.println("Count of '" + ch + "': " + count);
    }

    // 17. Check Anagram -----------------------------------
    public static void isAnagram(String s1, String s2) 
    {
        //char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a1 = s1.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");
    }

    // 18. Find Duplicates in Array -----------------------------------
    public static void findDuplicates(int[] arr) 
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupes = new HashSet<>();
        for (int n : arr) 
        {
            if (!seen.add(n)) dupes.add(n);
        }
        System.out.println("Duplicates: " + dupes);

        Set<Integer> dupeRemoved = new HashSet<>();
        for (int n : arr) 
        {
            dupeRemoved.add(n);
        }
        System.out.println(dupeRemoved);
    }

    // 19. Binary Search -----------------------------------
    public static void binarySearch(int[] arr, int key) 
    {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) 
            {
                System.out.println("Found at index: " + mid);
                return;
            } 
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Not Found");
    }

    // 20. Matrix Addition -----------------------------------
    public static void matrixAddition(int[][] a, int[][] b) 
    {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Matrix Addition Result:");
        for (int[] row : result) System.out.println(Arrays.toString(row));
    }

    // Main Method
}