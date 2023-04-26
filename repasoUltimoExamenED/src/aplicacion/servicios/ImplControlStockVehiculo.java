package aplicacion.servicios;

import java.awt.Toolkit;
import java.util.InputMismatchException;
import java.util.List;

import javax.swing.JOptionPane;

import aplicacion.entidades.Automovil;
import aplicacion.entidades.Camion;
import aplicacion.entidades.Motocicleta;

/**
 * Clase que implementa la interfazControlStockVehiculo donde se definen al detalle la funcionalidad de los métodos
 * que dan servicio al concesionario de vehiculos.
 * @author n1ko
 *
 */
public class ImplControlStockVehiculo implements InterfazControlStockVehiculos{


	@Override
	public void altaVehiculo(List<Automovil> baseDatosCoche, List<Motocicleta> baseDatosMotos, List<Camion> baseDatosCamion) {
		
		String marca, modelo;
		double precio;
		int caballos;
		
		marca=JOptionPane.showInputDialog("Introduce la marca: ");
		modelo=JOptionPane.showInputDialog("Introduce el modelo: ");
		precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
		caballos=Integer.parseInt(JOptionPane.showInputDialog("Introduce los caballos: "));
		
		int tipoVehiculo = elegirTipoVehiculo();
		
		switch(tipoVehiculo) {
		
			case 1:
				int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puertas: "));
				int litrosMaletero = Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros del maletero: "));
				baseDatosCoche.add(
						new Automovil(
								generarId("coche",baseDatosCoche,baseDatosMotos,baseDatosCamion)
								,marca,modelo,precio,caballos,numPuertas,litrosMaletero));
				break;
			case 2:				
				boolean tieneBaul = preguntaSiNo("La moto tiene baúl (S o N)?: ");
				boolean tieneAsientoDesmontable = preguntaSiNo("La moto tiene el asiento desmontable (S o N)?: ");
				baseDatosMotos.add(
						new Motocicleta(
								generarId("moto",baseDatosCoche,baseDatosMotos,baseDatosCamion)
								,marca,modelo,precio,caballos,tieneBaul,tieneAsientoDesmontable));
				break;
			case 3:
				double taraMax = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tara máxima del camión: "));
				boolean esRefrigerado = preguntaSiNo("El camión tiene climatizador (S o N)?: ");
				baseDatosCamion.add(
						new Camion(generarId("camion",baseDatosCoche,baseDatosMotos,baseDatosCamion)
								,marca,modelo,precio,caballos,taraMax,esRefrigerado));
				break;	
		}
		JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente!");
			
	}

	/**
	 * Método para que el usuario pueda elegir el tipo de vehículo que se va dar de alta en el concesionario.
	 * @return un número entero [1..3] que hace referencia al tipo de vehículo.
	 */
	private int elegirTipoVehiculo() {
		
		int tipoVehiculo;	
		
		do {
			try {
				tipoVehiculo=Integer.parseInt(JOptionPane.showInputDialog("\nQue tipo de vehiculo es: \n1. Automovil\n2. Motocicleta\n3. Camión"));
				if(tipoVehiculo<1||tipoVehiculo>3) {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null,"\n**[ERROR] no se reconoce el vehículo seleccionado **");
				}		
			
			} catch(InputMismatchException e) {
			throw new InputMismatchException("Valor no válido");
			}      
		}while(tipoVehiculo<1||tipoVehiculo>3);
		return tipoVehiculo;	
	}
	
	/**
	 * Genera un identificador único por cada nuevo vehículo que se va dar de alta en el concesionario.
	 * @param tipoVehiculo --> Según el tipo recorre una lista (base de datos) u otra
	 * @param baseDatosCoche
	 * @param baseDatosMoto
	 * @param baseDatosCamion
	 * @return un número entero que será el identificador del nuevo vehículo
	 */
	private int generarId(String tipoVehiculo,List<Automovil> baseDatosCoche, List<Motocicleta> baseDatosMoto, List<Camion> baseDatosCamion) {
		
		if(tipoVehiculo.equalsIgnoreCase("coche")) {
			int idMayor=0;
			if(baseDatosCoche.isEmpty())
				return 1;
			else {
				for (Automovil coche : baseDatosCoche) {
				    if (coche.getId() > idMayor) {
				        idMayor=coche.getId();				        
				    }
				}
			}
			return idMayor+1;
		} else if(tipoVehiculo.equalsIgnoreCase("moto")) {
			int idMayor=0;
			if(baseDatosMoto.isEmpty())
				return 1;
			else {
				for (Motocicleta moto : baseDatosMoto) {
				    if (moto.getId() > idMayor) {
				        idMayor=moto.getId();			        
				    }
				}
			}
			return idMayor+1;				
		} else if(tipoVehiculo.equalsIgnoreCase("camion")) {
			int idMayor=0;
			if(baseDatosCamion.isEmpty())
				return 1;
			else {
				for (Camion camion : baseDatosCamion) {
				    if (camion.getId() > idMayor) {
				        idMayor=camion.getId();				        
				    }
				}
			}
			return idMayor+1;				
		}
		return -1;		
		
	}
	
	/**
	 * Método encargado de gestionar cual va ser el valor para los atributos booleanos de ciertos vehículos.
	 * @param mensaje --> pregunta que se realiza al usuario
	 * @return true si responde S o false si es N
	 */
	private boolean preguntaSiNo(String mensaje) {
		
		char respuesta;
        do
        {
            
            respuesta = JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);

            if (respuesta != 'S' && respuesta != 'N') {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null," Respuesta no válida (S/N)");
            }

        } while (respuesta != 'S' && respuesta != 'N');

        if(respuesta=='S')
            return true;
        else
            return false;

	}

	

}
