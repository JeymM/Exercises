package Punto4;

public class CuentaAhorros extends Cuenta implements Movimientos {

	public CuentaAhorros(double numCuenta, float saldo, String nomPropietario) {
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
	public void Retirar(double valor) {
		this.cantRetiros++;
		if (this.cantRetiros > 3) {
			if (this.saldo >= valor) {
				double interes = (valor * 1) / 100;

				valor += interes;
				System.out.println("Ha retirado:" + valor);
				this.saldo -= valor;
			}
		}
	}

	@Override
	public void Depositar(double valor) {
		if (this.cantDeposito < 2) {
			double incremento = (this.saldo * 0.05);
			valor += incremento;
			System.out.println("Incremento es :" + incremento);
			System.out.println("Nuevo saldo: " + (this.saldo + valor) + "pesos");
		} else {
			System.out.println("Nuevo saldo: " + (this.saldo + valor) + "pesos");
		}
		this.cantDeposito++;
	}

}
