import java.util.Scanner;

public class sequencia {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = leitor.nextInt();

        int contador = num1;
        do{
        System.out.println(contador);
        contador++;
        }
        while(contador <= num2);
    }
}
