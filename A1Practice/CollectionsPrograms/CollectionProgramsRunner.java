package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionProgramsRunner extends CollectionsPrograms
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));

        useCollections(list, set, queue);

        printCollection(list);

        compareCollections(list, Arrays.asList("A", "B", "C", "D"));

        printSize(set);

        shuffleList(list);

        reverseList(list);

        collectionToArray(queue);

        String[] array = {"X", "Y", "Z"};
        arrayToCollection(array);

        replaceElementsInList(list, "B", "Beta");

        rotateList(list, 2);

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        iterateHashMap(map);
    }
}
// List: [A, B, C, D]
// Set: [A, B, C]
// Queue: [A, B, C]
// A B C D 
// Are collections equal? true
// Size: 3
// Shuffled List: [C, A, B, D]
// Reversed List: [D, B, A, C]
// Array: [A, B, C]
// Converted Collection: [X, Y, Z]
// After Replace: [D, Beta, A, C]
// Rotated List: [A, C, D, Beta]
// Apple => 10
// Cherry => 30
// Banana => 20