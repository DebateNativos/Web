/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.jpa.data.DebateData;
import com.podiumcr.jpa.data.UserData;

import com.podiumcr.jpa.entities.User;

import com.podiumcr.jpa.entities.Debate;
import static com.podiumcr.podiumwebapp.common.EntityListener.em;
import com.podiumcr.podiumwebapp.data.Course;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Joss
 */
@Named(value = "allView")
@ViewScoped
public class AllView implements Serializable {
private List<User> user;
private List<Debate> debateActive;
private List<Debate> debate;

UserData data = new UserData(em);
DebateData dataD = new DebateData(em);

@PostConstruct
    public void init() {
        user = data.getUsers();
        debate = dataD.getDebates();
        debateActive = dataD.getActiveDebates();
    }

    public List<User> getUser() {
        return user;
    }

    public List<Debate> getDebateActive() {
        return debateActive;
    }

    public List<Debate> getDebate() {
        return debate;
    }

    
  
 
}
