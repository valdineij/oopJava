package Animais;

public class Gato extends Animal {
    static int numeroDeGatos;

    public Gato() {
        numeroDeGatos++;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + this.nome + "]";
    }

    public void soar() {
        super.soar("Miau, miau");
    }
}
