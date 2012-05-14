package org.golf.handicap;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;

public class HandicapMain extends GolfCore
{
    public static void main(String[] args)
    { new HandicapMain(); }
    
    Label lHandicap = addLabel("Handicap Main",200,50,150,50,this);
    
    Label Mship= addLabel("Enter Membership Number", 20,100,150,20,this);
    TextField tfMship = addTextField("",200,100,100,20,this);
    
    Label Choics = addLabel("Choose the number of scores you want to use",25,150,275,20,this);
    Choice chNO = addChoice("5 Scores|6 Scores|7 Scores|8 Scores|9 Scores|10 Scores|11 Scores|12 Scores|13 Scores|14 Scores|15 Scores|16 Scores|17 Scores|18 Scores|19 Scores|20 Scores",300,145,120,20,this); 
    
    Button b0 = addButton("Go ------>",250,200,100,50,this);
    Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");
    
    
    Label data= addLabel("Number of Differentials Used",200,300,250,20,this);
    Label Round =addLabel("Rounds Entered ",180,330,100,20,this);
    Label Diff = addLabel("Differentials Used",300,330,150,20,this);
    
   
    Label lHole1 = addLabel("5-6",180,360,50,15,this);  
    Label lHole2 = addLabel("7-8",180,390,50,15,this);
    Label lHole3 = addLabel("9-10",180,420,50,15,this);  
    Label lHole4 = addLabel("11-12",180,450,50,15,this); 
    Label lHole5 = addLabel("13-14",180,480,50,15,this);
    Label lHole6 = addLabel("15-16",180,510,50,15,this);
    Label lHole7 = addLabel("17",180,540,50,15,this);
    Label lHole8 = addLabel("18",180,570,50,15,this);
    Label lHole9 = addLabel("19",180,600,50,15,this);
    Label lHole10 = addLabel("20",180,630,50,15,this);

    Label Dif1 = addLabel("1 lowest",300,360,100,15,this);  
    Label Dif2 = addLabel("2 lowest",300,390,100,15,this);
    Label Dif3 = addLabel("3 lowest",300,420,100,15,this);  
    Label Dif4 = addLabel("4 lowest",300,450,100,15,this); 
    Label Dif5 = addLabel("5 lowest",300,480,100,15,this);
    Label Dif6 = addLabel("6 lowest",300,510,100,15,this);
    Label Dif7 = addLabel("7 lowest",300,540,100,15,this);
    Label Dif8 = addLabel("8 lowest",300,570,100,15,this);
    Label Dif9 = addLabel("9 lowest",300,600,100,15,this);
    Label Dif10 = addLabel("10 lowest",300,630,100,15,this);
    
   public HandicapMain()
    {
        
        setSize(650,700);
        setTitle("Handicap Main");
        lHandicap.setFont(new Font("Courier New",3,20));
    }
    public void actions(Object source,String command)
    {
if(source==b0)
{new HandicapCalculator20();}
        }
        

}