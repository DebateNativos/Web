/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.podiumcr.debateulatina;

import com.podiumcr.podiumwebapp.data.Course;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Joss
 */
@ManagedBean(name="courseView")
@ViewScoped
public class CourseView implements Serializable {
     
    private List<Course> courses;
     
    @ManagedProperty("#{courseService}")
    private CourseService service;
 
    @PostConstruct
    public void init() {
        courses = service.createCourses(3);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setService(CourseService service) {
        this.service = service;
    }

}

