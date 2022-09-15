import java.util.Scanner;

//Para usar o scanner é preciso se inserir as importações de classe “import java.util.Scanner;”

public class Linhacompleta {
    public static void main(String[] args) throws Exception {

        String nome;
        Scanner leitor = new Scanner(System.in);

        leitor.useDelimiter("[\r\n]+");

        //Usa-se "leitor.useDelimiter("[\r\n]+");" para que o espaço não seja mais um separador de String.

        
        System.out.println("Digite o seu nome completo: ");

        nome = leitor.next();

        //nome é a variável que vai ser preenchida
        //Leitor é a variável criada com a classe Scanner para realizar o processo
        //“new Scanner()” serve para instanciar a variável
        //“(System.in)” serve para determinar que o usuário deverá digitar os valores 

        System.out.println("O seu nome completo eh:\n" + nome);
    }
}
