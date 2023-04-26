package aplicacion.entidades;

/**
 * Clase que representa a la entidad Camión que extiende de vehículo. Contiene atributos propios, constructor, los getter & setter 
 * para acceso a los atributos y métodos.
 * @author n1ko
 *
 */
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
		return "\n\n ----- Camión "+getId()+" -----\nid: " + getId()+ "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio() 
			+ " €\nCaballos: " + getCaballos() + "\nTara máxima: " + taraMaxima + " Kg\nRefrigerado: "+ (esRefrigerado ? "Sí": "No");
	}
}
