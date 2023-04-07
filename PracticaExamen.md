# Ejercicios Repaso programacion
### Enunciados de ejercicios sobre polimorfismo y herencia en java con mi solucion
## Ej 1
Enunciado:<br>
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