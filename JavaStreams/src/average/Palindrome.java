package average;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Palindrome 
{
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string :");
        String inputString = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        boolean isItPalindrome = IntStream.range(0, inputString.length()/2).
                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));  
        if (isItPalindrome)
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }
        sc.close();
    }
}