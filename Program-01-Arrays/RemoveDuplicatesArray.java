import java.util.Scanner;

public class RemoveDuplicatesArray {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            int [] unique  = new int[n];
            int count = 0;

            for(int i=0;i<arr.length;i++){
                  System.out.print("Enter "+arr[i]+" element: ");
                  arr[i] =sc.nextInt();
            }

            for(int i = 0;i < arr.length;i++){
                  boolean isDupliacte = false;

                  for(int j = 0;j<count;j++){
                        if(arr[i]==unique[j]){
                              isDupliacte = true;
                              break;
                        }
                  }

                  if(!isDupliacte){
                        unique[count]=arr[i];
                        System.out.print(unique[count] + " ");
                        count++;
                  }
            }
            sc.close();
      }
      
}
