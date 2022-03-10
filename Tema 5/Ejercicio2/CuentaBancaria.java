package Ejercicio2;

public class CuentaBancaria {

	private Cliente cliente;
	private double saldo;
	private String numeroCuenta;

	public CuentaBancaria(Cliente cliente, double saldo, String numeroCuenta) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void depositar(double cantidadIncrementada) {
		this.saldo += cantidadIncrementada;
	}

	public void transferencia(double cantidad, String Cuenta) {
		if (this.saldo >= cantidad) {
			this.setSaldo(this.saldo - cantidad);

		}
	}

}
