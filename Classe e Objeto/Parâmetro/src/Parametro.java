public class Parametro{

    int anoDaCompra;
    int anoFabricacao;
    double kmRodados;

    void imprimirInformacoes(String marca){
    System.out.format("A marca do carro eh %s, o ano da compra foi %d, o ano de fabricacao foi %d, e os quilometros rodados foram %.2f", marca, anoDaCompra, anoFabricacao, kmRodados);
    }
}