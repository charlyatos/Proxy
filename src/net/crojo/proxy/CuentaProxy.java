package net.crojo.proxy;

public class CuentaProxy implements ICuenta{
	
	private CuentaBancoAPI cuentaReal;

	@Override
	public Cuenta retiraDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null && this.acceso(cuenta)) {
			cuentaReal = new CuentaBancoAPI();
			return cuentaReal.retiraDinero(cuenta, monto);
		}else {
			return cuentaReal.retiraDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null && this.acceso(cuenta)) {
			cuentaReal = new CuentaBancoAPI();
			return cuentaReal.depositarDinero(cuenta, monto);
		}else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		if(cuentaReal == null && this.acceso(cuenta)) {
			cuentaReal = new CuentaBancoAPI();
			 cuentaReal.mostrarSaldo(cuenta);
		}else {
			 cuentaReal.mostrarSaldo(cuenta);
		}
		
	}
	
	public Boolean acceso(Cuenta cuenta) {
		
		return true; 
	}
	

}
