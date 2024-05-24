
package Encapsulacion;

public class Cafetera {
  private int cantidadAgua; // Depósito de agua
    private int temperatura;  // Sistema de calentamiento

    // Método para llenar el depósito de agua
    public void llenarAgua(int cantidad) {
        this.cantidadAgua = cantidad;
        System.out.println("Depósito de agua lleno con " + cantidad + " ml.");
    }

    // Método para iniciar el proceso de preparación del café
    public void prepararCafe() {
        if (cantidadAgua > 0) {
            calentarAgua();
            System.out.println("Preparando el café...");
            // Proceso de filtrado y preparación del café
        } else {
            System.out.println("Por favor, llena el depósito de agua.");
        }
    }

    // Método privado para calentar el agua
    private void calentarAgua() {
        this.temperatura = 90; // Calienta el agua a 90 grados
        System.out.println("El agua está caliente.");
    }


}
