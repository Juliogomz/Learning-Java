import java.util.Scanner;

    //Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class AtribuirFloat {
    public static void main(String[] args) throws Exception {
       
    float num;
    Scanner leitor = new Scanner(System.in); 

    System.out.println("Digite um numero decimal:");

    num = leitor.nextFloat();
    
    //num é a variável que vai ser preenchida
    //Leitor é a variável criada com a classe Scanner para realizar o processo
    //“new Scanner()” serve para instanciar a variável
    //“(System.in)” serve para determinar que o usuário deverá digitar os valores 

    System.out.println("O numero digitado foi: " + num);

    }
}
