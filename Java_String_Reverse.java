import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(palidrome(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean palidrome (String str)
    {
        int n = str.length();
        for(int i=0 ;i< n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                return false;
            }
            
        }
        return true;
    }
    
}
