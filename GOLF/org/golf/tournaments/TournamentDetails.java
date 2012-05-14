package org.golf.tournaments;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;

public class TournamentDetails extends GolfCore
{
    int autocode=0;
    Label lTitle = addLabel("Welcome to tournament Creator",200,50,250,30,this);
    
    Label Tournamet = addLabel("Enter the name of the tournament",25,100,200,30,this);
    TextField tfTournament = addTextField("",250,105,250,20,this);
    
    Label Days = addLabel("Choose the number of days",25,150,160,30,this);
    Choice chNO = addChoice("1 day tournament|2 day tournament|3 day tournament|4 day tournament",220,155,120,20,this); 
    
   
    Label Players = addLabel("Choose the number of players",25,200,180,30,this);
    TextField tfPlayers = addTextField("",220,205,50,20,this);
    
    
    Button b0 = addButton("Go ------>",250,270,100,50,this);
    Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");
    
    public TournamentDetails()
    {
        lTitle.setFont(new Font("Courier New",3,16));
    }
    
     public void actions(Object source, String command)
    {
 if(source==b0)
{new Tournaments();}
}

}