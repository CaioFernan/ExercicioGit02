import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
    private List<Numero> listNumero;

    public SomaNumeros() {
        this.listNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numeroInt){
        listNumero.add(new Numero(numeroInt));
    }

    public int calcularSoma(){
        int soma = 0;
        for (Numero n : listNumero) {
            soma = n.getNumeroInt() + n.getNumeroInt() ;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for (Numero ma : listNumero) {
            if(ma.getNumeroInt() > maior){
                maior = ma.getNumeroInt();
            }
        }
        return maior;
    }
    public void exibirNumeros(){
        System.out.println(listNumero);
    }
}
