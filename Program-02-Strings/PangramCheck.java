import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("The string is a Pangram");
        else
            System.out.println("The string is NOT a Pangram");
    
       sc.close(); 
        }
}

