import java.util.Scanner;

public class dow {
    public static void main(String[] args) throws Exception {

        String nome;
        int contador = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua cor favorita para ser repetida 10 vezes");
        nome = leitor.next();

        do{
        System.out.println(nome);
        contador++;
        }
        while(contador < 10);

    }
}
