import java.util.Scanner;

public class scan {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        num = leitor.nextInt();

        if(num >= 18){
            System.out.println("Voce eh maior de idade!");
        }
        if(num < 18){
            System.out.println("Voce eh menor de idade!");
        }
        //Nesse exemplo a funcionalidade do if foi usada em conjunto com o Scanner
    }
}
