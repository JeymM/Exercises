
public class Factura extends Precio{
	
	String Cliente;
	String Emisor;



public Factura(String Cliente,String Emisor ) {
		this.Cliente=Cliente;
		this.Emisor=Emisor;
		
	}

public void ImprimirFactura() {
		
		String mensaje="Señor(@) "+ this.Cliente + " realizo su compra en: " + this.Emisor;
		System.out.println(mensaje);
	
		
}
}
