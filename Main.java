import Animais.Animal;
import Animais.Cachorro;
import Animais.Passaro;
import Animais.Gato;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro toto = new Cachorro("Totó", "Preto", 20, 2.5, 12);
        Cachorro rex = new Cachorro();
        toto.soar();
        System.out.println("O nome do cachorro é " + toto.getNome());
        System.out.println("O cachorro pegou uma " + toto.pegar());
        System.out.println("O cachorro está " + toto.interagir(Cachorro.Acoes.carinho));
        System.out.println("O cachorro está " + toto.interagir(Cachorro.Acoes.nada));
        System.out.println("O cachorro está " + toto.interagir(Cachorro.Acoes.vaiDormir));
        System.out.println("Rex está: " + rex.getEstadoDeEspirito());
        System.out.println(toto.toString());
        System.out.println(rex.toString());
        System.out.println(rex.getNumerodeCachorros());
        System.out.println("Passaros: " + Passaro.getNumeroDePassaros());

        Petshop petshop = new Petshop();
        petshop.darBanho(rex);
        System.out.println("Rex está se sentindo: " + rex.getEstadoDeEspirito());
        petshop.tosar(toto);
        System.out.println("Totó está se sentindo: " + toto.getEstadoDeEspirito());

        // Polimorfismo
        // a classe de referencia do objeto gato é Animal, mas a classe de fato é Gato,
        // que herda de Animal
        Animal gato = new Gato();
        petshop.darBanho(gato);

    }
}
