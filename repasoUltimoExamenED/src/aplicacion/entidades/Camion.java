package aplicacion.entidades;

public class Camion extends Vehiculo {

	//Atributos
	private double taraMaxima;
	private boolean esRefrigerado;
	
	//Constructor
	public Camion(int id, String marca, String modelo, double precio, int caballos, double taraMaxima, boolean esRefrigerado) {
		super(id, marca, modelo, precio, caballos);
		this.taraMaxima=taraMaxima;
		this.esRefrigerado=esRefrigerado;		
	}
	
	//Propiedades lectura/escritura getter & setter
	public double getTaraMaxima() {
		return taraMaxima;
	}


	public void setTaraMaxima(double taraMaxima) {
		this.taraMaxima = taraMaxima;
	}


	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}


	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "---- Datos del Camión ----\nid: " + getId()+ "\nMarca:" + getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio() 
			+ "\nCaballos: " + getCaballos() + "\nTara máxima: " + taraMaxima + "\nRefrigerado: "+ (esRefrigerado ? "Sí": "No");
	}
}
