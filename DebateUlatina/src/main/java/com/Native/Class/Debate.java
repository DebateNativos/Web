/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Native.Class;

/**
 *
 * @author Joss
 */
public class Debate {

    String fecha;
    String name;
    int duration;
    String course1;
    String course2;
    int introduction;
    int argumentation;
    int question;
    int argumentation2;
    int conclusion;
    
    public Debate() {
    }

    public Debate(String fecha, String name, int duration, String course1, String course2, int introduction, int argumentation, int question, int argumentation2, int conclusion) {
        this.fecha = fecha;
        this.name = name;
        this.duration = duration;
        this.course1 = course1;
        this.course2 = course2;
        this.introduction = introduction;
        this.argumentation = argumentation;
        this.question = question;
        this.argumentation2 = argumentation2;
        this.conclusion = conclusion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public int getIntroduction() {
        return introduction;
    }

    public void setIntroduction(int introduction) {
        this.introduction = introduction;
    }

    public int getArgumentation() {
        return argumentation;
    }

    public void setArgumentation(int argumentation) {
        this.argumentation = argumentation;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getArgumentation2() {
        return argumentation2;
    }

    public void setArgumentation2(int argumentation2) {
        this.argumentation2 = argumentation2;
    }

    public int getConclusion() {
        return conclusion;
    }

    public void setConclusion(int conclusion) {
        this.conclusion = conclusion;
    }
    
    
}
