import java.util.Scanner;

    //Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class AtribuirString {
    public static void main(String[] args) throws Exception {

    String nome;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o seu nome: ");

    nome = leitor.next();

    //nome é a variável que vai ser preenchida
    //Leitor é a variável criada com a classe Scanner para realizar o processo
    //“new Scanner()” serve para instanciar a variável
    //“(System.in)” serve para determinar que o usuário deverá digitar os valores 

    System.out.println("O seu nome é:\n" + nome);

    }
}
