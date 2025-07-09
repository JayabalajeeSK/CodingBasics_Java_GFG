package TopNext20Programs;

import java.util.*;

public class TopNext20Programs {

    static Scanner sc = new Scanner(System.in); // Common Scanner

    // 1. Read Number from Input
    static void readNumber() 
    {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
// Enter a number: 25
// You entered: 25

    // 2. Multiply Two Floating-Point Numbers
    static void multiplyFloat() 
    {
        System.out.print("Enter two float numbers: ");
        float a = sc.nextFloat(), b = sc.nextFloat();
        System.out.println("Product: " + (a * b));
    }
// Enter two float numbers: 2.5 4.2
// Product: 10.5

    // 3. Add Two Binary Strings
    static void addBinaryStrings() 
    {
        System.out.print("Enter two binary strings: ");
        String b1 = sc.next(), b2 = sc.next();
        int sum = Integer.parseInt(b1, 2) + Integer.parseInt(b2, 2);
        System.out.println("Sum (Binary): " + Integer.toBinaryString(sum));
    }
// Enter two binary strings: 1010 1100
// Sum (Binary): 10110

    // 4. Add Two Complex Numbers
    static void addComplexNumbers() 
    {
        System.out.print("Enter a, b, c, d (for a+bi and c+di): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.println("Sum: " + (a + c) + " + " + (b + d) + "i");
    }
// Enter a, b, c, d (for a+bi and c+di): 3 4 5 6
// Sum: 8 + 10i

    // 5. Find Largest, Nth Largest, Nth Smallest
    static void findNthLargestSmallest() 
    {
        System.out.print("Enter count N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Largest: " + arr[n - 1]);
        System.out.print("Enter position for Nth largest/smallest: ");
        int pos = sc.nextInt();
        if (pos <= n) 
        {
            System.out.println("Nth Largest: " + arr[n - pos]);
            System.out.println("Nth Smallest: " + arr[pos - 1]);
        } 
        else 
        {
            System.out.println("Invalid position");
        }
    }
// Enter count N: 5
// Enter elements:
// 12 45 2 33 5
// Largest: 45
// Enter position for Nth largest/smallest: 2
// Nth Largest: 33
// Nth Smallest: 5

    // 6. LCM of N Numbers
    static void findLCMofN() 
    {
        System.out.print("Enter count for LCM: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int lcm = arr[0];
        for (int i = 1; i < n; i++) 
        {
            lcm = lcm(lcm, arr[i]);
        }
        System.out.println("LCM: " + lcm);
    }
// Enter count for LCM: 4
// Enter elements:
// 4 6 8 12
// LCM: 24

    static int lcm(int a, int b) 
    {
        return a * b / gcd(a, b);
    }

    // 7. GCD or HCF of N Numbers
    static void findGCDofN() 
    {
        System.out.print("Enter count for GCD: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int hcf = arr[0];
        for (int i = 1; i < n; i++) 
        {
            hcf = gcd(hcf, arr[i]);
        }
        System.out.println("GCD/HCF: " + hcf);
    }

    static int gcd(int a, int b) 
    {
        return b == 0 ? a : gcd(b, a % b);
    }
// Enter count for GCD: 3
// Enter elements:
// 36 60 24
// GCD/HCF: 12

    // 8. Check Armstrong Numbers between Two Integers
    static void armstrongInRange() {
        System.out.print("Enter start and end range: ");
        int start = sc.nextInt(), end = sc.nextInt();
        System.out.print("Armstrong Numbers: ");
        for (int i = start; i <= end; i++) 
        {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
// Enter start and end range: 100 500
// Armstrong Numbers: 153 370 371 407 

    static boolean isArmstrong(int n) 
    {
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) 
        {
            sum = (int) (sum + Math.pow(n % 10, digits));
            n /= 10;
        }
        return sum == temp;
    }

    // 9. Check if a Number is Neon Number
    static void checkNeon() 
    {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num, sum = 0;
        while (square > 0) 
        {
            sum = sum + square % 10;
            square /= 10;
        }
        System.out.println(num + (sum == num ? " is Neon Number" : " is not Neon Number"));
    }
// Enter a number: 9
// 9 is Neon Number

    // 10. Calculate Simple Interest
    static void calculateSimpleInterest() 
    {
        System.out.print("Enter Principal, Rate, Time: ");
        float p = sc.nextFloat(), r = sc.nextFloat(), t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
// Enter Principal, Rate, Time: 10000 5 2
// Simple Interest: 1000.0

    // 11. Calculate Compound Interest
    static void calculateCompoundInterest() 
    {
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest: " + ci);
    }
// Enter Principal, Rate, Time: 10000 5 2
// Compound Interest: 1025.0

    // 12. Rectangle Calculations (Area, Perimeter)
    static void rectangleCalc() 
    {
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Area: " + (l * b));
        System.out.println("Perimeter: " + (2 * (l + b)));
    }
// Enter length and breadth: 10 5
// Area: 50.0
// Perimeter: 30.0

    // 13. Circle Calculations (Area, Circumference)
    static void circleCalc() 
    {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area: " + (Math.PI * r * r));
        System.out.println("Circumference: " + (2 * Math.PI * r));
    }
// Enter radius: 7
// Area: 153.93804002589985
// Circumference: 43.982297150257104
}

