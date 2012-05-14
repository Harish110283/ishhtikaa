package org.golf.login;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;
import org.golf.Golfer;


public class WelcomeFrame extends GolfCore
{
    int autocode=0;
    
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    TextField tfDate = addTextField(formattedDate,450,50,100,20,this);
    
Label Welcome= addLabel("Welcome",200,50,250,30,this);

Button bExit= addButton("Exit",50,250,100,50,this);
Button bLogin =addButton("Login",175,250,100,50,this);
Button bGolfer= addButton("Golfer's Page",300,250,100,50,this);

Menu AddNewCdMenu = addMenu("Help|Quit");

  public WelcomeFrame()                          // constructor
    {
       
        setTitle("Welcome");
        Welcome.setFont(new Font("Courier New",3,20));
        
    }
          
    
     public void actions(Object source, String command)
    {

  if(source==bLogin)
{new Login();this.dispose();}


if(source==bGolfer)
{new Golfer();this.dispose();}

if(source==bExit)
{this.dispose();}
}
}
