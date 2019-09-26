/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.ejerciciorepaso;

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
        System.out.println("Realizar un programa que muestre los numeros pares menores de 10");
        System.out.println("");
        System.out.print("Numeros pares menores de 10: ");
        for(int x=0;x<11;x++){
            if(x%2==0){
                System.out.print(x+"-");
            }
        }
    }
    
}
