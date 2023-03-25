package Punto4;

import Excepcion.LimiteRetiros;

public class Main {
	public static void main(String[] args) throws LimiteRetiros {
		CuentaAhorros cuenta = new CuentaAhorros(558745, 30000, "Jeym ");
		CuentaCorriente corriente = new CuentaCorriente(789865, 50000, "Marina");
		cuenta.Depositar(10000);
		cuenta.Retirar(5000);
		cuenta.Retirar(5000);
		cuenta.Retirar(5000);
		cuenta.Retirar(5000);
		cuenta.Imprimir();

		corriente.Retirar(5000);
		corriente.Retirar(5000);
		corriente.Depositar(2000);
		corriente.Imprimir();

	}

}
