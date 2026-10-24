package examen;

public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int ocupa;

    public Playlist(){
        cabeza = null;
        cola = null;
        actual = null;
        ocupa = 0;
        
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    public NodoDoble getActual() {
        return actual;
    }

    public int getOcupa() {
        return ocupa;
    }
    
    //Insertar al final
    public void agregarCancion (Cancion c){
        NodoDoble nuevo = new NodoDoble(c);
        
        if(cabeza==null){
            cabeza=nuevo;
            cola=nuevo;
            actual=nuevo;
        } else{
            nuevo.setAnterior (cola);
            cola.setSiguiente(nuevo);
            cola=nuevo;
        }
        ocupa++;
    }
    
    public void mostrarPlaylist() {
        System.out.println("--- Playlist (" + ocupa + " canciones) ---");
        NodoDoble temp = cabeza;
        int numero = 1;
        while (temp != null) {
            Cancion c = temp.getDato();
            System.out.println(numero + ". " + c.getTitulo() + " - " + c.getArtista()
                    + " (" + c.getDuracion() + " seg)");
            temp = temp.getSiguiente();
            numero++;
        }
    }
    
    // Avanza a la siguiente cancion. Devuelve null si ya estaba en la cola.
    public Cancion siguiente() {
        if (actual == null || actual.getSiguiente() == null) {
            return null;
        }
        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    // vuelve a la cancion anterior da null si ya estaba en la cabeza.
    public Cancion anterior() {
        if (actual == null || actual.getAnterior() == null) {
            return null;
        }
        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    // Elimina el nodo actual y reconecta
    public void eliminarActual() {
        if (actual == null) {
            return;
        }

        NodoDoble previo = actual.getAnterior();
        NodoDoble proximo = actual.getSiguiente();

        if (previo == null && proximo == null) {
            // Unico nodo
            cabeza = null;
            cola = null;
            actual = null;
        } else if (previo == null) {
            // Nodo cabeza
            proximo.setAnterior(null);
            cabeza = proximo;
            actual = proximo;
        } else if (proximo == null) {
            // Nodo cola
            previo.setSiguiente(null);
            cola = previo;
            actual = previo;
        } else {
            // Nodo meitad
            previo.setSiguiente(proximo);
            proximo.setAnterior(previo);
            actual = proximo;
        }

        ocupa--;
    }

}
