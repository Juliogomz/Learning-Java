public class Objeto {
    public static void main(String[] args) throws Exception {
        Televisao smart = new Televisao();
        smart.anoDaCompra = 2019;
        smart.polegadas = 20;
        smart.preco = 4000;
        smart.tipo = "SmartTV";

        System.out.format("Televisao do tipo %s, de %d polegadas, comprada no ano de %d por %.2fR$", smart.tipo, smart.polegadas, smart.anoDaCompra, smart.preco);
    }
}
