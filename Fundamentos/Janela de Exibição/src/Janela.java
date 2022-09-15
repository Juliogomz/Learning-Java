import java.util.Scanner;

import javax.swing.JOptionPane;

//Para se usar o JOptionPane é preciso se inserir antes a importação de classe "javax.swing.JOptionPane"

public class Janela {
    public static void main(String[] args) throws Exception {
        String anime = JOptionPane.showInputDialog(null, "Qual o seu anime favorito?", "Questionario", JOptionPane.QUESTION_MESSAGE);
        
        //Por meio do JOptionPane é possível se ler valores através da interface gráfica.

        System.out.println("O seu anime favorito eh: " + anime);
    }
}
