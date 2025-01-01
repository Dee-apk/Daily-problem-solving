   import java.util.Scanner;

public class CustomSplitExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        input = input.trim();
        
         if (input.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = input.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        
        for(String token:tokens)
        {
            System.out.println(token);
        }
    }

}
