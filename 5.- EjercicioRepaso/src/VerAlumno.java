
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
public class VerAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del alumno");
        String nombre=leer.next();
        System.out.println("Introduzca la matricula del alumno");
        String matricula=leer.next();
        
        Alumno alum=new Alumno(nombre,matricula);
        
        String nota=ponNota();
        System.out.println(alum.muestraNota()+""+nota);
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
