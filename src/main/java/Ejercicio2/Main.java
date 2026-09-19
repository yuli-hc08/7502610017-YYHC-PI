package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: CLASE CUENTA BANCARIA ===\n");

        // Instancia con constructor por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();

        // Instancia con constructor de 2 parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("987654321", "Corriente");

        // Instancia con constructor de 3 parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("123456789", 1500000.0, "Ahorros");

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();
    }
}