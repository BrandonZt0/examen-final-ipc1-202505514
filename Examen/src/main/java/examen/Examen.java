
package examen;

public class Examen {

    public static void main(String[] args) {
                Cancion c1 = new Cancion("Cancion 1", 180, "Artista A");
        Cancion c2 = new Cancion("Cancion 2", 200, "Artista B");
        Cancion c3 = new Cancion("Cancion 3", 220, "Artista C");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
    }
}
