public class Inheritanceproram {

       //This is the actual program
       public static void main(String[] args){

            GumDrops Red = new GumDrops();
            GumDrops Green = new GumDrops();
            
            Red.givemeCinnamon();
            Red.sugarAmount = 10;
            Red.displaySugarAmount();

            Green.givemeSperamint();
            Green.sugarAmount = 15;
            Green.displaySugarAmount();
       }      
      
}
