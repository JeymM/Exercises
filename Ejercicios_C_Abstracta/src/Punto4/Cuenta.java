package Punto4;

public abstract class Cuenta {

	double numCuenta;
	float saldo;
	String nomPropietario;
	int cantDeposito = 0;
	int cantRetiros = 0;

	public Cuenta(double numCuenta, float saldo, String nomPropietario) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.nomPropietario = nomPropietario;

	}

	public abstract void Imprimir();

}
