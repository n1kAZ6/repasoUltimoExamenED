package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Automovil;
import aplicacion.entidades.Camion;
import aplicacion.entidades.Motocicleta;

/**
 * Interfaz que tiene la cabecera de los métodos que dan servicio a la gestión de ficheros.
 * @author n1ko
 *
 */
public interface InterfazGestionFichero {
	/**
	 * Este método realiza la escritura del stock de vehículos en el fichero de la ruta que recibe por argumento
	 * @param rutaFichero (ruta absoluta donde se encuentra el fichero)
	 */
	void escrituraFichero(String rutaFichero, List<Automovil> baseDatosCoche, List<Motocicleta> baseDatosMotos, List<Camion> baseDatosCamion);
	/**
	 * Método encargado de leer el fichero del registro de stock de los vehículos
	 * @param rutaFichero
	 */
	void lecturaFichero(String rutaFichero);

}
