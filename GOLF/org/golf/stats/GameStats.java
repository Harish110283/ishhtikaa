package org.golf.stats;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;

public class GameStats extends GolfCore
{
    Label lSearch = addLabel("-------- Stats",270,40,250,30,this);
    
    Label Month= addLabel("Enter the month you want to view:",30,100,200,20,this);
       Choice Month1 = addChoice("January|February|March|April|May|June|July|August|September|October|November|December",250,100,120,20,this);
    

    Button bSearch = addButton("Search",30,150,120,50,this);
    Button bViewAll = addButton("View All",30,200,120,50,this);
     
        
    TextArea tDisplay = addTextArea("",200,150,400,400,this);
    Menu AdministratorMenu = addMenu("Help|Help|Back to Main Menu|Quit");
   
    public GameStats()
    {
        
        setSize(650,600);
        setTitle("Game Stats");
    }
    public void actions(Object source, String command)
    {

        }    
    
}