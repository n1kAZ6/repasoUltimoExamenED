package aplicacion.controlador;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.swing.JOptionPane;

import aplicacion.entidades.Automovil;
import aplicacion.entidades.Camion;
import aplicacion.entidades.Motocicleta;
import aplicacion.servicios.ImplControlStockVehiculo;
import aplicacion.servicios.ImplGestionFichero;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazControlStockVehiculos;
import aplicacion.servicios.InterfazGestionFichero;
import aplicacion.servicios.InterfazMenu;

/**
 * Clase por la que se entra a la aplicación que contiene el main. En ella solo estan definidos los pasos y el procedimiento de ejecución que sigue la aplicación.
 * @author n1ko
 *
 */
public class Principal {
	
	//Constante con la ruta del fichero donde se guardará los vehiculos registrados, se debe asegurar su existencia en dicha ruta.
	public static final String RUTA_ARCHIVO_LOG = "C:\\Users\\niko_\\Desktop\\vehiculos.txt"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Automovil>baseDatosCoche = new ArrayList<>();
		List<Motocicleta>baseDatosMoto = new ArrayList<>();
		List<Camion>baseDatosCamion = new ArrayList<>();
		

		InterfazMenu intM = new ImplMenu();
		InterfazControlStockVehiculos controlStock = new ImplControlStockVehiculo();
		InterfazGestionFichero gestionFichero = new ImplGestionFichero();
		
		boolean cerrarMenu=false;
		int opcion;
		do {
			try {						
				opcion=intM.mostrarMenu();
				System.out.println("\n[INFO] - Has seleccionado la opcion " + opcion);
				switch(opcion) {
					case 1:
						controlStock.altaVehiculo(baseDatosCoche, baseDatosMoto, baseDatosCamion);
						break;
					case 2:
						gestionFichero.escrituraFichero(RUTA_ARCHIVO_LOG,baseDatosCoche, baseDatosMoto, baseDatosCamion);
						break;
					case 3:
						gestionFichero.lecturaFichero(RUTA_ARCHIVO_LOG);
						break;
					case 4:
						cerrarMenu=true;
						break;
					default:
						JOptionPane.showMessageDialog(null,"\n**[ERROR] opción elegida no disponible **");
						break;
				}
			} catch(InputMismatchException e) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null,"\n**[ERROR] entrada inválida: por favor ingrese un número entero **");
			} catch(NullPointerException npe) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null,"\n**[ERROR] el elemento requerido para trabajar es null: " + npe.getMessage() + " **");
			} catch(HeadlessException e) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null,"\n**[ERROR] el sistema sin interfaz gráfica: " + e.getMessage() + " **");
			} catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null,"\n**[ERROR] no es un número entero, no ha introducido nada o el formato no es correcto: " + e.getMessage() + " **");
			}			
		}while(!cerrarMenu);
		
		JOptionPane.showMessageDialog(null,"\nDesconectando, Gracias por su confianza en nuestra compañia!");
	}

}
