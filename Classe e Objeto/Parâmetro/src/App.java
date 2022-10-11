public class App {
    public static void main(String[] args) throws Exception {
        Parametro peugeot = new Parametro();
        peugeot.anoDaCompra = 2020;
        peugeot.anoFabricacao = 2019;
        peugeot.kmRodados = 500000;

        peugeot.imprimirInformacoes("Peugeot");
    }
}
