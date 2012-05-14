package org.golf.foreignclub;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.CreateClub;
import org.golf.GolfCore;

public class Foreign_Club extends GolfCore
{
    int autocode=0;
    Label lTitle = addLabel("Welcome to Foreign Club Details",150,50,250,30,this);
    
    Label Days = addLabel("Choose the Club",25,125,100,30,this);
    Choice chNO = addChoice("",170,125,110,20,this); 
    
    Button b0 = addButton("Add a new club",80,200,100,50,this);
    Button b1 = addButton("Go",300,120,75,25,this);
    Button b2 = addButton("Edit club features",210,200,100,50,this);
    Button b3 = addButton("Delete club",340,200,100,50,this);
    Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");
      
    public Foreign_Club()                          // constructor
    {
       
        setTitle("Foreign Clubs");
        lTitle.setFont(new Font("Courier New",3,16));
        
    }
          
     public void actions(Object source, String command)
    {
        
if(source==b0)
{new CreateClub();}

if(source==b1)
{new Foreign_Club_Profile();}

}
}