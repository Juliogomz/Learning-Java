public class Carro {
    String marca;
    int anoDaCompra;
    int anoFabricacao;
    double kmRodados;

    void imprimirInformacoes(){
    System.out.format("A marca do carro eh %s, o ano da compra foi %d, o ano de fabricacao foi %d, e os quilometros rodados foram %.2f", marca, anoDaCompra, anoFabricacao, kmRodados);
    }
}
