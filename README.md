# ☕Java Tarea☕

## Herencia
### ¿Que es  la Herencia👩‍👦‍👦?
~~es el proceso por el cual las características de los progenitores se transmiten a sus descendientes~~....en resumidas palabras es lo que un padre le da a su hija, esto es el arte de reutilizar codigo, usar algo que ya programaste en algo que haras, *Es copiar y pegar codigo de manera elegante*
Aqui va el ejemplo de manera didactica:
Tenemos una base libro:
![image](https://github.com/Andre230906/Java/assets/156432253/ceeff36b-2967-4940-851f-ecf6f79cfb19)


Y con ese libro que cuenta con paginas, guardas, portada etc, podemos crear un libro con otras caracteristicas como por ejemplo volverlo en padre rico y padre pobre: 

![image](https://github.com/Andre230906/Java/assets/156432253/83647330-8a8a-495b-973d-31510fdf04ac)

Ahora que tiene que ver todo eso con la herencia en el POO
Miremos el mismo ejemplo pero con diferentes palabras
Tenemos la clase libro:
![image](https://github.com/Andre230906/Java/assets/156432253/ceeff36b-2967-4940-851f-ecf6f79cfb19)

y queremos crear la clase libro padre rico padre pobre


![image](https://github.com/Andre230906/Java/assets/156432253/83647330-8a8a-495b-973d-31510fdf04ac)


La clase libro heredara todos sus atributos (que son hojas, guardas, portada) a clase padre rico padre pobre y ahora siguen siendo iguales, como volvemos clase libro en clase libro padre rico padre pobre, sencillo añadimos los extras que deseamos como por ejemplo: contenido, iamgenes, colores y esto nos dara ese resultado.

La clase que otorga sus atributos es llamada **clase padre** que este caso seria clase libro, y la clase que recibe los atributos es llamada **clase hija o subclase** que seria clase libro padre rico y padre pobre 
entonces en resumida cuentas la herencia es una plantilla de atributos que entrega sus caracteristicas a su subclase para asi reciclar codigo y mantener la misma estructura.


**CODIGO**


```



class Libro {
    String titulo;
    String autor;
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
class PadreRicoPadrePobre extends Libro {
    String mensaje;
    public PadreRicoPadrePobre(String titulo, String autor, String mensaje) {
        super(titulo, autor);
        this.mensaje = mensaje;
    }
}
PadreRicoPadrePobre libroPadreRicoPadrePobre = new PadreRicoPadrePobre("Padre Rico, Padre Pobre", "Robert T. Kiyosaki", "Mensaje inspirador sobre finanzas personales y educación financiera.");



```

## Encapsulamiento

### ¿Qué es el Encapsulamiento🔒?
El encapsulamiento es un concepto fundamental en la programación orientada a objetos (POO) que se refiere a la práctica de mantener los detalles internos de un objeto ocultos del mundo exterior. Solo se permite el acceso a través de métodos específicos. En otras palabras, es como si pusieras una capa protectora alrededor de tus datos y funciones, permitiendo acceso controlado. Esto ayuda a proteger la integridad de los datos y a prevenir el mal uso.

Para ilustrar esto con un ejemplo cotidiano, pensemos en una cafetera.

### Ejemplo de Encapsulamiento con una Cafetera
Imagina que tienes una cafetera en tu casa.


![image](https://github.com/Andre230906/Java/assets/156432253/3b4e498c-6b1c-4cb3-b69e-ddd9f19f0eae)

La cafetera tiene varias partes internas y procesos que no ves directamente, como:

***-Depósito de agua***
***-Sistema de calentamiento***
***-Mecanismo de filtrado***
**-Desde fuera, solo interactúas con la cafetera mediante botones y palancas:**

***-Botón de encendido/apagado***
***-Selector de cantidad de café***
***-Botón de inicio***
No necesitas saber cómo el agua se calienta o cómo pasa por el filtro, solo usas los controles externos para hacer tu café.

Ahora, llevemos este concepto al código:

```
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

public class Main {
    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();
        miCafetera.llenarAgua(500);
        miCafetera.prepararCafe();
    }
}

```
## ¿Cómo se aplica el Encapsulamiento en este ejemplo?
**Datos Privados:** Los atributos cantidadAgua y temperatura están encapsulados, es decir, son privados y no accesibles directamente desde fuera de la clase Cafetera.
**Acceso Controlado:** Los métodos llenarAgua y prepararCafe son públicos y permiten interactuar con la cafetera de una manera controlada.
**Funciones Internas:** El método calentarAgua es privado, lo que significa que solo puede ser llamado dentro de la clase Cafetera y no desde fuera.
Así, el encapsulamiento protege la integridad de los datos internos de la cafetera y proporciona una interfaz clara y segura para interactuar con ella.
