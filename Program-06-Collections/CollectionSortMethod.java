import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class CollectionSortMethod {
      public static void main(String[] args) {
            
            String[] crap = {"apples", "lemons" ,"geeese" , "bacon " , "youtube"};

            List<String> list1 = Arrays.asList(crap);

            Collections.sort(list1);

            System.out.print(list1);
            System.out.println();

            Collections.sort(list1,Collections.reverseOrder());
            System.out.printf("%s",list1);
      }
}
