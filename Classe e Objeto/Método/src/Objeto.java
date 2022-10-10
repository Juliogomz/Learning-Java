public class Objeto {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.anoNascimento = 2004;
        pessoa01.idade = 18;
        pessoa01.nacionalidade = "brasileiro";
        pessoa01.nome = "Julio";

        pessoa01.mostrarAtributos();
    }
}
