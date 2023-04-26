package aplicacion.servicios;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.swing.JOptionPane;

import aplicacion.entidades.Automovil;
import aplicacion.entidades.Camion;
import aplicacion.entidades.Motocicleta;

/**
 * Clase que implementa la interfaz para la gestión del tratamiento de fichero, en ella se definen el detalle y la funcionalidad de dichos métodos.
 * @author n1ko
 *
 */
public class ImplGestionFichero implements InterfazGestionFichero{

	@Override
	public void escrituraFichero(String rutaFichero, List<Automovil> baseDatosCoche, List<Motocicleta> baseDatosMotos, List<Camion> baseDatosCamion) {
		FileWriter fichero= null;
		PrintWriter pw = null;

		try {

			fichero = new FileWriter(rutaFichero);	
			pw = new PrintWriter(fichero);

			for(Automovil coche : baseDatosCoche) 
				pw.printf(coche.toString());
			
			for(Motocicleta moto : baseDatosMotos) 
				pw.printf(moto.toString());	
			
			for(Camion camion : baseDatosCamion) 
				pw.printf(camion.toString());	
			
			JOptionPane.showMessageDialog(null, "Archivo de registro de stock escrito correctamente en "+rutaFichero);
			
		 } catch (IOException ioe) {
			 Toolkit.getDefaultToolkit().beep();
			 JOptionPane.showMessageDialog(null,"[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
	     } finally {
	    	 try {
	    		 if (null != fichero)
	        		   fichero.close();
	          }catch (IOException ioe2){
	        	  Toolkit.getDefaultToolkit().beep();
	        	  JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
		      }
	       }		
	}

	@Override
	public void lecturaFichero(String rutaFichero) {
		
		  File fichero = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	  
	    	 fichero = new File (rutaFichero);
	         fr = new FileReader (fichero);
	         br = new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	         }
	         
	      }	catch(FileNotFoundException fnfe){
	    	  Toolkit.getDefaultToolkit().beep();
	    	  JOptionPane.showMessageDialog(null,"[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" +fnfe); 
	      } catch(IOException ioe){
	    	  Toolkit.getDefaultToolkit().beep();
	    	  JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL LEER LINEA: " + ioe); 
	      } finally{ 
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (IOException ioe2){
	        	 Toolkit.getDefaultToolkit().beep();
	        	 JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
	         }
	      }
	}

}
