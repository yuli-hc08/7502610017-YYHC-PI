package ProyectoIntegrador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROYECTO INTEGRADOR ===\n");

        // 1. Lectura por consola para ingresar los datos de un Estudiante
        System.out.println("--- Ingrese los datos del Estudiante ---");
        System.out.print("Nombre: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); // Limpiar salto de línea
        System.out.print("Curso: ");
        String cursoEst = scanner.nextLine();

        // Instanciación con datos de la consola
        Estudiante estudiante = new Estudiante(nombreEst, edadEst, cursoEst);

        // 2. Instanciación de Libro y CuentaBancaria
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);
        CuentaBancaria cuenta = new CuentaBancaria("987654321", 250000.0, "Ahorros");

        // 3. Muestra de información utilizando toString()
        System.out.println("\n=== RESUMEN DE OBJETOS CREADOS ===");
        System.out.println(estudiante.toString());
        System.out.println(libro.toString());
        System.out.println(cuenta.toString());

        scanner.close();
    }
}