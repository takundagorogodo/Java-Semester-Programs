import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSumTokenizer {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter comma-separated numbers : ");
            String input = sc.nextLine();

            int sum = 0 ;
            
            StringTokenizer tokenizer = new StringTokenizer(input ,",");

            while (tokenizer.hasMoreTokens()){
                  int num = Integer.parseInt(tokenizer.nextToken().trim());
                  sum += num;
            }
            System.out.println("Sum of numbers : " + sum);
            sc.close();
      }
}
