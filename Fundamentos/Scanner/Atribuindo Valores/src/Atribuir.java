import java.util.Scanner;

      //Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class Atribuir {
    public static void main(String[] args) throws Exception {
      int numero;
      Scanner leitor = new Scanner(System.in);
      numero = leitor.nextInt();

      //Int é a variável que vai ser preenchida
      //Leitor é a variável criada com a classe Scanner para realizar o processo
      //“new Scanner()” serve para instanciar a variável
      //“(System.in)” serve para determinar que o usuário deverá digitar os valores 

      System.out.println("Número é " + numero);

    }
}
