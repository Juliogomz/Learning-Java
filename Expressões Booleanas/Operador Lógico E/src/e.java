public class e {
    public static void main(String[] args) throws Exception {

        //Pequeno exemplo apenas para contextualizar as funcionalidades

        String usuario = "Julho";
        String senha = "12345";

        String usuariodigitado = "Cesar";
        String senhadigitada= "54321";

        boolean logincerto = usuario == usuariodigitado && senha == senhadigitada;

        //Ambos precisam ser true para o resultado final também ser true

        System.out.println(logincerto);

        //O resultado foi false porque ambos não são congruentes ao considerado true
    }
}
