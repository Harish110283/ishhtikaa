package org.golf.authentication;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;


public class UserPasswordMaintenance extends GolfCore
{

int autocode=0;

     Label Title= addLabel("Security",200,50,200,20,this);
     
    Label User1 = addLabel("Enter your current user ID:",20,100,150,20,this);
    TextField tfUser1 = addTextField("",250,100,120,20,this);
    
    Label User2 = addLabel("Enter your new user ID:",20,150,150,20,this);
    TextField tfUser2 = addTextField("",250,150,120,20,this);
   
    Label Password = addLabel("Enter your current password:",20,200,160,20,this);
    TextField tfPassword = addTextField("",250,200,120,20,this);
    
    Label Password2 = addLabel("Enter your new password:",20,250,150,20,this);
    TextField tfPassword2 = addTextField("",250,250,120,20,this);
    
    Label Password3 = addLabel("Reconfirm your new password:",20,300,170,20,this);
    TextField tfPassword3 = addTextField("",250,300,120,20,this);
    
      Button bSave= addButton("Save",80,350,100,50,this);
      Button bCancel= addButton("Cancel",250,350,100,50,this);
      
    Menu AddNewCdMenu = addMenu("Help|Quit");

  public UserPasswordMaintenance()
    {
        
        setSize(500,450);
        setTitle("User ID changer");
        Title.setFont(new Font("Courier New",3,20));
    }
          

    public void actions(Object source, String command)
    {
 if(source==bCancel)
{this.dispose();}
    
        }

}


  