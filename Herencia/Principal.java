
package Herencia;

class PadreRicoPadrePobre extends Libro {
    String mensaje;
    public PadreRicoPadrePobre(String titulo, String autor, String mensaje) {
        super(titulo, autor);
        this.mensaje = mensaje;
    }
}
