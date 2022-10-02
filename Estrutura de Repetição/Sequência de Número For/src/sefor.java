import java.util.Scanner;

public class sefor {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        int contador;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro numero:");
        num1 = leitor.nextInt();
        System.out.println("Digite o valor do segundo numero:");
        num2 = leitor.nextInt();

        for(contador = num1; contador <= num2; contador++){
            System.out.println(contador);
        }
    }
}
