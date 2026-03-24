import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferFileReader {
      public static void main(String[] args) {
            
          String filePath = "C:\\Users\\Prosperity\\Desktop\\text.txt";
  
          try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
           String line ;

           while((line = reader.readLine()) !=null){
            System.out.println(line);
           }
            System.out.println("That file exists");
          }
          catch(FileNotFoundException e){
            System.out.println("Could not locate file");
          }
          catch(IOException e){
            System.out.println("Something went wrong");
          }
      }
}
