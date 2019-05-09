/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner; 
/**
 *
 * @author reroes
 */
public class CicloWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner entrada = new Scanner (System.in);
    	String mensajeFinal = "" ;
    	String nombre = "Israel Andres";
    	String apellido = "Tapia Morales";
    	String profesion = "Estudiante";
    	String opcion = "true";
    	boolean bandera = true;
    	int contador = 1;
//mensaje final :  primeras iniciasiones
		mensajeFinal = String.format("%S%s\n\n", mensajeFinal,
				"informe de la ciudad de Loja: ");
		mensajeFinal = String.format("%S%s\n\n", mensajeFinal,
				"listado de personas");
    	while (bandera == true ) {
    		System.out.println("ingrese sus nombres");
    		nombre = entrada.nextLine();
    		//apellido
    		System.out.println("ingrese sus apellidos");
    		apellido = entrada.nextLine();
    		//profesion 
    		System.out.println("ingrese su profesion");
    		profesion = entrada.nextLine();
    		//elaboracion del mensaje final 
    		mensajeFinal = String.format("%sPersona %d: %s %s - %s\n ",mensajeFinal, contador,
    				nombre, apellido, profesion);
    		contador = contador + 1 ; //contador se incrementa 
    		/*contador
    		 * 
    		 */
    		System.out.print("digite 's' para seguir o 'n' para salir ");
    		opcion = entrada.nextLine();
    		if (opcion.equals("s")) {
    			bandera = true ;
    		
    		}else {
    			bandera = false;
    		}
    	}
    	System.out.printf("%s", mensajeFinal);
    	}
    
    //System.out.printf("Persona %d: %s %s - %s\n", contador, nombre, apellido, profesion ) ;
    
    
    }
    
    
