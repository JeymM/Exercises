
public class CuentaCorriente extends Cuenta {
	
	private float SobreGiro=0;
	
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		
	}
	
	@Override
		 public void  Retirar(float saldo) {
		        if(this.Saldo >= saldo) {
		            this.Saldo -= saldo;
		            this.NumRetiros++;
		            
		        } else {
		        	this.SobreGiro+= Math.abs(this.Saldo-saldo);
		        	this.Saldo=0;
		        }
	}
	
	@Override
	public void Consignar(float saldo) {
		if(this.SobreGiro>0) {
			if(saldo>this.SobreGiro) {
				this.Saldo += Math.abs(this.SobreGiro -saldo);
				this.SobreGiro=0;
			}else {
				this.SobreGiro -=saldo;
			}
			this.NumConsignacion++;
		}else
		{
			super.Consignar(saldo);
		}
	}
	
	@Override
	 public void Imprimir() {
    	String mensaje= "Su saldo: "+ this.Saldo +"\n "+"Comision: "+ this.ComisionMes +"\n "+"Numero Transacciones: "
    			+ (this.NumConsignacion+ this.NumRetiros) +"\n "+ "valor sobregiro:" + this.SobreGiro;
    	
    	System.out.println(mensaje);
    }
	
	
}
