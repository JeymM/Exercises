
public class Cuenta {
	protected float Saldo;
	protected float TasaAnual;
	protected float ComisionMes=0;
	protected int NumConsignacion=0;
	protected int NumRetiros=0;
	
	
	public Cuenta(float saldo, float tasaAnual) {
		Saldo = saldo;
		TasaAnual = tasaAnual;
	}
	

	public void Consignar(float saldo) {
	        this.Saldo += Math.abs(saldo);
	        this.NumConsignacion++;
	    }

	    public void  Retirar(float valor) {
	        if(this.Saldo >= valor) {
	            this.Saldo -= valor;
	            
	        } else {
	            System.out.println("Saldo insuficiente");
	        }
	        this.NumRetiros++;
	    }
	    
	    public void CalcularInteresMes() {
	    	this.ComisionMes=(this.TasaAnual/12)*Saldo;
	    }
	    
	    public void ExtractoMes() {
	    	CalcularInteresMes();
	    	this.Saldo-=this.ComisionMes;
	    }
	    
	    public void Imprimir() {
	    	String mensaje= "Su saldo: "+ this.Saldo + "\n "+ "Su tasa anual: "+ this.TasaAnual+"\n "+ "Comision: "+ this.ComisionMes +"\n "+"Numero Consignacion"
	    			+ this.NumConsignacion+"\n "+" Numero Retiros"+ this.NumRetiros;
	    	
	    	System.out.println(mensaje);
	    }
	

}
