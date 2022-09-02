public class Inteiros {
    public static void main(String[] args) throws Exception {
        byte numeropequeno;
        numeropequeno = 127;   
        System.out.println(numeropequeno);
        //O tipo de variável byte só armazena valores inteiros de -128 a 127

        short numerocurto;
        numerocurto = 32764;
        System.out.println(numerocurto);
        //O tipo de variável byte só armazena valores inteiros de -32768 a 32767

        int numerointeiro;
        numerointeiro = 2147483647;
        System.out.println(numerointeiro);
        //O tipo de variável Int só armazena valores inteiros de -2147483648 a 2147483647

        long numeroenorme;
        numeroenorme = 922337203685477000l;
        System.out.println(numeroenorme);
        //O tipo de variável Int só armazena valores inteiros de -922337203685477001 a 922337203685477000
        //OBS: Quando o número long for maior que o int já declarado se deve colo “l” no final do número

    }
}
