package ArrayProgram;
public class Array2DProgramsRunner extends Array2DPrograms
{
    public static void main(String[] args) 
    {

        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] mat3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\n--- 2D Array Programs ---");

        print2DArray(mat1);
// 2D Array:
// [1, 2]
// [3, 4]

        addMatrices(mat1, mat2);
// 2D Array:
// [6, 8]
// [10, 12]

        sortColumns(mat3);
// 2D Array:
// [1, 2, 3]
// [4, 5, 6]
// [7, 8, 9]

        checkMatricesEqual(mat1, mat2); // Matrices are not equal.

        transposeMatrix(mat1);
// 2D Array:
// [1, 3]
// [2, 4]

        determinant2x2(mat1); // Determinant: -2

        normalAndTrace(mat3); // Trace: 15 Normal: 16.881943016134134

        printBoundary(mat3); // Boundary: 1 2 3 6 9 8 7 4

        rotateMatrixClockwise(mat3);
// 2D Array:
// [7, 4, 1]
// [8, 5, 2]
// [9, 6, 3]

        swapRows(mat3);
// 2D Array:
// [9, 6, 3]
// [8, 5, 2]
// [7, 4, 1]

        swapColumns(mat3);
// 2D Array:
// [3, 6, 9]
// [2, 5, 8]
// [1, 4, 7]
    }
}

