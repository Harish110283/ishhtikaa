package org.golf;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.accessprofile.AccessProfile;


public class Golfer extends GolfCore
{
    public static void main(String[] args)
    { new MainMenu(); }
    Menu mMenu = addMenu("Help|Quit");
    Label lMainForm = addLabel("Main Screeen",200,50,150,50,this);
    Button bGolfer = addButton("Tournament Results",50,120,150,50,this);
    Button bManager = addButton("View draws for tournaments",50,190,170,50,this);
    Button bProfile = addButton("Player Profile",250,120,150,50,this);
    Button bAdmin = addButton("Upcoming tournaments",250,190,150,50,this);
    public Golfer()                          // constructor
    {
       
        setTitle("Main Menu");
        lMainForm.setFont(new Font("Courier New",1,16));
        
    }
    
    
    
    public void actions(Object source,String command)
    {
if(source==bProfile)
{new AccessProfile ();
        }
        

}
}