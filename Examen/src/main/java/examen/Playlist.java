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

}
