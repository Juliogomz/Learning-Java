import java.util.Scanner;

public class scan {
    public static void main(String[] args) throws Exception {
        String nome;
        int contador = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome para ser repetido 5 vezes:");
        nome = leitor.next();

        while(contador < 5){
        System.out.println(nome);
        contador++;
        }
    }
}
