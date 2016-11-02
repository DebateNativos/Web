/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.debateulatina;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Joss
 */
@ManagedBean(name="login")
@SessionScoped
public class LoginAdmin {

   String username;
   String password;
   
   private UIComponent component;

    public LoginAdmin(UIComponent component) {
        this.component = component;
    }

    public UIComponent getComponent() {
        return component;
    }

    public void setComponent(UIComponent component) {
        this.component = component;
    }
   
    public LoginAdmin() {
    }
 public LoginAdmin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 public void loginSession(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        boolean loggedIn = false;
         
        if(username != null && username.equals("admin") && password!= null && password.equals("admin")) {
            loggedIn = true;
            try {
                ec.redirect("menuPrincipal.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
    } 
    
    
    
    public void logout(){}

}
