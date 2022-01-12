package net.crojo.proxy;

public class Cuenta {
	
	private int idCuenta;
	private String usuario;
	private double saldoIni;
	
	public Cuenta( int idCuenta, String usuario, double saldoIni) {
		this.idCuenta= idCuenta;
		this.usuario = usuario;
		this.saldoIni = saldoIni;
		
		
	}
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldoIni() {
		return saldoIni;
	}
	public void setSaldoIni(double saldoIni) {
		this.saldoIni = saldoIni;
	}

}
