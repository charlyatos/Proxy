package net.crojo.proxy;

public class CuentaBancoAPI {

	
	public Cuenta retiraDinero(Cuenta cuenta, double monto) {
		 double saldoActual = cuenta.getSaldoIni() - monto;
		 cuenta.setSaldoIni(saldoActual);
		 mostrarSaldo(cuenta);
		return cuenta;
	}

	
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoIni() + monto;
		 cuenta.setSaldoIni(saldoActual);
		 mostrarSaldo(cuenta);
		return cuenta;
	}

	
	public void mostrarSaldo(Cuenta cuenta) {
		
		System.out.println("Saldo: "+ cuenta.getSaldoIni());
	}

}
