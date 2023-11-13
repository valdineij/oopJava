package Animais;

/**
 * Representa um cachorro do mundo real.
 * Possui nome, cor, altura, peso e tamanho do rabo.
 * Pode latir e interagir
 */
public class Cachorro extends Animal {

    private int tamanhoDoRabo;
    static int numeroCachorros;

    public Cachorro() {
        this.estadoDeEspirito = "Neutro";
        numeroCachorros++;
    }

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroCachorros++;
    }

    public enum Acoes {
        carinho, pisarNaPatinha, vaiDormir, nada
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public int getNumerodeCachorros() {
        return numeroCachorros;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(Acoes acao) {
        switch (acao) {
            case carinho:
                this.estadoDeEspirito = "Feliz";
                break;
            case vaiDormir:
                this.estadoDeEspirito = "Bravo";
                break;
            case pisarNaPatinha:
                this.estadoDeEspirito = "Triste";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }
        return estadoDeEspirito;
        // if (acao.equals("carinho")) {
        // this.estadoDeEspirito = "Feliz";
        // } else if (acao.equals("vai dormir")) {
        // this.estadoDeEspirito = "Bravo";
        // } else if (acao.equals("pisar na patinha")){
        // this.estadoDeEspirito = "Triste";
        // } else {
        // this.estadoDeEspirito = "Neutro";
        // }

    }

    public void soar() {
        super.soar("Au, Au");
    }

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", tamanhoDoRabo="
                + tamanhoDoRabo + ", estadoDeEspirito=" + estadoDeEspirito + "]";
    }
}