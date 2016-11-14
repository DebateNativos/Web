/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.jpa.data.UserData;
import com.podiumcr.jpa.entities.Professor;
import com.podiumcr.jpa.entities.User;
import static com.podiumcr.podiumwebapp.common.EntityListener.em;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

import javafx.scene.control.TableColumn.CellEditEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import java.io.Serializable;
import java.util.List;
import org.primefaces.event.RowEditEvent;
/**
 *
 * @author Joss
 */
@Named(value = "dialogView")
@SessionScoped
public class DialogView implements Serializable {

   String email;
   String password;
   String name;
   String lastName;
   String secondLastname;
   Boolean admin;
   int idUniversity;
   String phone;
   int role;
   String address;
   
   private User selectedUser;
 

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
           
   
   UserData user = new UserData(em);
    /**
     * Creates a new instance of DialogView
     */
   
    public DialogView()  {
    }
    //hacer la instancia según el rol

    public DialogView(String email, String password, String name, String lastName, String secondLastname, Boolean admin, int idUniversity, String phone, int role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.secondLastname = secondLastname;
        this.admin = admin;
        this.idUniversity = idUniversity;
        this.phone = phone;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastname() {
        return secondLastname;
    }

    public void setSecondLastname(String secondLastname) {
        this.secondLastname = secondLastname;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public int getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(int idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }
    
    
    
    public void newUser(){
     User newUser = null;
       switch (role) {
           case 0:
               newUser = new User(email, password, address, name, lastName,secondLastname, idUniversity,true, phone);
               break;
           case 1:
               newUser = new Professor(email, password, address, name, lastName,secondLastname, idUniversity,phone);
               break;
           case 2:
               newUser = new User(email, password, address, name, lastName,secondLastname, idUniversity,false, phone);
               break;
       }
       
       user.registerUser(newUser);
       
       RequestContext.getCurrentInstance().closeDialog("El usuario ha sido registrado");
    }
     public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((User) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((User) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
}
