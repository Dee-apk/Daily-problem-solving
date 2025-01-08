import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                // Attempt to compile the pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // Handle invalid patterns
                System.out.println("Invalid");
            }
            testCases--; // Decrement the number of test cases
        }
        
        in.close(); // Close the Scanner
    }
}
