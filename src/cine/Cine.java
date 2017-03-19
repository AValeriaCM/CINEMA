/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Scanner;
/**
 *
 * @author Leidy Torres
 */
public class Cine {
    
    private Scanner teclado;
    
    /**
     * Constructor de la clase
     */
    public Cine() {
        teclado = new Scanner(System.in);        
        inicio();
        Persona();
    }
    
        
    public void inicio(){
        System.out.println("**********BIENVENIDO**********");
    }
   

    
     /**
     * Metodo que tienes los datos de la persona
     */   
    public void Persona(){
        String nombre, apellido;
        int identificacion, fem=0, mas=0;
        System.out.println("Identificacion: ");
        identificacion = teclado.nextInt();
        System.out.println("Nombre:");
        nombre = teclado.nextLine();
        System.out.println("Apellido:");
        apellido = teclado.nextLine();
    }
    
 
}
