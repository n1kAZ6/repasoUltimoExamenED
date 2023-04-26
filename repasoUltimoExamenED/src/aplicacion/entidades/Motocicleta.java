package aplicacion.entidades;

/**
 * Clase que representa a la entidad Moto que hereda de vehículo. Contiene sus atributos propios, constructor, los getter & setter 
 * para acceso a los atributos y métodos.
 * @author n1ko
 *
 */
public class Motocicleta extends Vehiculo{
	
	
	//Atributos
	private boolean tieneBaul;
	private boolean esAsientoDesmontable;
	
	//Constructor
	public Motocicleta(int id, String marca, String modelo, double precio, int caballos, boolean tieneBaul, boolean esAsientoDesmontable) {
		super(id, marca, modelo, precio, caballos);
		this.tieneBaul=tieneBaul;
		this.esAsientoDesmontable=esAsientoDesmontable;
	}

	//Propiedades lectura/escritura
	public boolean isTieneBaul() {
		return tieneBaul;
	}

	public void setTieneBaul(boolean tieneBaul) {
		this.tieneBaul = tieneBaul;
	}

	public boolean isEsAsientoDesmontable() {
		return esAsientoDesmontable;
	}

	public void setEsAsientoDesmontable(boolean esAsientoDesmontable) {
		this.esAsientoDesmontable = esAsientoDesmontable;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "\n\n----- Motocicleta "+getId()+" -----\nid: " + getId() +"\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio() + " €\nCaballos: " + getCaballos()
				+  "\nCon baúl: " + (tieneBaul ? "Si":"No") + "\nCon asiento desmontable: " + (esAsientoDesmontable ? "Si":"No");
	}
	
	

}
