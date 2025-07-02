package ListPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListProgramsRunner extends ListPrograms
{
    public static void main(String[] args) 
    {
        // Inputs
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
        List<Integer> intList = Arrays.asList(11, 22, 3, 47, 5, 8, 15);
        List<String> withNulls = Arrays.asList("A", null, "B", null, "C");
        List<String> withDuplicates = Arrays.asList("A", "B", "A", "C", "B");
        List<String> repeatedList = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "D"));
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("B", "C", "D");

        initializeList(stringList);

        findSublist(intList, 2, 5);

        getMinMax(intList);

        splitList(intList);

        removeSublist(new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E")), 1, 3);

        removeDuplicates(withDuplicates);

        removeNulls(new ArrayList<>(withNulls));

        sortList(new ArrayList<>(intList));

        getFirstLast(stringList);

        listToCSV(stringList);

        addFirstLastLinkedList(new LinkedList<>(Arrays.asList("B", "C")), "A", "D");

        findCommonElements(list1, list2);
        
        removeRepeatedElements(repeatedList);
    }
}
// Initialized List: [Apple, Banana, Cherry]
// Sublist (2 to 4): [3, 47, 5]
// Min: 3
// Max: 47
// First Half: [11, 22, 3]
// Second Half: [47, 5, 8, 15]
// After Removing Sublist: [A, D, E]
// Without Duplicates: [A, B, C]
// Without Nulls: [A, B, C]
// Sorted List: [3, 5, 8, 11, 15, 22, 47]
// First: Apple
// Last: Cherry
// CSV: Apple,Banana,Cherry
// LinkedList: [A, B, C, D]
// Common Elements: [B, C]
// After Removing Repeated: [A, B, C, D]