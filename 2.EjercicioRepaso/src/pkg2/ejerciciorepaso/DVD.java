/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ejerciciorepaso;

/**
 *
 * @author Alumno_2DAW
 */
public class DVD {

    
    private String titulo,actor, director, genero,duracion,resumen;
   

    public DVD(String titulo, String actor, String director, String genero, String duracion, String resumen) {
        this.titulo = titulo;
        this.actor = actor;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {

        return genero;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {

        this.duracion = duracion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {

        this.resumen = resumen;
    }
    
    public String muestraDVD() {
        String comentariogenero="",comentarioduracion="",comentarioresumen="";
            
        if(getGenero().equals("Thriller")){
            comentariogenero="El genero es thriller";
        }
        if(getDuracion().length()>0){
            comentarioduracion="La duracion es de "+getDuracion().toString();
        }    
        if(getResumen().length()>0){
           comentarioresumen="La ficha tiene resumen";
        }
        return "DVD{\n" + "titulo=" + titulo + "\n actor=" + actor + "\n director=" + director + "\n genero=" + genero + "\n duracion=" + duracion + "\n resumen=" + resumen + "\n"+'}'
                +"\n"+comentariogenero+"\n"+comentarioduracion+"\n"+comentarioresumen;
        
    }



    
    
    
}
