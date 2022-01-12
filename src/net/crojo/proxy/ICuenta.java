package net.crojo.proxy;

public interface ICuenta {
	Cuenta retiraDinero(Cuenta cuenta,double monto);
	Cuenta depositarDinero(Cuenta cuenta,double monto);
	void mostrarSaldo(Cuenta cuenta);

}
