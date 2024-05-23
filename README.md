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


`
class Libro {
    String titulo;
    String autor;
``
    // Constructor de la clase Libro
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
`
``
class PadreRicoPadrePobre extends Libro {
    String mensaje;
``
    public PadreRicoPadrePobre(String titulo, String autor, String mensaje) {
        super(titulo, autor);
        this.mensaje = mensaje;
    }
}
``

PadreRicoPadrePobre libroPadreRicoPadrePobre = new PadreRicoPadrePobre("Padre Rico, Padre Pobre", "Robert T. Kiyosaki", "Mensaje inspirador sobre finanzas personales y educación financiera.");
`
``
