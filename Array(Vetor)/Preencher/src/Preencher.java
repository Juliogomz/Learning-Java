import java.util.Arrays;

public class Preencher {
    public static void main(String[] args) throws Exception {
       int numeros[] = new int[100];
       Arrays.fill(numeros, 22);
       System.out.println(numeros[40]);
}
}