package aplicacion.entidades;

/**
 * Clase que representa a la entidad Vehículo de las que derivan otras clases. Contiene atributos, constructor, los getter & setter 
 * para acceso a los atributos y métodos.
 * @author n1ko
 *
 */
public class Vehiculo {

	//Atributos
		private String marca;
		private String modelo;
		private double precio;
		private int caballos;
		private int id;
		
		//Constructor
		public Vehiculo(int id,String marca, String modelo, double precio, int caballos) {
			super();
			this.id=id;
			this.marca = marca;
			this.modelo = modelo;
			this.precio = precio;
			this.caballos = caballos;
		}
		
		//Propiedades lectura/escritura getter & setter
		public int getId() {
			return id;
		}
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getCaballos() {
			return caballos;
		}

		public void setCaballos(int caballos) {
			this.caballos = caballos;
		}
		
		//Métodos
		
		@Override
		public String toString() {
			return "---- Datos del Vehículo ----\nMarca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + "\nCaballos: " + caballos
					+ "\nid: " + id ;
		}
		
}
