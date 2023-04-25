package aplicacion.entidades;

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
		return "---- Datos del Automóvil ----\nMarca:" + getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio() + "\nCaballos: " + getCaballos()
				+ "\nid: " + getId() + "\nNumero de puertas: " + numeroDePuertas + "\nLitrosMaletero: " + litrosMaletero;
	}
	

	
	

	
	
	
	
}
