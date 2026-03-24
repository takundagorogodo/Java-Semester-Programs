import java.io.FileNotFoundException;
import java.io.FileWriter;

public class FileMain {
      public static void main(String[] args) {
            
            String filePath = "C:\\Users\\Prosperity\\Desktop\\text.txt";
            String textContent = """
                    I like pizaa \n its really good!
                    """;
                    
            try(FileWriter writer = new FileWriter(filePath)) {
                 writer.write(textContent);
                 System.out.println("File has been written"); 
            }
            catch(FileNotFoundException e){
              System.out.println("cOULD NOT LOCATE FILE LOCATION");
            } catch (Exception e) {
                  System.out.println("cOULD NOT WRITR FILE");
            }
      }
}
