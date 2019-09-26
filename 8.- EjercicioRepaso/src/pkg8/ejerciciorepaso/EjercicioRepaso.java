/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.ejerciciorepaso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class EjercicioRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);
         ArrayList lista=new ArrayList();
         int matricula;
         String nombre,nota;
     try{    
        do{
        System.out.println("Introduzca la matricula del alumno");
        matricula=leer.nextInt(); 
           
           if(matricula>0){
                 System.out.println("Introduzca el nombre del alumno");
                  nombre=leer.next();
                  nota=ponNota();   
                  
                  ArrayList lista=new ArrayList(matricula,nombre);                  
                  
                  //ArrayList<Alumno> alum=new ArrayList(nombre,matricula); 
                  //System.out.println(alum.muestraNota()+""+nota);
            }          
           
        }while(matricula>0);
        
          }catch(InputMismatchException e){
            System.err.println("La matricula y las notas no puede llevar letras");
        } 
       
        
       
    
    
   
    }

    private static String ponNota() {
        Scanner leer2=new Scanner(System.in);
        double nota1,nota2;
        System.out.println("Introduzca la 1º nota");
        nota1=leer2.nextDouble();
        System.out.println("Introduzca la 2º nota");
        nota2=leer2.nextDouble();
        
        double nota=dameMedia(nota1,nota2);
        String notaMedia=Double.toString(nota);
        return notaMedia;
    }

    private static double dameMedia(double nota1, double nota2) {
        double notaMedia=0;
        notaMedia=(nota1+nota2)/2;
        return notaMedia;
    }
    
}
