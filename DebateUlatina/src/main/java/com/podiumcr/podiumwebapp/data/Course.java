/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.podiumwebapp.data;



/**
 *
 * @author Joss
 */
public class Course {
    String code;
    String term;
    String name;
    String year;
    int role;
    String Profesor;
    public Course() {
    }
   

    public Course(String code, String term, String name, String year, int role, String Profesor) {
        this.code = code;
        this.term = term;
        this.name = name;
        this.year = year;
        this.role = role;
        this.Profesor = Profesor;
    }
    public Course(String code, String term, String name, String year) {
        this.code = code;
        this.term = term;
        this.name = name;
        this.year = year;
;
    }
    public String getCode() {
        return code;
    }

    public void setCodigo(String code) {
        this.code = code;
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
