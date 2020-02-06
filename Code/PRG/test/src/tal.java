import javax.swing.*;
import java.util.Random;

public class tal {

    public static void main(String[] args) {

        int gissningar = 0;
        int tal = 0;
        int gissning = 0;

        Random random = new Random();
        tal = random.nextInt(100);
        gissning = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa talet mellan 0 till 100"));

        while (gissning != tal) {

            if (gissning > tal) {
                JOptionPane.showMessageDialog(null, "För högt");
                gissning = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa lägre noob"));
            }
             else if (gissning < tal) {

                    JOptionPane.showMessageDialog(null, "För lågt");
                gissning = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa högre int1"));
             }
             gissningar = gissningar+1;
        }
            if (gissning == tal) {
                JOptionPane.showMessageDialog(null, "Fick du rätt? Fuck you" + "\n antal gissningar =" + gissningar);
            }

        System.out.println(random);

    }
}
