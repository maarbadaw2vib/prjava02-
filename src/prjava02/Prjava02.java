/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author --> Escriu el teu correu electrònic
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava02"); 	
        try {
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("HOLA");
            System.out.println("CREACIO D'UNA BRANCA DEL PROJECTE PRJAVA02 MARC");
            System.out.println("AFEGINT MES CODI AL PROJECTE PRJAVA02 DE LA BRANCA PRJAVA00 MARC");
            System.out.println("AFEGINT  CODI A LA BRANCA BRANCA01 DEL PROJECTE PRJAVA02 MARC");            
	    System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) {
		System.out.println("Exception occurred");
        }  
    }
}
