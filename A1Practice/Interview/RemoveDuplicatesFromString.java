package Interview;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine();
        String restult = removeDupe(input);
        System.out.println("Output" + restult);
        sc.close();

        
    }
    public static String removeDupe(String str)
    {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();
        for(char ch: str.toCharArray())
        {
            if(seen.add(ch))
            {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
       
        
 
    }
    
}
