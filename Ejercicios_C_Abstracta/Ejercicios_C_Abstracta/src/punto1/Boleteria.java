package punto1;

import Excepcion.BoletoAgotadoenStack;

public class Boleteria extends Cine {

	public Boleteria(int costoboleto, String nombrePelicula) {
		super(costoboleto, nombrePelicula);
		// TODO Auto-generated constructor stub
	}

	int boletaStack = 20;

	@Override
	public void CalcularValorBoletas(int bole) throws BoletoAgotadoenStack {
		if (bole > this.boletaStack) {
			throw new BoletoAgotadoenStack("No quedan más boletos joven");
		} else {
			int valorPagar = (this.costoboleto * bole);
			System.out.println("Usted debe pagar:" + valorPagar + "para la pelicula :" + this.nombrePelicula);
		}
	}

}
