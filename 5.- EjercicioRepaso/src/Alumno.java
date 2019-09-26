/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Antonio
 */
public class Alumno {
    private String nombre;
    private String matricula;

  
public Alumno(String nombre,String matricula){
    this.nombre=nombre;
    this.matricula=matricula;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String muestraNota(){
        return matricula+"-->"+nombre+" nota media ";
    }
}
