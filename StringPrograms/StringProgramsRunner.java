package StringPrograms;
public class StringProgramsRunner extends StringPrograms
{
    public static void main(String[] args) 
    {
        String sample = "The quick brown fox jumps over the lazy dog";

        getCharAt(sample, 5);

        replaceCharAt(sample, 4, 'Z');

        reverseString(sample);

        reverseUsingStack(sample);

        sortString("dcba");

        swapPairs("abcdef");

        isPangram(sample);

        printFirstLetters(sample);

        unicodeAt(sample, 0);

        removeLeadingZeros("00012345");

        removeInbetweenZeros("1020304050");

        removeTrailingZeros("1234000");

        removeAllZeros("1020304050");

        compareStrings("hello", "Hello");

        lexicographicCompare("apple", "banana");

        evenLengthWords(sample);

        insertString("HelloWorld", "Java", 5);

        splitIntoSubstrings("HelloWorld", 3);
        
    }
}
// Character at index 5: u
// After replace: The Zuick brown fox jumps over the lazy dog
// Reversed: god yzal eht revo spmuj xof nworb kciuq ehT
// Reversed using stack: god yzal eht revo spmuj xof nworb kciuq ehT
// Sorted: abcd
// Swapped pairs: badcfe
// Pangram
// Tqbfjotld
// Unicode of character at index 0: 84
// Removed leading zeros: 12345
// Removed in-between zeros: 123450
// Removed trailing zeros: 1234
// Removed all zeros: 12345
// Equal? false
// Lexicographic compare result: -1
// over lazy
// After insertion: HelloJavaWorld
// Hel
// loW
// orl
// d