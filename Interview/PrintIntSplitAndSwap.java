public class PrintIntSplitAndSwap 
{
    public static void main(String[] args) 
    {
        int original = 123456;
        int first = original/1000;
        int second = original % 1000;
        int revFirst = reverse(first);
        int revSec = reverse(second);

        System.out.println(revFirst*1000+revSec);

        
    }

    private static int reverse(int num) 
    {
        int rev = 0;
        while(num>0)
        {
            rev = rev*10 + num % 10;
            num = num / 10;
        }
        return rev;

    }
    
}
// 321654