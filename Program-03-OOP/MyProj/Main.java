package MyProj;

public class Main {
      
      public static void main(String[] args) {
            
            Person person = new Person("Tom ", "Riddle");
            
            Student student = new Student("Harry" , "Porter", 8.9);
            person.showName();
            student.showName();
            student.showGPA();
            student.educated();

            Employee employee = new Employee("Takunda", "gorogodo", 200_000);
            employee.showName();
            employee.showSalary();
            employee.educated();
      }
}
