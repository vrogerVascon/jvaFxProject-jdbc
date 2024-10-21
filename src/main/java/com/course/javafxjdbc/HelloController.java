package com.course.javafxjdbc;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;


    @FXML
    public void OnMenuItemSellerAction(){
        System.out.println("OnMenuItemSellerAction");

    }
    @FXML
    public void OnMenuItemDepartmentAction(){
        System.out.println("OnMenuItemDepartmentAction");

    }
    @FXML
    public void OnMenuItemAboutAction(){
        System.out.println("OnMenuItemAboutAction");


    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }

}