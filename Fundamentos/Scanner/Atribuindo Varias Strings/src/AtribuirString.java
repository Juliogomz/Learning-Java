import java.util.Scanner;

//Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class AtribuirString {
    public static void main(String[] args) throws Exception {
    
    String classe;
    int nivel;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite sua classe no jogo: ");
    classe = leitor.nextLine();

    System.out.println("Digite o nivel da sua classe");
    nivel = leitor.nextInt();

    System.out.println("Sua classe é " + classe +" e o seu nivel é " + nivel);


    }
}
