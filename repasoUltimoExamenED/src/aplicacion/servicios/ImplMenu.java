package aplicacion.servicios;

import javax.swing.JOptionPane;

/**
 * Clase que implementa la interfaz menú y es donde se describe la funcionalidad concreta de 
 * los métodos de dicha interfaz.
 * @author n1ko
 *
 */
public class ImplMenu implements InterfazMenu {

	@Override
	public int mostrarMenu() {
		return Integer.parseInt(JOptionPane.showInputDialog("\n ---- Menú Concesionario ----\n"
				+ "\n1. Alta vehículo\n2. Registro de stock en fichero\n3. Lectura fichero de stock"
				+ "\n4. Salir\n\nIntroduce la opción deseada: "));	
	}

}
