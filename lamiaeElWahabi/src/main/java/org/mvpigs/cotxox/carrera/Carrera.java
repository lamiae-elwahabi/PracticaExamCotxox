package org.mvpigs.cotxox.carrera;

public class Carrera {
	//Propiedades
	private String tarjetaCredito = "";
	private String origen = "";
	private String destino = "";
	private double distancia = 0d;
	private int tiempoEsperado = 0;
	
//	private String tiempoCarrera = "";
//	private String costeTotal = "";
	//private conductor = new Conductor();
	
	//Constructor por defecto
		public Carrera(){
			
		}
	//Constructor solo con tarjetaCredito como pide el main
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	//Getters y Setters
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getTiempoEsperado() {
		return tiempoEsperado;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	
}
