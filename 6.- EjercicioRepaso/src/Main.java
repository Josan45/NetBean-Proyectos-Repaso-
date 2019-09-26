
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        Main ma=new Main();
        boolean sw=true;
        
        while(sw){
            System.out.println("");
            System.out.println("Introduzca el modelo del vehiculo(fin para terminar");
            System.out.println("");
            String modelo=leer.next();
            
            sw=esFin(modelo);
        }
    }

    static boolean esFin(String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean sw=true;
            if(modelo.equalsIgnoreCase("fin")){
                sw=false;
            }
        return sw;
    }
}
