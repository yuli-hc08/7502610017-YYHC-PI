package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: CLASE ESTUDIANTE ===\n");

        // 1. Constructor por defecto
        Estudiante e1 = new Estudiante();

        // 2. Constructor de 2 parámetros
        Estudiante e2 = new Estudiante("María Pérez", 20);

        // 3. Constructor de 3 parámetros (que usa esta())
        Estudiante e3 = new Estudiante("Juan Gómez", 22, "Programación Orientada a Objetos");

        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();
    }
}