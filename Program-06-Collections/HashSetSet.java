import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
public class HashSetSet {
      public static void main(String[] args) {
            
            String[] mythings = {"apple", "bob", "ham" ,"bob","bacon","apple"};
            List<String> list1 = Arrays.asList(mythings);

            System.out.printf("%s",list1);

            Set<String> set = new HashSet<String>(list1);
            System.out.println();
            System.out.printf("%s", set);
      }
}
