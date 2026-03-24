import java.util.PriorityQueue;

public class Queueue {
      public static void main(String[] args) {
            
            PriorityQueue<String> que = new PriorityQueue<String>();

            que.offer("first");
            que.offer("Second");
            que.offer("third");

            System.out.printf("%s " ,que);
            System.out.println();

            System.out.printf("%s ",que.peek());
            System.out.println();

            que.poll();

            System.out.printf("%s",que);
      }     
}
