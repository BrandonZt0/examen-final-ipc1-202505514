package examen;

public class Examen {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Despacito", 180, "No me acuerdo");
        Cancion c2 = new Cancion("No se", 200, "desoconocido");
        Cancion c3 = new Cancion("La nave del olvido", 220, "jose jose");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();

        Playlist playlist = new Playlist();
        playlist.agregarCancion(c1);
        playlist.agregarCancion(c2);
        playlist.agregarCancion(c3);

        System.out.println();
        playlist.mostrarPlaylist();
        
        System.out.println();
        playlist.siguiente();      // reproduce cancion 2
        playlist.siguiente();      // reproduce cancion 3
        playlist.anterior();       // reproduce cancion 2
        playlist.eliminarActual(); // elimina cancion 2

        System.out.println();
        playlist.mostrarPlaylist();
    }
}
