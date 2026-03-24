

import java.util.Scanner;

 class Person{
    int id;
    String name;
    Person(int id , String name){
        this.id = id ;
        this.name = name;
    }
}
 class Student extends Person{
    int marks;
    String status;
    
    
    Student(int id , String name ,int marks)
    {
        super(id , name);
        this.marks = marks;

        if(marks >= 40)
        {
            status = "Pass";
        }else{
            status = "Fail";
        }
    }

}
 class Result extends Student{
    Result(int id,String name,int marks)
    {
        super(id,name,marks);   
    }
    void displayResult(){
        System.out.println("Result(" + id + ", "+ name +", " + marks+", " + status +")");
    }
}
public class Multilevel_inheritance {
      
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        int id = sc.nextInt();
         System.out.print("Enter name : ");
        String name = sc.next();
         System.out.print("Enter marks : ");
        int marks = sc.nextInt();
       
        System.out.println( "===============" + "\n");

        Result r = new Result(id, name, marks);
        r.displayResult();

        System.out.println("\n" + "\n");

          sc.close();
    }
}

