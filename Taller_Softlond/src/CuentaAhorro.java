
public class CuentaAhorro extends Cuenta {
	protected boolean CuentaActiva;
	
	
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.CuentaActiva=ValidarCuenta();
	}

	public  boolean ValidarCuenta() {
		return this.Saldo>=10000;
	}
	
	@Override
	public void Consignar(float saldo) {
       if(this.CuentaActiva) {
    	   super.Consignar(saldo);
       }
    }
	
	@Override
	 public void  Retirar(float valor) {
        if(this.CuentaActiva) {
            super.Retirar(valor);
            
        } 
	}
	
	@Override
	 public void ExtractoMes() {
    	if(this.NumRetiros >4) {
    		int retirosAdicionales =this.NumRetiros-4;
    		this.Saldo-=1000*retirosAdicionales;
    	}else {
    		super.ExtractoMes();
    	}
    	ValidarCuenta();
    }
	
	@Override
	 public void Imprimir() {
    	String mensaje= "Su saldo: "+ this.Saldo +"\n "+"Comision: "+ this.ComisionMes +"\n "+"Numero Transacciones: "
    			+ (this.NumConsignacion+ this.NumRetiros);
    	
    	System.out.println(mensaje);
    }
	
}
