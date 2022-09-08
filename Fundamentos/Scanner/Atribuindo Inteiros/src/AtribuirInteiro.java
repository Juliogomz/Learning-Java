import java.util.Scanner;

      //Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class AtribuirInteiro {
    public static void main(String[] args) throws Exception {

    int numero;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número inteiro:");

    numero = leitor.nextInt();

    //numero é a variável que vai ser preenchida
    //Leitor é a variável criada com4 a classe Scanner para realizar o processo
    //“new Scanner()” serve para instanciar a variável
    //“(System.in)” serve para determinar que o usuário deverá digitar os valores 

    System.out.println("O número digitado foi:\n" + numero);

    }
}


