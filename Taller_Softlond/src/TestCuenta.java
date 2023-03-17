
public class TestCuenta {
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta(10000,0.24f);
		CuentaAhorro cuentaAhorro=new CuentaAhorro(120000, 0.12f);
		cuenta.Consignar(100000);
		cuenta.Retirar(20000);
		cuenta.Imprimir();
		
		cuentaAhorro.Consignar(10000);
		cuentaAhorro.Retirar(20000);
		cuentaAhorro.Imprimir();
	}
	
	
	
	
}
