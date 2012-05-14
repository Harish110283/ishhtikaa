package org.golf.login;
/*
******************************************************
********************************************************
             ADDNEWCD CLASS extends EASYAPP
********************************************************
********************************************************
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;
import org.golf.MainMenu;

public class Login extends GolfCore
{
    int autocode=0;
    
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    TextField tfDate = addTextField(formattedDate,450,50,100,20,this);
    
    
    Label lLogin = addLabel("Login Screen",200,50,250,30,this);
    Label lUser = addLabel("User ID",20,100,150,20,this);
    Label lPassword = addLabel("Password",20,140,150,20,this);
    
    Button bGO = addButton("GO",120,200,160,60,this);
    TextField tfLogin = addTextField("",170,100,120,20,this);
    TextField tfName = addTextField("",170,140,120,20,this);
   
   
   
    Menu AddNewCdMenu = addMenu("Help|Quit");

  public Login()
    {
        
        setSize(650,300);
        setTitle("Login");
        lLogin.setFont(new Font("Courier New",3,20));
    }
    public void actions(Object source, String command)
    {
  if(source==bGO)
{new MainMenu();
this.dispose();}
}

}