/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.ejerciciorepaso;

/**
 *
 * @author José Antonio
 */
public class Comprobaciones {

    String esPar(int num) {
        String par="";
        if(num%2==0){
            par="El número "+num+" es par";
        }else{
            par="El número "+num+" no es par";
        }
        return par;
    }

    String esCapiccuo(int num) {
        int aux, inverso = 0, cifra;
        String capicuo="";
        
        //le damos la vuelta al número
        aux = num;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
 
        if(num == inverso){
            capicuo="El numero "+num+" es capicuo";
        }else{
            capicuo="El numero "+num+" no es capicuo";
        }
        return capicuo;
    }

    String esPrimo(int num) {
        String prim="";
        int c=2;
        boolean primo=true;
	while(num>c){
            if(num%c==0){
		primo=false;
            break;
            }
            c++;
		}
            if(primo){
                prim="El numero "+num+" es primo";
            }else{
		prim="El numero "+num+" no es primo";
            }
        return prim;
    }

    String esAntiguo(int num) {
        String antiguo="";
        if(num<1900){
            antiguo="El número "+num+" no es antiguo";
        }else{
            antiguo="El número "+num+" es antiguo";
        }
        return antiguo;
    }

    String esTriangulo(int num) {
        String triangulo="";
        int num1=20;
        int num2=25;
        
         if((num1+num2)>=num && (num+num1)>=num2 && (num+num2)>=num1){
             triangulo="El número "+num+" forma un triangulo";
         }else{
             triangulo="El número "+num+" no forma un triangulo";
         }
         return triangulo;
    }

    String esIntervalo(int num) {
        String intervalo="";
        if(10<=num && 99>=num){
            intervalo="El número "+num+" esta en el intervalo";
        }else{
            intervalo="El número "+num+" no esta en el intervalo";
        }
        
        return intervalo;
    }

    String esBisiesto(int num) {
        String bisiesto="";
        if((num%100!=0 && num%4==0) || num%400==0){
            bisiesto="El número "+num+" es bisiesto";
        } else {
           bisiesto="El número "+num+" no es bisiesto";
        }
        return bisiesto;
    }
    
}
