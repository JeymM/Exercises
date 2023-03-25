package Punto4;

import Excepcion.LimiteRetiros;

public interface Movimientos {
	public abstract void Retirar(double valor) throws LimiteRetiros;

	public abstract void Depositar(double saldo);
}
