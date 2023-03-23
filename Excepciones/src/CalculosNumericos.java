
public class CalculosNumericos {
	double numero;

	public static void Raiz(double numero) {
		
			double CalculoRaiz = Math.sqrt(numero);
			if (numero < 0) {
				throw new ArithmeticException("No existen raíces cuadradas de número negativos");
			
			} else {
				System.out.println("La raiz cuadrada de: " + numero + " es: " + CalculoRaiz);
			}
		
			
		
	}

	public void CalcularPendiente(double y2, double y1, double x2, double x1) {
		try {
			if (x2 == x1) {
				throw new ArithmeticException("Los valores de x no pueden ser iguales");
			} else {
				double pendiente = (y2 - y1 / x2 - x1);
				System.out.println("La pendiente de la recta es:" + pendiente);
			}
		} finally {
			System.out.println("Ejecucion con normalidad");
		}
	}

	public void CalcularPuntomedio(int y2, int y1, int x2, int x1) throws Exception {

		try {
			if (y2 > 0 && y1 > 0 && x2 > 0 && x1 > 0) {
				double m = ((((x2 + x1) / 2)) + ((y1 + y2) / 2));
				System.out.println("El punto medio es:" + m);

			} else {
				throw new Exception("No se aceptan valores negativos ");

			}

		} finally {
			System.out.println("Calculo finalizado");
		}
	}

	public void RaicesEcuacion(double a, double b, double c) {
		if (a == 0) {
			throw new ArithmeticException("El coeficiente  a no puede ser cero");
		} else {
			double calculo = (Math.pow(b, 2) - 4 * a * c);
			if (calculo == 0) {
				double valorX = -b / (2 * a);
				System.out.println("Raiz:" + valorX);

			} else {
				if (calculo > 0) {
					double ValorX1 = (((-b + (Math.sqrt(calculo))) / (2 * a)));
					double ValorX2 = (((-b - (Math.sqrt(calculo))) / (2 * a)));
					System.out.println("Los valores de x son " + ValorX1 + "y " + ValorX2);
				} else {
					if (calculo < 0) {
						System.out.println("No hay soluciones reales");
					}
				}
			}

		}
	}

	public void ConvertirNumeroBaseB(int num) throws Exception {

		try {
			if (num <= 0) {
				throw new Exception("Por favor ingrese numeros mayores a cero");
			} else {
				String numb = " ";
				while (num != 0) {
					int div = (num % 2);
					numb = div + numb;
					num /= 2;

				}
				System.out.println("Numero:" + numb);
			}
		} finally {
			System.out.println("Adios");
		}
	}

}
