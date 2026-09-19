package ProyectoIntegrador;

public class CuentaBancaria {
    public String numeroCuenta;
    public double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número: " + numeroCuenta + ", Tipo: " + tipoCuenta + ", Saldo: $" + saldo + "]";
    }
}