import java.util.Scanner;

public class Solution 
{

    static boolean isAnagram(String a, String b) 
    {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        char[] stra = a.toCharArray();
        char[] strb = b.toCharArray();
        
        java.util.Arrays.sort(stra);
        java.util.Arrays.sort(strb);
    
        return java.util.Arrays.equals(stra, strb);
    }

    public static void main(String[] args) 
    {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
