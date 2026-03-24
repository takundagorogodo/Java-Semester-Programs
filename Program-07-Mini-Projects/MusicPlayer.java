import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MusicPlayer {

      public static void main(String[] args) {
            
            String filePath = "crystal.wav";
            File file = new File(filePath);

            try(Scanner scanner = new Scanner(System.in);AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
               Clip clip = AudioSystem.getClip();
               clip.open(audioStream);

               String response= "";

               while(!response.equals("Q")){
                   System.out.println("P = Play");
                   System.out.println("S = Pause");
                   System.out.println("R = Reset");
                   System.out.println("Q = Quit");
                   System.out.println("Enter your choice : ");

                   response = scanner.next().toUpperCase();

                   switch(response){
                        case "P" -> clip.start();
                        case "S" -> clip.stop();
                        case "R" -> clip.setMicrosecondPosition(0);
                        case "Q" -> clip.close();
                        default->System.out.println("Invalid choice");


                   }
               }
               clip.start();
           

            } 
            catch(FileNotFoundException e){
                  System.out.println("Could not locate file");
            }
            catch(UnsupportedAudioFileException e){

                 System.out.println("audio file is not supported");
            }catch(LineUnavailableException e){
                  System.out.println("Unable to access audion resource");
            }
            catch (Exception e) {
                  // TODO: handle exception
                  System.out.println("Something went wrong");
            }
            
      }
}