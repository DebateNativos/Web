/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.debateulatina;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Joss
 */
@Named(value = "menuController")
@Dependent
public class menuController {

    String pageName;
    /**
     * Creates a new instance of menuController
     */
    public menuController() {
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

   
    
    
}
