package Punto4;

import Excepcion.LimiteRetiros;

public class CuentaCorriente extends Cuenta implements Movimientos {

	public CuentaCorriente(double numCuenta, float saldo, String nomPropietario) {
		super(numCuenta, saldo, nomPropietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Imprimir() {
		String mensaje = "Numero de Cuenta" + this.numCuenta + "Nombre del propietario" + this.nomPropietario
				+ "Saldo de su cuenta:" + this.saldo;
		System.out.println(mensaje);

	}

	@Override
	public void Retirar(double valor) throws LimiteRetiros {
		this.cantRetiros++;
		try {
			if (this.cantRetiros > 5) {
				throw new LimiteRetiros("No puede realizar mas de cinco retiros");
			} else {
				this.saldo -= valor;
			}
		} catch (LimiteRetiros e) {

			e.printStackTrace();
		}

	}

	@Override
	public void Depositar(double valor) {
		System.out.println("Nuevo saldo: " + (this.saldo + valor) + "pesos");

	}

}
