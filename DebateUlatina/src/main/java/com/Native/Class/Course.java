/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Native.Class;

import java.util.Calendar;

/**
 *
 * @author Joss
 */
public class Course {

    public Course() {
    }
    String codigo;
    String term;
    String name;
    String year;
    int role;
    String Profesor;

    public Course(String codigo, String term, String name, String year, int role, String Profesor) {
        this.codigo = codigo;
        this.term = term;
        this.name = name;
        this.year = year;
        this.role = role;
        this.Profesor = Profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }
    
    
    

                             
                                
}
