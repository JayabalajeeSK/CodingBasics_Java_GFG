package PatternPrograms;
public class AllStarPatternsRunner extends AllStarPatterns
{
    public static void main(String[] args) 
    {
        rightTriangle();
        leftTriangle();
        pyramid();
        reversePyramid();
        upperStarTriangle();
        mirrorUpperStarTriangle();
        downwardTriangle();
        mirrorLowerStarTriangle();
        pascalTriangle();
        diamondPattern();
        squarePattern();
        spiralPattern();
    }
    
}
// 1. Right Triangle - Enter rows: 5
// * 
// * * 
// * * * 
// * * * *
// * * * * *

// 2. Left Triangle - Enter rows: 5
//         *
//       * *
//     * * *
//   * * * *
// * * * * *

// 3. Pyramid Pattern - Enter rows: 5
//     *
//    ***
//   *****
//  *******
// *********

// 4. Reverse Pyramid - Enter rows: 5
// *********
//  *******
//   *****
//    ***
//     *

// 5. Upper Star Triangle - Enter rows: 5
// * * * * *
// * * * *
// * * *
// * *
// *

// 6. Mirror Upper Star Triangle - Enter rows: 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

// 7. Downward Triangle - Enter rows: 5
// * * * * *
// * * * *
// * * *
// * *
// *

// 8. Mirror Lower Star Triangle - Enter rows: 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

// 9. Pascal's Triangle - Enter rows: 5
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1

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

// 11. Square Pattern - Enter size: 5
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// 12. Spiral Pattern - Enter matrix size (n x n): 3 4
// Spiral Pattern:
//    1   2   3
//    8   9   4
//    7   6   5