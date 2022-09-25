import javax.swing.JOptionPane;

public class dado {
    public static void main(String[] args) throws Exception {
        int dado = 1 + (int) (Math.random() * 6);
        JOptionPane.showMessageDialog(null, dado);

    }
}
