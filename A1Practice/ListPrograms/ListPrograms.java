package ListPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ListPrograms 
{
    public static void initializeList(List<String> list) 
    {
        System.out.println("Initialized List: " + list);
    }
// List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
// Initialized List: [Apple, Banana, Cherry]

    public static void findSublist(List<Integer> list, int from, int to) 
    {
        System.out.println("Sublist (" + from + " to " + (to - 1) + "): " + list.subList(from, to));
    }
// List<Integer> intList = Arrays.asList(11, 22, 3, 47, 5, 8, 15);
// Sublist (2 to 4): [3, 47, 5]

    public static void getMinMax(List<Integer> list) 
    {
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
    }
// List<Integer> intList = Arrays.asList(11, 22, 3, 47, 5, 8, 15);
// Min: 3
// Max: 47

    public static void splitList(List<Integer> list) 
    {
        int mid = list.size() / 2;
        System.out.println("First Half: " + list.subList(0, mid));
        System.out.println("Second Half: " + list.subList(mid, list.size()));
    }
// List<Integer> intList = Arrays.asList(11, 22, 3, 47, 5, 8, 15);
// First Half: [11, 22, 3]
// Second Half: [47, 5, 8, 15]

    public static void removeSublist(List<String> list, int from, int to) 
    {
        list.subList(from, to).clear();
        System.out.println("After Removing Sublist: " + list);
    }
// (new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E")), 1, 3);
// After Removing Sublist: [A, D, E]

    public static void removeDuplicates(List<String> list) 
    {
        List<String> unique = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("Without Duplicates: " + unique);
    }
// List<String> withDuplicates = Arrays.asList("A", "B", "A", "C", "B");
// Without Duplicates: [A, B, C]

    public static void removeNulls(List<String> list) 
    {
        list.removeIf(Objects::isNull);
        System.out.println("Without Nulls: " + list);
    }
// List<String> withNulls = Arrays.asList("A", null, "B", null, "C");
// Without Nulls: [A, B, C]

    public static void sortList(List<Integer> list) 
    {
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
// List<Integer> intList = Arrays.asList(11, 22, 3, 47, 5, 8, 15);
// Sorted List: [3, 5, 8, 11, 15, 22, 47]

    public static void getFirstLast(List<String> list) 
    {
        System.out.println("First: " + list.get(0));
        System.out.println("Last: " + list.get(list.size() - 1));
    }
// List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
// First: Apple
// Last: Cherry

    public static void listToCSV(List<String> list) 
    {
        String csv = String.join(",", list);
        System.out.println("CSV: " + csv);
    }
// List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
// CSV: Apple,Banana,Cherry

    public static void addFirstLastLinkedList(LinkedList<String> list, String first, String last) 
    {
        list.addFirst(first);
        list.addLast(last);
        System.out.println("LinkedList: " + list);
    }
// (new LinkedList<>(Arrays.asList("B", "C")), "A", "D");
// LinkedList: [A, B, C, D]

    public static void findCommonElements(List<String> list1, List<String> list2) 
    {
        List<String> common = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("Common Elements: " + common);
    }
// List<String> list1 = Arrays.asList("A", "B", "C");
// List<String> list2 = Arrays.asList("B", "C", "D");
// Common Elements: [B, C]

    public static void removeRepeatedElements(List<String> list) 
    {
        Set<String> seen = new HashSet<>();
        list.removeIf(e -> !seen.add(e));
        System.out.println("After Removing Repeated: " + list);
    }
// List<String> repeatedList = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "D"));
// After Removing Repeated: [A, B, C, D]
    
}
