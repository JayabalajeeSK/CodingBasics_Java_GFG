package ArrayProgram;
import java.util.Arrays;
public class Array2DPrograms 
{
    // ------------------ 2-D Matrix Programs --------------------

    public static void print2DArray(int[][] mat) 
    {
        System.out.println("2D Array:");
        for (int[] row : mat)
        {
            System.out.println(Arrays.toString(row));
        }
    }
// 2D Array:
// [1, 2]
// [3, 4]

    public static void addMatrices(int[][] a, int[][] b) 
    {
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        print2DArray(sum);
    }
// 2D Array:
// [6, 8]
// [10, 12]

    public static void sortColumns(int[][] mat) 
    {
        for (int col = 0; col < mat[0].length; col++) 
        {
            for (int i = 0; i < mat.length - 1; i++) 
            {
                for (int j = 0; j < mat.length - i - 1; j++) 
                {
                    if (mat[j][col] > mat[j + 1][col]) 
                    {
                        int temp = mat[j][col];
                        mat[j][col] = mat[j + 1][col];
                        mat[j + 1][col] = temp;
                    }
                }
            }
        }
        print2DArray(mat);
    }
// 2D Array:
// [1, 2, 3]
// [4, 5, 6]
// [7, 8, 9]

    public static void checkMatricesEqual(int[][] a, int[][] b) 
    {
        boolean isEqual = true;
        for (int i = 0; i < a.length; i++)
        {
            if (!Arrays.equals(a[i], b[i])) isEqual = false;
        }
        System.out.println(isEqual ? "Matrices are equal." : "Matrices are not equal.");
    }
// Matrices are not equal.

    public static void transposeMatrix(int[][] mat) 
    {
        int[][] trans = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                trans[j][i] = mat[i][j];
            }
        }
        print2DArray(trans);
    }
// 2D Array:
// [1, 3]
// [2, 4]

    public static void determinant2x2(int[][] mat) 
    {
        if (mat.length == 2 && mat[0].length == 2) 
        {
            int det = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
            System.out.println("Determinant: " + det);
        } 
        else 
        {
            System.out.println("Only 2x2 matrix supported.");
        }
    }
// Determinant: -2

    public static void normalAndTrace(int[][] mat) 
    {
        int trace = 0, normal = 0;
        for (int i = 0; i < mat.length; i++) 
        {
            trace += mat[i][i];
            for (int j = 0; j < mat[i].length; j++) 
            {
                normal = normal + mat[i][j] * mat[i][j];
            }
        }
        System.out.println("Trace: " + trace);
        System.out.println("Normal: " + Math.sqrt(normal));
    }
// Trace: 15
// Normal: 16.881943016134134

    public static void printBoundary(int[][] mat) 
    {
        int n = mat.length, m = mat[0].length;
        System.out.print("Boundary: ");
        for (int i = 0; i < m; i++) System.out.print(mat[0][i] + " ");
        for (int i = 1; i < n; i++) System.out.print(mat[i][m - 1] + " ");
        for (int i = m - 2; i >= 0; i--) System.out.print(mat[n - 1][i] + " ");
        for (int i = n - 2; i > 0; i--) System.out.print(mat[i][0] + " ");
        System.out.println();
    }
// Boundary: 1 2 3 6 9 8 7 4

    public static void rotateMatrixClockwise(int[][] mat) 
    {
        int N = mat.length;
        for (int x = 0; x < N / 2; x++) 
        {
            for (int y = x; y < N - x - 1; y++) 
            {
                int temp = mat[x][y];
                mat[x][y] = mat[N - 1 - y][x];
                mat[N - 1 - y][x] = mat[N - 1 - x][N - 1 - y];
                mat[N - 1 - x][N - 1 - y] = mat[y][N - 1 - x];
                mat[y][N - 1 - x] = temp;
            }
        }
        print2DArray(mat);
    }
// 2D Array:
// [7, 4, 1]
// [8, 5, 2]
// [9, 6, 3]

    public static void swapRows(int[][] mat) 
    {
        int first = 0, last = mat.length - 1;
        int[] temp = mat[first];
        mat[first] = mat[last];
        mat[last] = temp;
        print2DArray(mat);
    }
// 2D Array:
// [9, 6, 3]
// [8, 5, 2]
// [7, 4, 1]

    public static void swapColumns(int[][] mat) 
    {
        int first = 0, last = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) 
        {
            int temp = mat[i][first];
            mat[i][first] = mat[i][last];
            mat[i][last] = temp;
        }
        print2DArray(mat);
    }
// 2D Array:
// [3, 6, 9]
// [2, 5, 8]
// [1, 4, 7]

}

