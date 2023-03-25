package punto1;

import Excepcion.BoletoAgotadoenStack;

public class Main {

	public static void main(String[] args) throws BoletoAgotadoenStack {
		Cine cine = new Boleteria(4500, "DeadPool");
		cine.CalcularValorBoletas(10);
	}

}
