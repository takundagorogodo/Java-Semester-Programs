package MyProj;

public class Person {

    String first;
    String last;
    
    Person(String first , String last){
      this.first = first;
      this.last = last;
    }

    void showName(){
      System.out.println(this.first + " " + this.last);
    }

    void educated(){
      System.out.println("This person is educated ");
    }
}