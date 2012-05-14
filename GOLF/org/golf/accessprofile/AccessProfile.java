package org.golf.accessprofile;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;

public class AccessProfile extends GolfCore
{
    int autocode=0;
    Label Profile = addLabel("Welcome to Profile Modifier",150,50,150,10,this);
    Label Mship = addLabel("Enter your membership number",20,100,200,30,this);
    
    TextField tfMship = addTextField("",220,102,70,20,this); 
    
    Button b0 = addButton("Go ------>",300,95,70,30,this);
    
    Menu AddNewCdMenu = addMenu("Help|Back Main Menu |Quit");
    
    public AccessProfile()
    {
        
        setSize(500,200);
        setTitle("Access Profile");
    }
    
    public void actions(Object source, String command)
    {
        
 if(source==b0)
{new  AccessProfile2();
this.dispose();}

}
}



