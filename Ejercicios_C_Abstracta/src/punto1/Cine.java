package punto1;

import Excepcion.BoletoAgotadoenStack;

public abstract class Cine {

	int costoboleto;
	String nombrePelicula;

	public Cine(int costoboleto, String nombrePelicula) {
		super();
		this.costoboleto = costoboleto;
		this.nombrePelicula = nombrePelicula;
	}

	public abstract void CalcularValorBoletas(int bole) throws BoletoAgotadoenStack;

}
