/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.ejerciciorepaso;

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
        boolean positivo=false;
        Comprobaciones com=new Comprobaciones();
  
        do{
        try{
        System.out.println("Introduzca un número entero y positivo");
        int num=leer.nextInt();
        
        if(num>0){
            positivo=false;
        System.out.println(com.esCapiccuo(num));
        System.out.println(com.esPrimo(num));
        System.out.println(com.esAntiguo(num));
        System.out.println(com.esPar(num));
        System.out.println(com.esTriangulo(num));
        System.out.println(com.esIntervalo(num));
        System.out.println(com.esBisiesto(num));
        }else{
            positivo=true;
        }
        }catch(InputMismatchException e){
            System.err.println("Debe ser un número entero");
        }
        }while(positivo);
    }
}