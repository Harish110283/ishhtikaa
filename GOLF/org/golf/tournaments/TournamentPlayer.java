package org.golf.tournaments;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;

public class TournamentPlayer extends GolfCore
{
    Label lSearch = addLabel("------ TOURNAMENT",270,40,250,30,this);
    Label lCriteria = addLabel("Players membership no:",20,80,140,20,this);
   
   TextField tfno = addTextField("",180,80,70,20,this);
    Button bSearch = addButton("Search",30,150,120,50,this);
    Button bViewAll = addButton("View All",30,200,120,50,this);
    TextArea tDisplay = addTextArea("",200,150,400,400,this);
    Menu AdministratorMenu = addMenu("Help|Help|Back to Main Menu|Quit");
   
    public TournamentPlayer()
    {
        
        setSize(650,600);
        setTitle("Tournament");
    }
    public void actions(Object source, String command)
    {

        }    
    
}