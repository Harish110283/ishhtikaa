package org.golf;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.authentication.UserPasswordMaintenance;
import org.golf.foreignclub.Foreign_Club;
import org.golf.handicap.HandicapMain;
import org.golf.profilemanager.ManageUserProfile;
import org.golf.tournaments.TournamentDetails;

public class MainMenu extends GolfCore
{
    public static void main(String[] args)
    { new MainMenu(); }
    Menu mMenu = addMenu("Help|Quit");
    Label lMainForm = addLabel("Main Screeen",200,50,150,50,this);
    Button bTournament = addButton("Tournaments",50,120,150,50,this);
    Button bHandicap = addButton("Handicap calculator",50,190,150,50,this);
    Button bProfile = addButton("Profile Manager",250,120,150,50,this);
    Button bAdmin = addButton("Draw Maker",250,190,150,50,this);
    Button bDatabase = addButton("Database",50,260,150,50,this);
    Button bEdit = addButton("Change Password",250,260,150,50,this);
     Button bClubs = addButton("Foreign Clubs",50,330,150,50,this);
   
     public MainMenu()                          // constructor
    {
       
        setTitle("Main Menu");
        lMainForm.setFont(new Font("Courier New",3,16));
        
    }
    
    
    
    public void actions(Object source,String command)
    {
if(source==bEdit)
{new UserPasswordMaintenance();}

if(source==bProfile)
{new ManageUserProfile();}
        
if(source==bTournament)
{new TournamentDetails();}

if(source==bHandicap)
{new HandicapMain();}

if(source==bClubs)
{new Foreign_Club();}
}
}