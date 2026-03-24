import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
      public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String> friuts = new ArrayList<>();
            
            friuts.add("heloo");
            friuts.add("takunda");
            friuts.add("apple");
            friuts.add("coconut");
            friuts.add("banana");

            friuts.remove(1);
            friuts.remove(0);

            friuts.set(0,"pineaple");

            list.add(34);
            list.add(90);
            
            System.out.println(friuts.size());
            System.out.println(friuts.get(0));
            System.out.println(friuts);
            Collections.sort(friuts);
            System.out.println(friuts);
            System.out.println(list);
      }
}
