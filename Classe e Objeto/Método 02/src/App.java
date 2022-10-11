public class App {
    public static void main(String[] args) throws Exception {
        Carro peugeot = new Carro();
        peugeot.anoDaCompra = 2020;
        peugeot.anoFabricacao = 2019;
        peugeot.kmRodados = 500000;
        peugeot.marca = "Peugeot";

        peugeot.imprimirInformacoes();
    }
}
