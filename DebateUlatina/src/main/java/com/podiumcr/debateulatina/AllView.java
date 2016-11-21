/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.jpa.data.CourseData;
import com.podiumcr.jpa.data.DebateData;
import com.podiumcr.jpa.data.DebateTypeData;
import com.podiumcr.jpa.data.UserData;
import com.podiumcr.jpa.entities.Course;

import com.podiumcr.jpa.entities.User;

import com.podiumcr.jpa.entities.Debate;
import com.podiumcr.jpa.entities.DebateType;
import com.podiumcr.jpa.entities.Professor;
import static com.podiumcr.podiumwebapp.common.EntityListener.em;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Joss
 */
@Named(value = "allView")
@ViewScoped
public class AllView implements Serializable {
private List<User> user;

private List<Debate> debate;
private List<Course> course;
private List<DebateType> type;

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }




 
   DebateData dDta = new DebateData(em);
   UserData data = new UserData(em);
   CourseData cData = new CourseData(em);  
   DebateTypeData typedata = new DebateTypeData(em);


@PostConstruct
    public void init() {
        user = data.getUsers();      
        debate = dDta.getDebates();
        course = cData.getAll();
        type = typedata.getAll();
    }

    public List<User> getUser() {
        return user;
    }

   

    public List<Debate> getDebate() {
        return debate;
    }

    public List<DebateType> getType() {
        return type;
    }

    public void setType(List<DebateType> type) {
        this.type = type;
    }

  public String roleSelected(User a) {
        String role = null;
        if (a instanceof Professor) {
            role = "Profesor";

        } else if (a.getIsAdmin() == true) {
            role = "Administrador";
        } else {
            role = "Estudiante";
        }
        return role;
}
 
    
 
}
