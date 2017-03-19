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
public class Salas {
    
    private Silla [][] silla;
    
    private int filas;
    
    private int columnas;
    
    private int general;
    
    private int ejecutiva;
    
    private int vip;
        
    public Salas (){
        ingresoDatos();
        tipoSillas();
        silla = new Silla [filas][columnas];
    }
    
    Scanner teclado = new Scanner(System.in);
    
    public void ingresoDatos(){
    
        System.out.println("Ingrese el numero de filas");
        filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = teclado.nextInt();
    }
    
    public void tipoSillas(){
    
        while(true){
            System.out.println("Digite el numero de filas generales");
            general = teclado.nextInt();
            if (general <= filas)
                break;
        }
    
        
        if (general != filas){
            while (true){
            System.out.println("Digite el numero de filas ejecutivas");
            ejecutiva = teclado.nextInt();
            if ((general + ejecutiva) <= filas)
                break;   
            }
            vip = filas - (general + ejecutiva);
        }
    }
    
    public void llenarSala(){
        int cont=1;
        for (int i=0; i < filas; i++){
            for (int  j=0; j < columnas; j++){
              Silla silla;
             if ((i+1) <= general){
                 silla = new Silla (cont++, Tipo.GENERAL, null);             
             }else if ((i+1) <= (general + ejecutiva))
            }
        }
    }
    
    
    
   
    
}
