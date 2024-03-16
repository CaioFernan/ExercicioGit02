public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(23);
        soma.adicionarNumero(5);
        soma.adicionarNumero(50);
        soma.adicionarNumero(01);
        soma.adicionarNumero(89);

        soma.exibirNumeros();
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());

    }
}
