
package Polimorfismo;
    abstract class Dispositivo {
    public abstract void reproducir();
}

// Clase Radio que extiende Dispositivo y sobrescribe el método reproducir
class Radio extends Dispositivo {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la estación de radio...");
    }
}

// Clase Television que extiende Dispositivo y sobrescribe el método reproducir
class Television extends Dispositivo {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el canal de televisión...");
    }
}

// Clase ReproductorDeMusica que extiende Dispositivo y sobrescribe el método reproducir
class ReproductorDeMusica extends Dispositivo {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la canción...");
    }
}

