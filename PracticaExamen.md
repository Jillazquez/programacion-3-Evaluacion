# Ejercicios Repaso programacion
### Enunciados de ejercicios sobre polimorfismo y herencia en java con mi solucion
## Ej 1
<b>Enunciado:</b><br>
Ejercicio: Sistema de Empleados

Se desea modelar un sistema que permita gestionar empleados de una empresa. Para ello, se han definido las siguientes clases:

Empleado: Esta es la clase base para todos los empleados de la empresa. Cada empleado tiene un nombre, un salario y una antigüedad en años.

EmpleadoTemporal: Esta clase representa a un empleado temporal, que es contratado para trabajar durante un período determinado de tiempo. Además de los atributos de la clase Empleado, un empleado temporal tiene una fecha de inicio y una fecha de fin de contrato.

EmpleadoPermanente: Esta clase representa a un empleado permanente, que trabaja en la empresa de forma indefinida. Además de los atributos de la clase Empleado, un empleado permanente tiene una categoría, que puede ser "junior" o "senior".

Se pide implementar las siguientes funcionalidades:

Implementa la clase Empleado con un constructor que reciba los siguientes parámetros: nombre, salario y antiguedad.

Implementa la clase EmpleadoTemporal que herede de la clase Empleado y que tenga un constructor que reciba los siguientes parámetros: nombre, salario, antiguedad, fechaInicio y fechaFin.

Implementa la clase EmpleadoPermanente que herede de la clase Empleado y que tenga un constructor que reciba los siguientes parámetros: nombre, salario, antiguedad y categoria.

Implementa un método calculaSalario en la clase Empleado que calcule el salario de un empleado en función de su antigüedad en la empresa. La fórmula para calcular el salario es la siguiente:

Si el empleado tiene menos de 1 año de antigüedad, el salario es igual al salario base.
Si el empleado tiene entre 1 y 3 años de antigüedad, el salario es igual al salario base más un 5% por cada año de antigüedad.
Si el empleado tiene más de 3 años de antigüedad, el salario es igual al salario base más un 10% por cada año de antigüedad.

Implementa un método calculaSalario en la clase EmpleadoTemporal que calcule el salario de un empleado temporal. El salario de un empleado temporal es igual al salario base.

Implementa un método calculaSalario en la clase EmpleadoPermanente que calcule el salario de un empleado permanente. El salario de un empleado permanente se calcula de la misma forma que el salario de un empleado, pero se le aplica un descuento del 5% si su categoría es "junior".

Crea un programa que cree varios empleados (al menos 1 temporal y 1 permanente) y que calcule el salario de cada uno de ellos.

Nota: Puedes implementar cualquier método o atributo adicional que consideres necesario para resolver el ejercicio.
<br>

[Solucion](PracticaExamen_1/Empleado.java)

## Ej 2
En una universidad, se maneja la información de estudiantes, profesores y personal administrativo. Todos ellos comparten algunas características en común, como el nombre y la edad, pero también tienen algunas características específicas.

Los estudiantes tienen un número de matrícula, una carrera y un promedio. Los profesores tienen un número de trabajador, una especialidad y un sueldo. El personal administrativo tiene un número de trabajador, un área y un horario.

Además, se necesita una clase llamada "Persona" que tenga los atributos comunes a todas las personas (nombre y edad) y un método "mostrarInformacion()" que imprima los atributos de la persona.

Se pide implementar las siguientes clases:

La clase "Persona", con los atributos "nombre" y "edad", y el método "mostrarInformacion()".

La clase "Estudiante", que hereda de "Persona" y tiene los atributos "numeroMatricula", "carrera" y "promedio". Además, implementa un método "mostrarInformacion()" que imprima los atributos del estudiante.

La clase "Profesor", que hereda de "Persona" y tiene los atributos "numeroTrabajador", "especialidad" y "sueldo". Además, implementa un método "mostrarInformacion()" que imprima los atributos del profesor.

La clase "Administrativo", que hereda de "Persona" y tiene los atributos "numeroTrabajador", "area" y "horario". Además, implementa un método "mostrarInformacion()" que imprima los atributos del personal administrativo.

La clase "Universidad", que contiene una lista de personas (estudiantes, profesores y personal administrativo) y un método "mostrarInformacion()" que imprima la información de todas las personas en la lista.

[Solucion](PracticaExamen_2/Persona.java)

## Ej 3
Se desea implementar un sistema de gestión de vehículos. Se tienen tres tipos de vehículos: coches, motos y camiones. Todos los vehículos tienen una marca, un modelo y un año de fabricación.

Los coches tienen además un número de puertas y un tipo de combustible (gasolina, diésel o eléctrico).

Las motos tienen un cilindraje y un tipo de transmisión (manual o automática).

Los camiones tienen un peso máximo de carga y un tipo de combustible (gasolina, diésel o gas).

Se pide implementar las clases necesarias para representar estos vehículos y poder realizar las siguientes operaciones:

Crear un objeto de cada tipo de vehículo.
Mostrar la información de cada vehículo.
Calcular el impuesto a pagar por cada vehículo, el cual se calcula multiplicando el año de fabricación por un factor que depende del tipo de combustible y del tipo de vehículo:
Coches: gasolina 0.05, diésel 0.07, eléctrico 0.01.
Motos: gasolina 0.03, diésel 0.05, eléctrico 0.005.
Camiones: gasolina 0.1, diésel 0.15, gas 0.05.

Implementa una solución utilizando herencia y polimorfismo para resolver este problema.

[Solucion](PracticaExamen_3/Vehiculo.java)
## Ej 4
Enunciado examen (Sin completar)

[Solucion](PracticaExamen_4/Electrodomestico.java)

## Ej 5
Ejercicio: Sistema de figuras geométricas

Se desea modelar un sistema que permita calcular el área y el perímetro de varias figuras geométricas. Para ello, se han definido las siguientes clases:

FiguraGeometrica: Esta es la clase base para todas las figuras geométricas. Cada figura geométrica tiene una cantidad de lados y una lista de medidas para cada uno de ellos.

Triangulo: Esta clase representa a un triángulo. Además de los atributos de la clase FiguraGeometrica, un triángulo tiene un tipo, que puede ser "equilátero", "isósceles" o "escaleno".

Cuadrado: Esta clase representa a un cuadrado. Además de los atributos de la clase FiguraGeometrica, un cuadrado tiene un lado.

Circulo: Esta clase representa a un círculo. Además de los atributos de la clase FiguraGeometrica, un círculo tiene un radio.

Se pide implementar las siguientes funcionalidades:

Implementa la clase FiguraGeometrica con un constructor que reciba la cantidad de lados y una lista de medidas para cada uno de ellos.

Implementa la clase Triangulo que herede de la clase FiguraGeometrica y que tenga un constructor que reciba la cantidad de lados, una lista de medidas para cada uno de ellos y el tipo de triángulo.

Implementa la clase Cuadrado que herede de la clase FiguraGeometrica y que tenga un constructor que reciba la medida de uno de sus lados.

Implementa la clase Circulo que herede de la clase FiguraGeometrica y que tenga un constructor que reciba la medida de su radio.

Implementa un método calculaArea en la clase FiguraGeometrica que calcule el área de la figura geométrica.

Implementa un método calculaPerimetro en la clase FiguraGeometrica que calcule el perímetro de la figura geométrica.

Implementa los métodos calculaArea y calculaPerimetro en las clases Triangulo, Cuadrado y Circulo de forma que calcule el área y el perímetro de cada figura geométrica en particular.

Crea un programa que cree varias figuras geométricas (al menos un triángulo, un cuadrado y un círculo) y que calcule el área y el perímetro de cada una de ellas.

[Solucion](PracticaExamen_5/FigurasGeometricas.java)
## Ej 6
Ejercicio de programación orientada a objetos

Crea una clase Persona que tenga los siguientes atributos:

nombre (String)
edad (int)
dni (String)

La clase deberá tener un constructor que acepte como argumentos los valores iniciales de los atributos, y un método toString() que retorne una cadena con la información de la persona.

Crea una subclase Estudiante que herede de Persona y que además tenga los siguientes atributos:

matricula (String)
promedio (double)

La subclase deberá tener un constructor que acepte como argumentos los valores iniciales de todos los atributos, y un método toString() que retorne una cadena con la información del estudiante.

Crea una subclase Profesor que herede de Persona y que además tenga los siguientes atributos:

especialidad (String)
salario (double)

La subclase deberá tener un constructor que acepte como argumentos los valores iniciales de todos los atributos, y un método toString() que retorne una cadena con la información del profesor.

En el método main de una clase Main, crea un objeto Estudiante y un objeto Profesor, y utiliza el método toString() para imprimir la información de cada uno.
Indicaciones

Utiliza los modificadores de acceso adecuados para los atributos y métodos de las clases.
Asegúrate de que la información se muestra correctamente al utilizar el método toString() para cada objeto.

[Solucion](PracticaExamen_6/Persona.java)
## Ej 7
Parte 1: Diseñando clases

Diseña una clase llamada Vehiculo con las siguientes propiedades:

marca (String)
modelo (String)
anio (int)
color (String)

Diseña una clase llamada Coche que herede de la clase Vehiculo y tenga las siguientes propiedades adicionales:

tipoCombustible (String)
capacidadCombustible (double)

Diseña una clase llamada Moto que herede de la clase Vehiculo y tenga las siguientes propiedades adicionales:

cilindrada (int)
tipoMoto (String)

Parte 2: Implementando métodos

Añade a la clase Vehiculo los siguientes métodos:

Un constructor que acepte todas las propiedades como parámetros.
Getters y setters para todas las propiedades.
Un método llamado arrancar que imprima "El vehículo ha arrancado".
Un método llamado detener que imprima "El vehículo se ha detenido".

Añade a la clase Coche los siguientes métodos:

Un constructor que acepte todas las propiedades como parámetros, incluyendo las propiedades heredadas.
Getters y setters para todas las propiedades adicionales.
Un método llamado cargarCombustible que acepte una cantidad de combustible como parámetro y sume esa cantidad a la capacidad de combustible del coche.
Un método llamado conducir que acepte una distancia como parámetro y reduzca la capacidad de combustible del coche en función del consumo (10 km/litro por defecto). Si no hay suficiente combustible, debe imprimir "No hay suficiente combustible para recorrer esa distancia".

Añade a la clase Moto los siguientes métodos:

Un constructor que acepte todas las propiedades como parámetros, incluyendo las propiedades heredadas.
Getters y setters para todas las propiedades adicionales.
Un método llamado hacerCaballito que imprima "La moto está haciendo un caballito".
Un método llamado cambiarAceite que imprima "Se ha cambiado el aceite de la moto".

Parte 3: Prueba de las clases

Crea un objeto de la clase Coche y otro objeto de la clase Moto.
Imprime las propiedades de cada objeto.
Utiliza los métodos arrancar y detener en ambos objetos.
Utiliza el método cargarCombustible en el objeto Coche.
Utiliza el método conducir en el objeto Coche.
Utiliza el método hacerCaballito en el objeto Moto.
Utiliza el método cambiarAceite en el objeto Moto.
Imprime las propiedades de cada objeto de nuevo para verificar que los métodos han funcionado correctamente.
[Solucion](PracticaExamen_7/Vehiculo.java)

## Ej 8
¡Por supuesto! Aquí te dejo un ejercicio similar sin dar pistas sobre cómo implementarlo:

Crea una clase abstracta llamada "Animal" con los siguientes atributos:

Un nombre
Una edad
Un género

Crea tres clases que extiendan de "Animal": "Perro", "Gato" y "Pájaro". Cada una de estas clases debe tener un método que permita que el animal haga su sonido característico.

Crea una interfaz llamada "Mascota" con los siguientes métodos:

"jugar()": método que permita jugar con la mascota.
"alimentar()": método que permita alimentar a la mascota.

Haz que la clase "Perro" implemente la interfaz "Mascota". Implementa los métodos de la interfaz de tal forma que al jugar con el perro, este muestre en pantalla un mensaje de felicidad y al alimentarlo muestre un mensaje de agradecimiento.

Haz lo mismo para la clase "Gato", pero en este caso, al jugar con el gato, este debería mostrar en pantalla un mensaje de indiferencia y al alimentarlo, un mensaje de agradecimiento.

Por último, haz que la clase "Pájaro" también implemente la interfaz "Mascota". Implementa los métodos de tal forma que al jugar con el pájaro, este muestre en pantalla un mensaje de felicidad y al alimentarlo muestre un mensaje de agradecimiento.

Crea una clase "Dueño" con los siguientes atributos:

Un nombre
Una edad
Una lista de mascotas.

Agrega a la clase "Dueño" un método llamado "jugarConMascotas()" que llame al método "jugar()" de cada una de sus mascotas.

Agrega a la clase "Dueño" un método llamado "alimentarMascotas()" que llame al método "alimentar()" de cada una de sus mascotas.

Crea una instancia de "Dueño" y agrégale un perro, un gato y un pájaro.

Llama al método "jugarConMascotas()" y "alimentarMascotas()" para la instancia creada en el paso anterior.

[Solucion](PracticaExamen_8/Animal.java)

## Ej 9
Ejercicio:

Imagina que trabajas para una empresa de ventas de coches, y te han encargado implementar un programa para la gestión de su inventario. Cada coche en el inventario tiene una marca, un modelo, un año de fabricación, un precio de venta y un número de unidades disponibles. Tu objetivo es implementar las clases necesarias para representar los coches en el programa.

Los requisitos son los siguientes:

    La clase Coche debe tener los siguientes atributos:

    Marca (String)
    Modelo (String)
    Año de fabricación (int)
    Precio de venta (double)
    Unidades disponibles (int)

    Debe haber un constructor que permita crear un objeto Coche con los atributos indicados.

    Debe haber métodos de acceso (getters) para obtener los valores de los atributos.

    Debe haber métodos de modificación (setters) para modificar los valores de los atributos Precio de venta y Unidades disponibles.

    Debe haber un método toString que permita obtener una cadena con la información del coche en formato legible.

    Debe haber un método equals que permita comparar dos coches y determinar si son iguales o no (dos coches son iguales si tienen la misma marca, modelo y año de fabricación).

    Debe haber un método vender que permita reducir el número de unidades disponibles en uno cada vez que se vende un coche.

    Debe haber un método añadir que permita aumentar el número de unidades disponibles en una cantidad dada cada vez que se añaden coches al inventario.

    Debe haber un método buscar que permita buscar un coche en el inventario por marca, modelo y año de fabricación, y devolver el objeto Coche correspondiente si se encuentra o null si no se encuentra.

    En la clase principal del programa, se deben crear varios objetos Coche y realizar algunas operaciones sobre ellos, como cambiar el precio de venta de uno de los coches, vender un coche y añadir varios coches al inventario.

    Al final del programa, se debe imprimir la lista de coches en el inventario en formato legible, con un coche por línea, incluyendo su marca, modelo, año de fabricación, precio de venta y número de unidades disponibles.

¡Espero que te guste este ejercicio y te ayude a practicar! Si tienes alguna pregunta, no dudes en preguntar.

[Solucion](PracticaExamen_9/Coche.java)

## Ej 10
¡Por supuesto! Aquí te dejo un ejercicio que incluye herencia, polimorfismo y excepciones:

Supongamos que se desea desarrollar una aplicación para una tienda que vende libros, música y películas. La tienda ofrece descuentos a sus clientes fieles. Todos los productos de la tienda tienen un título y un precio. Además, los libros tienen un autor y un número de páginas, la música tiene un artista y un género, y las películas tienen un director y un género.

Se pide implementar el siguiente modelo de clases:

La clase Producto representa un producto genérico de la tienda. Tiene como atributos el título y el precio. Esta clase debe implementar los métodos getTitulo, setTitulo, getPrecio y setPrecio.

La clase Libro es una subclase de Producto. Además de los atributos de Producto, tiene un autor y un número de páginas. Esta clase debe implementar los métodos getAutor, setAutor, getNumPaginas y setNumPaginas.

La clase Musica es una subclase de Producto. Además de los atributos de Producto, tiene un artista y un género. Esta clase debe implementar los métodos getArtista, setArtista, getGenero y setGenero.

La clase Pelicula es una subclase de Producto. Además de los atributos de Producto, tiene un director y un género. Esta clase debe implementar los métodos getDirector, setDirector, getGenero y setGenero.

La clase Cliente representa un cliente de la tienda. Tiene como atributos el nombre del cliente y un número de identificación. Además, tiene un método comprar que recibe un producto y su cantidad y lo agrega a una lista de compras. La clase debe implementar también el método getDescuento, que devuelve el descuento que el cliente tiene en sus compras.

La clase Tienda representa la tienda en sí. Tiene como atributos una lista de clientes y una lista de productos disponibles. Además, tiene un método vender que recibe un cliente, un producto y su cantidad y actualiza la lista de compras del cliente y la lista de productos disponibles. Si el cliente es un cliente fiel, el precio del producto se reducirá en un 10%. Si el producto no está disponible, se lanzará una excepción ProductoNoDisponibleException.

Para probar la implementación, se debe crear una instancia de la clase Tienda y agregar algunos clientes y productos. Luego, se deben realizar algunas compras y verificar que el descuento de los clientes fieles se aplique correctamente.

¡Espero que te sirva como práctica! Si tienes alguna pregunta o necesitas ayuda, no dudes en preguntar.

[Solucion](PracticaExamen_010/Cliente.java)

## Ej 11
