package Ejercicio3;

public class Estudiante {
    public String nombre;
    public int edad;
    public String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Por asignar";
    }

    // 3. Constructor con todos los parámetros usando this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor de 2 parámetros
        this.curso = curso;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Curso: " + curso);
    }
}