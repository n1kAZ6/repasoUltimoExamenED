package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Automovil;
import aplicacion.entidades.Camion;
import aplicacion.entidades.Motocicleta;

/**
 * Interfaz que define la cabecera de los métodos que se tendrán que implementar para dar servicio para el concesionario de vehiculos.
 * @author n1ko
 *
 */
public interface InterfazControlStockVehiculos {
	
	/**
	 * Método que da de alta un tipo concreto de vehículo y segun dicho tipo, se almacena en su correspondiente lista.
	 * @param baseDatosCoche
	 * @param baseDatosMotos
	 * @param baseDatosCamion
	 */
	void altaVehiculo(List<Automovil>baseDatosCoche, List<Motocicleta>baseDatosMotos, List<Camion>baseDatosCamion);

}
