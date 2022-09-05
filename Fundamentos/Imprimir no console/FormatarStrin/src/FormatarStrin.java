public class FormatarStrin {
    public static void main(String[] args) throws Exception {

        String nome = "Julio";
        int idade = 18;
        char sexo = 'M';
        float altura = 1.83f;
        double peso = 80; 

        String texto = (nome + " eh um programador de " + idade + " anos de idade do sexo " + sexo +". Que pesa " + peso +"kg e tem " + altura + " de altura.");
        System.out.println(texto);

        //É possível se inserir valores em uma String por meio de concatenção de caracteres e variáveis.

        String texto2 = String.format("%s eh um programador de %d anos de idade do sexo %c. Que pesa %.2fkg e tem %.2fm de altura.", nome, idade, sexo, peso, altura);
        System.out.println(texto2);

        //Também é possível gravar um valor na String por meio da funcionalidade "Format".
    }
}
