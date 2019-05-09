/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class UsoSwitch5 {
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Desarrollar una aplicacion que me permita ingresar placas de carros 
         * Se asume que las placas ingresadas pertenecen a la region costa del
         * Ecuador, en base a la placa nuestro programa determinara y presentara
         * la placa con la provincia a la que pertenece :o
         */
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese la placa ");
        String placa = entrada.nextLine();
        char valor = placa.charAt(0);
        switch(valor){
            case 'G':
                System.out.printf("La provincia a la que pertenece es  %s \n","Guayas");
                break;
            case 'M':
            	System.out.printf("La provincia a la que pertenece es  %s \n","Manabi");
                break;
            case 'E':
            	System.out.printf("La provincia a la que pertenece es  %s \n","Esmeraldas");
                break;
            case 'O':
            	System.out.printf("La provincia a la que pertenece es  %s \n","El oro ");
                break;
            case 'R':
            	System.out.printf("La provincia a la que pertenece es  %s \n","Los rios");
                break;
            case 'J':
            	System.out.printf("La provincia a la que pertenece es  %s \n","Santo domingo de los Tsachilas");
                break;
            case 'Y':
            	System.out.printf("La provincia a la que pertenece es  %s \n","Santa Elena");
                break;

            default:
                System.out.println("no pertenece a la region costa");
                
        }
        
    }
}
