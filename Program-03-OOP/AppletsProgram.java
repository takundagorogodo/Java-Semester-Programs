import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.*;

public class AppletsProgram extends JApplet{

     

      private double sum;
      public void init(){
            String firstNumber = JOptionPane.showInputDialog("Enter first number : ");
            String secondNumber = JOptionPane.showInputDialog("Enter second number : ");

            double number_1 = Double.parseDouble(firstNumber);
            double number_2 = Double.parseDouble(secondNumber);

            sum = number_1 + number_2;
      }
       public void paint(Graphics g)
      {
            super.paint(g);
            g.drawString("the sum is  " + sum, 25,30);

      }
}
