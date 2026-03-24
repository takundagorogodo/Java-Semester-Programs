package GettersandSettersPackage;

public class MainMap {
      public static void main(String[] args) {
            MainMap world = new MainMap();

            Orc orc1 = new Orc();
             
            orc1.setHeight(9);

            Expansion newMap = new Expansion();
             System.out.println(orc1.getHeight());

            Orc orc2 = new Orc();
            
            orc2.setHeight(15);
            System.out.println(orc2.getHeight());
           
      }
      
}
