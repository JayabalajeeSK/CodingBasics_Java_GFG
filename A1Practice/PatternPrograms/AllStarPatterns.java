package PatternPrograms;
import java.util.*;
public class AllStarPatterns {

    public static Scanner sc = new Scanner(System.in);

    public static void rightTriangle() 
    {
        System.out.print("\n1. Right Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 1. Right Triangle - Enter rows: 5
// * 
// * * 
// * * * 
// * * * *
// * * * * *

    public static void leftTriangle() 
    {
        System.out.print("\n2. Left Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 2. Left Triangle - Enter rows: 5
//         *
//       * *
//     * * *
//   * * * *
// * * * * *

    public static void pyramid() 
    {
        System.out.print("\n3. Pyramid Pattern - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
// 3. Pyramid Pattern - Enter rows: 5
//     *
//    ***
//   *****
//  *******
// *********

    public static void reversePyramid() 
    {
        System.out.print("\n4. Reverse Pyramid - Enter rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
        {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
// 4. Reverse Pyramid - Enter rows: 5
// *********
//  *******
//   *****
//    ***
//     *

    public static void upperStarTriangle() 
    {
        System.out.print("\n5. Upper Star Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 5. Upper Star Triangle - Enter rows: 5
// * * * * *
// * * * *
// * * *
// * *
// * 

    public static void mirrorUpperStarTriangle() 
    {
        System.out.print("\n6. Mirror Upper Star Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
        {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 6. Mirror Upper Star Triangle - Enter rows: 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

    public static void downwardTriangle() 
    {
        System.out.print("\n7. Downward Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 7. Downward Triangle - Enter rows: 5
// * * * * *
// * * * *
// * * *
// * *
// *

    public static void mirrorLowerStarTriangle() 
    {
        System.out.print("\n8. Mirror Lower Star Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j < i; j++) System.out.print("  ");
            for (int j = i; j <= n; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 8. Mirror Lower Star Triangle - Enter rows: 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

    public static void pascalTriangle() 
    {
        System.out.print("\n9. Pascal's Triangle - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int number = 1;
            System.out.format("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) 
            {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
// 9. Pascal's Triangle - Enter rows: 5
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1

    public static void diamondPattern() 
    {
        System.out.print("\n10. Diamond Pattern - Enter rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) 
        {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
// 10. Diamond Pattern - Enter rows: 5
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

    public static void squarePattern() 
    {
        System.out.print("\n11. Square Pattern - Enter size: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) System.out.print("* ");
            System.out.println();
        }
    }
// 11. Square Pattern - Enter size: 5
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

    public static void spiralPattern() 
    {
        System.out.print("\n12. Spiral Pattern - Enter matrix size (n x n): ");
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        int val = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (val <= n * n) 
        {
            for (int i = left; i <= right; i++) spiral[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) spiral[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) spiral[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) spiral[i][left] = val++;
            left++;
        }

        System.out.println("Spiral Pattern:");
        for (int[] row : spiral) 
        {
            for (int ele : row) System.out.printf("%4d", ele);
            System.out.println();
        }
    }
}
// 12. Spiral Pattern - Enter matrix size (n x n): 3 4
// Spiral Pattern:
//    1   2   3
//    8   9   4
//    7   6   5