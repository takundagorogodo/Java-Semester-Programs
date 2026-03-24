package MyProj;

public class Employee extends Person{
      int salary;

     Employee(String first , String last ,  int salary){
          super(first, last);
          this.salary = salary;
     } 

     void showSalary(){
      System.out.println(this.first + "'s salary is $" + this.salary);
     }

     @Override
     void educated(){
      System.out.println(this.first + " has qualification of M tech degree");
     }
}
