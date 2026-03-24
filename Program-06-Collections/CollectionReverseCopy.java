import java.util.Collections;
import java.util.Arrays;
import java.util.List;


public class CollectionReverseCopy {
      public static void main(String[] args) {
            
            Character[] ray = {'p' , 'w' , 'n'};
            List<Character> list1 = Arrays.asList(ray);
            
            System.out.println("List is : ");
            output(list1);

             //reverse and print out the list
            Collections.reverse(list1);
            System.out.println("After reverse : ");
            output(list1);

            //create a new array and list
            Character[] newRay = new Character[3];
            List<Character> listCopy = Arrays.asList(newRay);

            //copy contents og list into listCopy
            Collections.copy(listCopy, list1);
            System.out.println("Copy of list");
            output(listCopy);

            //fill colection with crap
            Collections.fill(list1,'x');
            System.out.println("After filling the list : ");
            output(list1);


      }

      //output method 
      private static void output(List<Character> theList)
      {
            for(Character thing: theList)
            {
                  System.out.printf("%s", thing + " ");
            }
            System.out.println();
      }
}
