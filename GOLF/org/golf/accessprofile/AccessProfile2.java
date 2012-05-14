package org.golf.accessprofile;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;
import org.golf.foreignclub.Golfer_Foreign_Club;
import org.golf.handicap.HandicapPlayer;
import org.golf.stats.GameStats;
import org.golf.tournaments.TournamentPlayer;

public class AccessProfile2 extends GolfCore
{
    int autocode=0;
    
Label Pro= addLabel("-----'s  Profile",180,50,80,30,this);
    
Label Choose= addLabel("View my:",25,95,50,20,this); 
Choice chNO = addChoice("Handicap|Tournament Details|Game Stats|Foreign Clubs|Rounds",90,95,120,20,this); 

Label Season= addLabel("Year:",225,95,50,20,this); 
Choice chSeason = addChoice("2012|2013|.|.|.|.|.",285,95,120,20,this); 

Button b0= addButton("Go",175,155,100,50,this);

 Menu AddNewCdMenu = addMenu("Help|Back to profile modifier |Quit");
 
 public AccessProfile2()
 {
       setSize(450,250);
        setTitle("----'s Profile");
    }
    
    public void actions(Object source, String command)
    {
      if(chNO.getSelectedIndex()==0)
      {   new HandicapPlayer(); }
       if(chNO.getSelectedIndex()==1)
      {   new  TournamentPlayer(); }
        if(chNO.getSelectedIndex()==2)
      {   new  GameStats(); }
      if(chNO.getSelectedIndex()==3)
      {   new  Golfer_Foreign_Club(); }
       
}

}



