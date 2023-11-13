package Animais;

public class Passaro extends Animal {
    static int numeroDePassaros;

    public Passaro() {
        numeroDePassaros++;
    }

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

}
