package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: CLASE LIBRO ===\n");

        // Objeto creado con el constructor por defecto
        Libro libro1 = new Libro();

        // Objeto creado con el constructor parametrizado
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}