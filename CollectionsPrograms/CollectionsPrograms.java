package CollectionsPrograms;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsPrograms 
{
    // 1. Use Different Types of Collection
    public static <T> void useCollections(List<T> list, Set<T> set, Queue<T> queue) 
    {
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
// Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));
// List: [A, B, C, D]
// Set: [A, B, C]
// Queue: [A, B, C]

    // 2. Print a Collection
    public static <T> void printCollection(Collection<T> collection) 
    {
        for (T element : collection) 
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// A B C D 

    // 3. Compare Elements in a Collection
    public static <T> void compareCollections(Collection<T> col1, Collection<T> col2) 
    {
        System.out.println("Are collections equal? " + col1.equals(col2));
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// Are collections equal? true

    // 4. Get the Size of the Collection
    public static <T> void printSize(Collection<T> collection) 
    {
        System.out.println("Size: " + collection.size());
    }
// Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
// Size: 3

    // 5. Shuffle Elements
    public static <T> void shuffleList(List<T> list) 
    {
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// Shuffled List: [C, A, B, D]

    // 6. Reverse a Collection (List only)
    public static <T> void reverseList(List<T> list) 
    {
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// Reversed List: [D, B, A, C]

    // 7. Convert Collection into Array
    public static <T> void collectionToArray(Collection<T> collection) 
    {
        Object[] array = collection.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
// Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));
// Array: [A, B, C]

    // 8. Convert Array into Collection
    public static <T> void arrayToCollection(T[] array) 
    {
        List<T> list = Arrays.asList(array);
        System.out.println("Converted Collection: " + list);
    }
// String[] array = {"X", "Y", "Z"};
// Converted Collection: [X, Y, Z] 

    // 9. Replace Elements in a List
    public static void replaceElementsInList(List<String> list, String oldValue, String newValue) 
    {
        Collections.replaceAll(list, oldValue, newValue);
        System.out.println("After Replace: " + list);
    }
// List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
// (list, "B", "Beta");
// After Replace: [D, Beta, A, C]

    // 10. Rotate Elements of a List
    public static <T> void rotateList(List<T> list, int distance) 
    {
        Collections.rotate(list, distance);
        System.out.println("Rotated List: " + list);
    }
// (list, 2)
// Rotated List: [A, C, D, Beta]

    // 11. Iterate through Elements of HashMap
    public static <K, V> void iterateHashMap(Map<K, V> map) 
    {
        for (Map.Entry<K, V> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
        // Map<String, Integer> map = new HashMap<>();
        // map.put("Apple", 10);
        // map.put("Banana", 20);
        // map.put("Cherry", 30);
// Apple => 10
// Cherry => 30
// Banana => 20
}
