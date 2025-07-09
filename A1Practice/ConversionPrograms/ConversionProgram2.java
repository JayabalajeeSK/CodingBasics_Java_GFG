package ConversionPrograms;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConversionProgram2 {

    public static void main(String[] args) 
    {
        // 1. Print Fibonacci Series
        fibonacciSeries(10);

        // 2. LinkedList to Array
        linkedListToArray();

        // 3. Vector to List
        vectorToList();

        // 4. String to List of Characters
        stringToCharList();

        // 5. Iterator to List
        iteratorToList();

        // 6. List to Map
        listToMap();

        // 7. List to Stream
        listToStream();

        // 8. List to Set
        listToSet();

        // 9. InputStream to String
        inputStreamToString();

        // 10. Set<String> to String[]
        setToArray();

        // 11. String to Object
        stringToObject();

        // 12. String to byte
        stringToByte();
    }

    // 1. Print Fibonacci Series
    static void fibonacciSeries(int count) 
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < count; i++) 
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(); //Fibonacci: 0 1 1 2 3 5 8 13 21 34 
    }

    // 2. Convert LinkedList to Array
    static void linkedListToArray() 
    {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        String[] array = list.toArray(new String[0]);
        System.out.println("LinkedList to Array: " + Arrays.toString(array)); //LinkedList to Array: [A, B, C]
    }

    // 3. Convert Vector to List
    static void vectorToList() 
    {
        Vector<Integer> vector = new Vector<>(List.of(1, 2, 3));
        List<Integer> list = new ArrayList<>(vector);
        System.out.println("Vector to List: " + list); //Vector to List: [1, 2, 3]
    }

    // 4. Convert String to List of Characters
    static void stringToCharList() 
    {
        String str = "Hello";
        List<Character> list = str.chars().mapToObj(c -> (char) c).toList();
        System.out.println("String to Char List: " + list);  //String to Char List: [H, e, l, l, o]
    }
    // 5. Convert Iterator to List
    static void iteratorToList() 
    {
        List<String> original = List.of("One", "Two", "Three");
        Iterator<String> iterator = original.iterator();
        List<String> list = new ArrayList<>();
        iterator.forEachRemaining(list::add);
        System.out.println("Iterator to List: " + list); //Iterator to List: [One, Two, Three] 
    }

    // 6. Convert List to Map
    static void listToMap() 
    {
        List<String> list = List.of("A", "B", "C");
        Map<Integer, String> map = IntStream.range(0, list.size())
            .boxed().collect(Collectors.toMap(i -> i, list::get));
        System.out.println("List to Map: " + map); //List to Map: {0=A, 1=B, 2=C}
    }

    // 7. Convert List to Stream
    static void listToStream() 
    {
        List<String> list = List.of("X", "Y", "Z");
        list.stream().forEach(e -> System.out.print(e + " ")); //X Y Z
        System.out.println("\nList to Stream done."); //List to Stream done.
    }

    // 8. Convert List to Set
    static void listToSet() 
    {
        List<String> list = List.of("One", "Two", "Two", "Three");
        Set<String> set = new HashSet<>(list);
        System.out.println("List to Set: " + set); //List to Set: [One, Two, Three]
    }

    // 9. Convert InputStream to String
    static void inputStreamToString() 
    {
        String input = "InputStream Data";
        InputStream is = new ByteArrayInputStream(input.getBytes());
        String result = new BufferedReader(new InputStreamReader(is))
            .lines().collect(Collectors.joining("\n"));
        System.out.println("InputStream to String: " + result); //InputStream to String: InputStream Data
    }

    // 10. Convert Set of String to Array of String
    static void setToArray() 
    {
        Set<String> set = Set.of("A", "B", "C");
        String[] array = set.toArray(new String[0]);
        System.out.println("Set to Array: " + Arrays.toString(array)); //Set to Array: [A, B, C]
    }

    // 11. Convert String to Object
    static void stringToObject() 
    {
        String s = "123";
        Object obj = s;
        System.out.println("String to Object: " + obj); //String to Object: 123
    }

    // 12. Convert String to byte
    static void stringToByte() 
    {
        String s = "127";
        byte b = Byte.parseByte(s);
        System.out.println("String to byte: " + b); //String to byte: 127
    }
}
