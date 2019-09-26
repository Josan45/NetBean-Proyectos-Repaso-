/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Antonio
 */
public class EjercicioRepaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Realizar un programa que muestre todos los numeros primos menores de 15");
        
        System.out.print("Los números primos menores de 15 son: ");
        boolean primo=true;
        for (int numeroprimo = 1; numeroprimo < 16; numeroprimo++) {
            for (int contador = 2; contador < numeroprimo; contador++) {
                if((primo) && (numeroprimo!=contador)){
                    if(numeroprimo%contador==0){
                        primo=false;
                    }   
                }  
            }
            if (primo) {
                System.out.print(numeroprimo+"-");
            }
            primo=true;
        }
        System.out.println("");
    }
}