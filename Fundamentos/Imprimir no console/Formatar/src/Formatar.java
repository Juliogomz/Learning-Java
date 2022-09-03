public class Formatar {
    public static void main(String[] args) throws Exception {

        String nome = "Julio";
        int idade = 18;
        char sexo = 'M';
        float altura = 1.83f;
        double peso = 80; 
        
        System.out.format("%s eh um programador de %d anos de idade do sexo %c. Que pesa %.2fkg e tem %.2fm de altura.", nome, idade, sexo, peso, altura);
    }
}
        //Através da funcionalidade format é possível imprimir no console o valor 
        //das variáveis por meio dos indicadores.