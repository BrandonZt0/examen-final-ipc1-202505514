package examen;

public class NodoDoble {
   private Cancion dato;
   private NodoDoble anterior;
   private NodoDoble siguiente;
   
   public NodoDoble (Cancion dato){
       this.dato=dato;
       this.anterior=null;
       this.siguiente=null;
       
   }

    public Cancion getDato() {
        return dato;
    }

    public void setDato(Cancion dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
   
   
   
}
