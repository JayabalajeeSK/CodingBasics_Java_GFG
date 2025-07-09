package ArrayProgram;
public class Array1DProgramsRunner extends Array1DPrograms
{
    public static void main(String[] args) 
    {

        int[] arr1 = {1, 2, 3, 4, 5, 2};
        int[] arr2 = {5, 2, 8};

        System.out.println("--- 1D Array Programs ---");

        searchElement(arr1, 2); //Element 2 found.

        findLargest(arr1); //Largest element: 5

        sortArrayAsc(arr1.clone()); //Sorted Ascending: [1, 2, 2, 3, 4, 5]

        sortArrayDesc(arr1.clone()); //Sorted Descending: [5, 4, 3, 2, 2, 1]

        removeDuplicates(arr1); //Unique elements: 1 2 3 4 5

        mergeArrays(arr1, arr2); //Merged Array: [1, 2, 2, 3, 4, 5, 5, 2, 8]

        checkArraysEqual(arr1, arr2); //Arrays are not equal.

        removeAllOccurrences(arr1, 2); //After removing 2: 1 3 4 5

        findCommonElements(arr1, arr2); //Common Elements: 2 2 5

        copyArray(arr1); //Copied Array: [1, 2, 2, 3, 4, 5]

        rotateArray(arr1, 2); //Rotated Array: [2, 3, 4, 5, 1, 2]
    }

}

