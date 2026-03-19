import java.util.Scanner;

public class PangramString {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            String input = sc.nextLine().toLowerCase();

            boolean[] present = new boolean[26];

            //check for each character
            for(int i = 0; i < input.length() ;i++){
                  char ch = input.charAt(i);

                  if(ch >= 'a' && ch <= 'z'){
                        present[ch - 'a'] = true;
                  }
            }

            //verify all letters are present
            boolean isPangram = true;
            for(boolean letter : present){
                  if(!letter){
                        isPangram = false;
                        break;
                  }
            }

            if(isPangram){
                  System.out.println("The given string is a  pangram");
            }else{
                  System.out.println("The given string is not pangram");
            }
            sc.close();
      }
}
