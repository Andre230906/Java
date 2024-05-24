package Sobrecarga;


public class Microondas {
    // Método para calentar una bebida con tiempo y potencia predeterminados
    public void calentar(int tiempo) {
        System.out.println("Calentando bebida por " + tiempo + " segundos a potencia media.");
    }

    // Sobrecarga del método calentar para calentar un plato de comida con tiempo y nivel de potencia específicos
    public void calentar(int tiempo, String potencia) {
        System.out.println("Calentando comida por " + tiempo + " segundos a potencia " + potencia + ".");
    }

    // Sobrecarga del método calentar para descongelar basado en el peso del alimento
    public void calentar(double peso) {
        System.out.println("Descongelando " + peso + " kg de alimento.");
    }
     public static void main(String[] args) {
        Microondas miMicroondas = new Microondas();
        
        // Usar los métodos sobrecargados
        miMicroondas.calentar(30); // Calentar una bebida
        miMicroondas.calentar(60, "alta"); // Calentar un plato de comida
        miMicroondas.calentar(1.5); // Descongelar un alimento
    }
}
