/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.jpa.data.CourseData;
import com.podiumcr.jpa.data.UserData;
import com.podiumcr.jpa.entities.Course;
import com.podiumcr.jpa.entities.Professor;
import com.podiumcr.jpa.entities.User;
import static com.podiumcr.podiumwebapp.common.EntityListener.em;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Joss
 */
@Named(value = "newCourseView")
@SessionScoped

public class CourseView implements Serializable {
     
    private int idCourse;
    private String name;
    private String courseCode;
    private int curseQuarter;
    private int curseYear;
    private List<User> users;
    private Professor professor;
    private List <Professor> listP ;
    
    private Course selectedCourse;
     
    CourseData dCourse = new CourseData(em);
    UserData prof = new UserData(em);

    public CourseView() {
    }
  

    public CourseView(String name,  int curseQuarter, int curseYear ) {
        
       this.name = name;
        this.curseQuarter = curseQuarter;
        this.curseYear = curseYear;
       
      
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCurseQuarter() {
        return curseQuarter;
    }

    public void setCurseQuarter(int curseQuarter) {
        this.curseQuarter = curseQuarter;
    }

    public int getCurseYear() {
        return curseYear;
    }

    public void setCurseYear(int curseYear) {
        this.curseYear = curseYear;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Course getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(Course selectedCourse) {
        this.selectedCourse = selectedCourse;
    }
    
    
     public void newCourse(){
     Course course = new Course(name, curseQuarter, curseYear);
     
       dCourse.persistDebate(course);
       
       RequestContext.getCurrentInstance().closeDialog("El usuario ha sido registrado");
    }
   public void editCourse(){
      Course cor = selectedCourse;
      cor.setName(name);
      cor.setCurseQuarter(curseQuarter);
      cor.setCurseYear(curseYear);
    
      
      dCourse.persistDebate(cor);
   }
   
   public void deleteCourse(){
    dCourse.removeDebate(selectedCourse);
   
   }
}


