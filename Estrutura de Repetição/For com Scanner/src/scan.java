import java.util.Scanner;

public class scan {
    public static void main(String[] args) throws Exception {
        int num = 1;
        int num2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero para ser repetido 5 vezes:");
        num2 = leitor.nextInt();
        for(num = 1; num <= 5;num++){
            System.out.println(num2);
        }

    }
}
