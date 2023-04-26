package aplicacion.entidades;

/**
 * Clase que representa a la entidad Coche y que extiende de vehículo. Contiene atributos propios, constructor, los getter & setter 
 * para acceso a los atributos y métodos.
 * @author n1ko
 *
 */
public class Automovil extends Vehiculo {

	
	//Atributos
	private int numeroDePuertas;
	private int litrosMaletero;
	
	//Constructor
	public Automovil(int id, String marca, String modelo, double precio, int caballos, int numeroDePuertas, int litrosMaletero) {
		super(id, marca, modelo, precio, caballos);
		this.numeroDePuertas=numeroDePuertas;
		this.litrosMaletero=litrosMaletero;
	}
	
	//Propiedades lectura/escritura getter & setter
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public int getLitrosMaletero() {
		return litrosMaletero;
	}

	public void setLitrosMaletero(int litrosMaletero) {
		this.litrosMaletero = litrosMaletero;
	}
	
	//Métodos
	@Override
	public String toString() {
		return "\n\n ----- Automóvil "+getId()+" -----\nid: " + getId() +"\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio() + " €\nCaballos: " + getCaballos()
				+  "\nNumero de puertas: " + numeroDePuertas + "\nCapacidad maletero: " + litrosMaletero +" litros";
	}
	

	
	

	
	
	
	
}
