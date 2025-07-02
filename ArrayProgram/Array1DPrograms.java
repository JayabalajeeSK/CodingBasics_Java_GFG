package ArrayProgram;
import java.util.Arrays;
public class Array1DPrograms 
{

    // ------------------ 1-D Array Programs --------------------

    public static void searchElement(int[] arr, int key) 
    {
        boolean found = false;
        for (int val : arr) 
        {
            if (val == key) 
            {
                found = true;
                break;
            }
        }
        System.out.println("Element " + key + (found ? " found." : " not found."));
    }
// Element 2 found.

    public static void findLargest(int[] arr) 
    {
        int max = arr[0];
        for (int val : arr)
            if (val > max) max = val;
        System.out.println("Largest element: " + max);
    }
// Largest element: 5

    public static void sortArrayAsc(int[] arr) 
    {
        Arrays.sort(arr);
        System.out.println("Sorted Ascending: " + Arrays.toString(arr));
    }
// Sorted Ascending: [1, 2, 2, 3, 4, 5]

    public static void sortArrayDesc(int[] arr) 
    {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> b - a);
        System.out.println("Sorted Descending: " + Arrays.toString(boxed));
    }
// Sorted Descending: [5, 4, 3, 2, 2, 1]

    public static void removeDuplicates(int[] arr) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.print("Unique elements: ");
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++)
        {
            if (arr[i] != arr[i - 1]) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
// Unique elements: 1 2 3 4 5

    public static void mergeArrays(int[] a, int[] b) 
    {
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
// Merged Array: [1, 2, 2, 3, 4, 5, 5, 2, 8]

    public static void checkArraysEqual(int[] a, int[] b) 
    {
        System.out.println(Arrays.equals(a, b) ? "Arrays are equal." : "Arrays are not equal.");
    }
// Arrays are not equal.

    public static void removeAllOccurrences(int[] arr, int key) 
    {
        System.out.print("After removing " + key + ": ");
        for (int val : arr)
        {
            if (val != key) System.out.print(val + " ");
        }
        System.out.println();
    }
// After removing 2: 1 3 4 5

    public static void findCommonElements(int[] a, int[] b) 
    {
        System.out.print("Common Elements: ");
        for (int val : a) 
        {
            for (int val2 : b) 
            {
                if (val == val2) 
                {
                    System.out.print(val + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
// Common Elements: 2 2 5

    public static void copyArray(int[] arr) 
    {
        int[] copied = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copied));
    }
// Copied Array: [1, 2, 2, 3, 4, 5]

    public static void rotateArray(int[] arr, int d) 
    {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++)
        {
            rotated[i] = arr[(i + d) % n];
        }
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
// Rotated Array: [2, 3, 4, 5, 1, 2]

}

        // int[] arr1 = {1, 2, 3, 4, 5, 2};
        // int[] arr2 = {5, 2, 8};