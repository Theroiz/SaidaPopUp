
import java.util.Scanner;
import javax.swing.JOptionPane;
public class NewClass 
{
    public static void main (String[]args)
    {
        int count = 0;
        String popup = null;
        while(count != 2)
        {
            count++;
            popup = JOptionPane.showInputDialog(null,"ola");
            System.out.println(popup);
        }
    }
}
