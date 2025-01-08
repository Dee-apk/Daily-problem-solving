import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    // Regular expression pattern to validate an IP address
    String pattern =
        "^" +
        "((0[0-9]{1,2}" +         // Matches numbers with leading zeros, up to three digits
        "|25[0-5]" +              // Matches numbers from 250 to 255
        "|2[0-4][0-9]" +          // Matches numbers from 200 to 249
        "|1[0-9]{2}" +            // Matches numbers from 100 to 199
        "|[0-9]{1,2})" +          // Matches numbers from 0 to 99
        "\\.){3}" +               // Matches first three segments, each followed by a dot
        "(0[0-9]{1,2}" +          // Matches the last segment with leading zeros
        "|25[0-5]" +
        "|2[0-4][0-9]" +
        "|1[0-9]{2}" +
        "|[0-9]{1,2})" +
        "$";

}      

