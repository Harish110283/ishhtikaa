package org.golf.profilemanager;
/*
******************************************************
********************************************************
             CUSTOMER CLASS extends EASYAPP
********************************************************
********************************************************
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import org.golf.GolfCore;
import org.golf.maintenance.AddMember;

public class ManageUserProfile extends GolfCore
{
    Label lTitle = addLabel("WELCOME TO PROFILE MANAGER",170,40,300,30,this);
    Label lCriteria = addLabel("Players membership no:",20,80,140,20,this);
   
    TextField tfno = addTextField("",180,80,70,20,this);
    Button bSearch = addButton("Search",30,200,120,50,this);
    Button bViewAll = addButton("View All",30,250,120,50,this);
    Button bDelete = addButton("Delete",30,300,120,50,this);
    Button bEdit = addButton("Edit",30,350,120,50,this);
    Button bReset = addButton("Reset profile",30,400,120,50,this);
    Button bAdd = addButton("Add a new member",30,450,120,50,this);
    Button bAr = addButton("Add a new record",30,500,120,50,this);
   
    TextArea tDisplay = addTextArea("",200,150,400,400,this);
    Menu AdministratorMenu = addMenu("Help|Help|Back to Main Menu|Quit");
   
    public ManageUserProfile()
    {
        
        setSize(650,600);
        setTitle("Profile_manage_User ");
        lTitle.setFont(new Font("Courier New",3,16));
    }
    public void actions(Object source, String command)
    {
        
if(source==bAdd)
{new AddMember();}

if(source==bAr)
{new Profile();}

        }    
    
}
