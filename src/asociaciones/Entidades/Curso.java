/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociaciones.Entidades;

/**
 *
 * @author HanselChavez
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Integer creditos;
    private Profesor[] profesores;
    private Estudiante[] estudiantes;
    
    public Curso( String codigo, Integer creditos, String nombre) { 
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos; 
        this.profesores = new Profesor[2];
        this.estudiantes = new Estudiante[30];
    }
    public boolean agregarProfesor(Profesor profesor){
        boolean agregado = false;  
        if(this.profesores[0]==null){
            profesores[0]=profesor;
            agregado = true;
        }else if(this.profesores[1]==null){
            profesores[1]=profesor;
            agregado = true;
        }
        return agregado;
    }   
    public boolean agregarEstudiante(Estudiante estudiante){
        
        boolean agregado = false;
        for (int j = 0; j < 30; j++) {
            if(estudiantes[j]==null){
                estudiantes[j]=estudiante;
                agregado = true;
                break;
            }
        }
        return agregado;
    }
    public String getNombre() {
        return nombre;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }   
    public String getCodigo() {
        return codigo;
    } 
    public Integer getCreditos() {
        return creditos;
    }
    public Profesor[] getProfesores() {
        return profesores;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }   

    private static String padRight(String str, int length, char padChar) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return padRight(codigo, 12,' ')+padRight(nombre,55,' ')+creditos;
    }
    
}
