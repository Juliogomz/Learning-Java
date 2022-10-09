
public class Objeto {
    public static void main(String[] args) throws Exception {
        
        Camisa camisaA = new Camisa();

        camisaA.cor = "vermelha";
        camisaA.preco = 50;
        camisaA.tamanho = "G";
        camisaA.tipo = "polo";

        System.out.format("A sua camisa eh %s, do tamanho %s, do tipo %s, de preco de %d", camisaA.cor, camisaA.tamanho, camisaA.tipo, camisaA.preco);
    }
}
