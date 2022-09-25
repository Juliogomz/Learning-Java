public class ou {
    public static void main(String[] args) throws Exception {

        //Pequeno exemplo apenas para contextualizar as funcionalidades

        int senha01 = 12345;
        int senha02 = 67890;

        int senhadigitada01 = 12345;
        int senhadigitada02 = 9876;

        boolean senhascorretas = senha01 == senhadigitada01 || senha02 == senhadigitada02;

        //Nesse caso ao menos um dos valores deve ser true para o final também ser true

        System.out.println(senhascorretas);

        //O resultado deu true pelo fato de ao menos a senha01 e a senhadigitada02 serem iguais


    }
}
