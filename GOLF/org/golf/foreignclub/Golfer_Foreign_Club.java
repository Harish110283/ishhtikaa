package org.golf.foreignclub;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;

public class Golfer_Foreign_Club extends GolfCore
{
    int autocode=0;
    Label lTitle = addLabel("Welcome to your Foreign Club profile ",100,50,250,30,this);
    
    Label Days = addLabel("Choose the Club",25,125,100,30,this);
    Choice chNO = addChoice("",170,125,110,20,this); 
   
    Button b1 = addButton("Go",300,120,75,25,this);
   Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");
  
   public Golfer_Foreign_Club()
    {
        
        setSize(500,200);
        setTitle("Foreign Club profile");
    }
    
     public void actions(Object source, String command)
    {
  
}

}