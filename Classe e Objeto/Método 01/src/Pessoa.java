public class Pessoa {
    String nome;
    int idade;
    String nacionalidade;
    int anoNascimento;

    void mostrarAtributos(){
        System.out.format("O nome dessa pessoa eh %s, sua idade eh de %d anos, sua nacionalidade eh %s, e o seu ano de nascimento foi %d", nome, idade, nacionalidade, anoNascimento);
    }
}
//Nesse exemplo se é utilizada a funcionalidade do método