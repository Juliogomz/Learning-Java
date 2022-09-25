import java.util.Random;

import javax.swing.JOptionPane;

public class dadoran {
    public static void main(String[] args) throws Exception {

        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, numero);
    }
}
