import java.util.Scanner;

public class StringBuuferExample {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            StringBuffer sb = new StringBuffer(sc.nextLine());

            sb.append(" World");
            System.out.println(sb);

            sc.close();
      }
}
