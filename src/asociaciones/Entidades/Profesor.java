/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociaciones.Entidades;

import java.util.List;

/**
 *
 * @author HanselChavez
 */
public class Profesor {
    private String nombre;
    private String apellido;
    List<Curso>cursos;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public List<Curso> getCursos() {
        return cursos;
    }  
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
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
        return padRight(nombre,40,' ')+apellido;
    }
    
}
