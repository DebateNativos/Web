/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.jpa.data.CourseData;
import com.podiumcr.jpa.data.DebateData;
import com.podiumcr.jpa.data.UserData;
import com.podiumcr.jpa.entities.Course;

import com.podiumcr.jpa.entities.User;

import com.podiumcr.jpa.entities.Debate;
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

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }


 private User selectedUser;

 
   DebateData dDta = new DebateData(em);
   UserData data = new UserData(em);
   CourseData cData = new CourseData(em);  


@PostConstruct
    public void init() {
        user = data.getUsers();      
        debate = dDta.getDebates();
        course = cData.getAll();
    }

    public List<User> getUser() {
        return user;
    }

   

    public List<Debate> getDebate() {
        return debate;
    }


       public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }
    
  public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected", ((User) event.getObject()).getEmail());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Car Unselected", ((User) event.getObject()).getEmail());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
}
