public class Numero {
    private int numeroInt;

    public Numero(int numeroInt) {
        this.numeroInt = numeroInt;
    }

    public int getNumeroInt() {
        return numeroInt;
    }public void setNumeroInt(int numeroInt) {
        this.numeroInt = numeroInt;
    }

    @Override
    public String toString() {
        return "Numero [numeroInt=" + numeroInt + "]";
    }
}
