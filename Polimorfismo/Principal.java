
package Polimorfismo;
    public class Principal {
    public static void main(String[] args) {
        // Crear instancias de los dispositivos
        Dispositivo miRadio = new Radio();
        Dispositivo miTelevision = new Television();
        Dispositivo miReproductorDeMusica = new ReproductorDeMusica();

        // Usar el mismo método reproducir en diferentes dispositivos
        miRadio.reproducir();
        miTelevision.reproducir();
        miReproductorDeMusica.reproducir();
    }
}
