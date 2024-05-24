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



## Polimorfismo
### ¿Qué es el Polimorfismo🌀?
El polimorfismo es un principio clave en la programación orientada a objetos que permite que una misma operación o método se comporte de manera diferente en distintas clases. En otras palabras, el polimorfismo nos permite usar una única interfaz para interactuar con diferentes tipos de objetos. Esto es especialmente útil para hacer el código más flexible y reutilizable.

Para ilustrar esto con un ejemplo cotidiano, pensemos en un dispositivo multimedia que puede ser una radio, una televisión o un reproductor de música.

**Ejemplo de Polimorfismo con Dispositivos Multimedia**

__Imagina que tienes varios dispositivos para perder el tiempo en tu casa: una radio, una televisión y un reproductor de música. Todos estos dispositivos pueden "reproducir", pero cada uno lo hace a su manera.__


![image](https://github.com/Andre230906/Java/assets/156432253/8f7d534b-0235-4cf6-8db0-96495d75c7c4)



## ¿Cómo se aplica el Polimorfismo en este ejemplo?

**Radio:** Reproduce estaciones de radio.

**Televisión:** Reproduce canales de televisión.

**Reproductor de Música:** Reproduce canciones.


Todos estos dispositivos tienen una función común de "reproducir", pero cada uno la implementa de manera diferente.


Ahora, llevemos este concepto al código:

```
// Clase base abstracta que define el método reproducir
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

public class Main {
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

```

## ¿Cómo se aplica el Polimorfismo en este ejemplo?

***Clase Base Común:*** La clase Dispositivo define el método abstracto reproducir, que debe ser implementado por todas las clases derivadas.

***Sobrescritura de Métodos:*** Las clases Radio, Television y ReproductorDeMusica sobrescriben el método reproducir para proporcionar su propia implementación específica.

***Interfaz Común:*** A través de la clase base Dispositivo, podemos usar una interfaz común (reproducir) para interactuar con diferentes tipos de dispositivos multimedia.

Gracias al polimorfismo, podemos tratar a diferentes objetos de manera uniforme, lo que simplifica el diseño del código y lo hace más flexible y fácil de mantener.



## SOBRECARGA
https://www.youtube.com/shorts/YmOerjz4bTA?feature=share

### ¿Qué es la Sobrecarga🎛️?
La sobrecarga es un concepto en la programación orientada a objetos que permite definir múltiples métodos con el mismo nombre pero con diferentes parámetros dentro de la misma clase. Esto facilita el uso del mismo nombre de método para realizar distintas tareas según los argumentos proporcionados, mejorando la legibilidad y la organización del código.

### Para ilustrar esto con un ejemplo cotidiano, pensemos en un microwave (microondas).

**Ejemplo de Sobrecarga con un Microondas**

![image](https://github.com/Andre230906/Java/assets/156432253/ceddf92b-6f6c-4847-b69c-f1f936367228)


Imagina que tienes un microondas en tu casa.


El microondas puede calentar alimentos de diferentes maneras según el tipo de alimento y la cantidad de tiempo:

**Calentar una bebida:** Definido por el tiempo y la potencia.
**Calentar un plato de comida** Definido por el tiempo y el nivel de potencia.
**Descongelar:** Definido por el peso del alimento.


¿Cómo se aplica la Sobrecarga en este ejemplo?

Podemos crear diferentes métodos calentar en la clase Microondas para manejar estos diferentes casos de uso.

Ahora, llevemos este concepto al código:

```
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


```
### ¿Cómo se aplica la Sobrecarga en este ejemplo?

Mismo Nombre, Diferentes Firmas: Los métodos calentar tienen el mismo nombre pero diferentes listas de parámetros.

**calentar(int tiempo):** Para calentar una bebida.

**calentar(int tiempo, String potencia):** Para calentar un plato de comida.

**calentar(double peso):** Para descongelar un alimento.

**Facilita la Usabilidad:** Permite usar el método calentar de manera flexible según las necesidades, sin necesidad de recordar múltiples nombres de métodos diferentes.

**Mejora la Organización:** Agrupa funcionalidad relacionada en métodos con el mismo nombre, lo que hace el código más legible y organizado.

Con la sobrecarga, podemos simplificar la interfaz de nuestra clase y hacer que su uso sea más intuitivo, al permitir que un solo método maneje múltiples casos de uso.


