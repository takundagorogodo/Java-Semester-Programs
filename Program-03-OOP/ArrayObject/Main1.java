package ArrayObject;

public class Main1 {
      public static void main(String[] args) {
            Student[] students = new Student[3];
                    
            students[0] = new Student(1, "John");
            students[1] = new Student(2, "Mary");
            students[2] = new Student(3, "David");
      
            for (int i = 0; i < students.length; i++) 
            {
                 System.out.println(students[i].id + " " + students[i].name);
            }
      }
}
