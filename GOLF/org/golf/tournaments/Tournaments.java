package org.golf.tournaments;
/*
******************************************************
********************************************************
             ADDNEWCD CLASS extends EASYAPP
********************************************************
********************************************************
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;

public class Tournaments extends GolfCore
{
    int autocode=0;
    
     Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    Label Date= addLabel("Date",300,90,50,20,this);
    TextField tfDate = addTextField(formattedDate,350,90,100,20,this);
    
    Label Choics = addLabel("Tees",350,140,50,20,this);
    Choice chNO = addChoice("Gold|Blue|White|Red",400,140,100,20,this); 
    
    
    Label lTour = addLabel("Tournament------",200,50,250,30,this);
    Label lMship = addLabel("Enter Membership no.",20,100,150,20,this);
    Label lName = addLabel("Enter name",20,140,150,20,this);    
    Label lHandicap = addLabel("Handicap",350,400,75,20,this);  
    
    Label lHole1 = addLabel("Enter score for Hole 1",20,200,150,20,this);  
    Label lHole2 = addLabel("Enter score for Hole 2",20,220,150,20,this); 
    Label lHole3 = addLabel("Enter score for Hole 3",20,240,150,20,this);  
    Label lHole4 = addLabel("Enter score for Hole 4",20,260,150,20,this);
    Label lHole5 = addLabel("Enter score for Hole 5",20,280,150,20,this);
    Label lHole6 = addLabel("Enter score for Hole 6",20,300,150,20,this);
    Label lHole7 = addLabel("Enter score for Hole 7",20,320,150,20,this);
    Label lHole8 = addLabel("Enter score for Hole 8",20,340,150,20,this);
    Label lHole9 = addLabel("Enter score for Hole 9",20,360,150,20,this);
    Label lHole10 = addLabel("Enter score for Hole 10",350,200,150,20,this);
    Label lHole11 = addLabel("Enter score for Hole 11",350,220,150,20,this);
    Label lHole12 = addLabel("Enter score for Hole 12",350,240,150,20,this);
    Label lHole13 = addLabel("Enter score for Hole 13",350,260,150,20,this);
    Label lHole14 = addLabel("Enter score for Hole 14",350,280,150,20,this);
    Label lHole15 = addLabel("Enter score for Hole 15",350,300,150,20,this);
    Label lHole16 = addLabel("Enter score for Hole 16",350,320,150,20,this);
    Label lHole17 = addLabel("Enter score for Hole 17",350,340,150,20,this);
    Label lHole18 = addLabel("Enter score for Hole 18",350,360,150,20,this);
    
    
    TextField tfMship = addTextField("",170,100,75,20,this);
    TextField tfName = addTextField("",170,140,120,20,this);
    
    TextField tfHole1 = addTextField("",170,200,55,20,this);
    TextField tfHole2 = addTextField("",170,220,55,20,this);
    TextField tfHole3 = addTextField("",170,240,55,20,this);
    TextField tfHole4 = addTextField("",170,260,55,20,this);
    TextField tfHole5 = addTextField("",170,280,55,20,this);
    TextField tfHole6 = addTextField("",170,300,55,20,this);
    TextField tfHole7 = addTextField("",170,320,55,20,this);
    TextField tfHole8 = addTextField("",170,340,55,20,this);
    TextField tfHole9 = addTextField("",170,360,55,20,this);
    TextField tfHole10 = addTextField("",500,200,55,20,this);
    TextField tfHole11 = addTextField("",500,220,55,20,this);
    TextField tfHole12 = addTextField("",500,240,55,20,this);
    TextField tfHole13 = addTextField("",500,260,55,20,this);
    TextField tfHole14 = addTextField("",500,280,55,20,this);
    TextField tfHole15 = addTextField("",500,300,55,20,this);
    TextField tfHole16 = addTextField("",500,320,55,20,this);
    TextField tfHole17 = addTextField("",500,340,55,20,this);
    TextField tfHole18 = addTextField("",500,360,55,20,this);
 
    TextField tfHandicap = addTextField("",450,400,55,20,this);
    
    Button bSave = addButton("SAVE",140,450,100,50,this);
    Button bCancel = addButton("CANCEL",260,450,100,50,this);
    Button bNext = addButton("Next",390,450,100,50,this);
    
    Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");

    public Tournaments()
    {
        
        setSize(700,600);
        setTitle("Tournaments");
        lTour.setFont(new Font("Courier New",3,16));
    }
 
    public void actions(Object source, String command)
    {
  if(source == bSave)
        {
            String Mship = tfMship.getText();
            String Name = tfName.getText();
            String Tees = chNO.getSelectedItem();
            String Handicap= tfHandicap.getText();
            
            String Hole1 = tfHole1.getText();
            String Hole2 = tfHole2.getText();
            String Hole3 = tfHole3.getText();
            String Hole4 = tfHole4.getText();
            String Hole5 = tfHole5.getText();
            String Hole6 = tfHole6.getText();
            String Hole7 = tfHole7.getText();
            String Hole8 = tfHole8.getText();
            String Hole9 = tfHole9.getText();
            String Hole10 = tfHole10.getText();
            String Hole11 = tfHole11.getText();
            String Hole12 = tfHole12.getText();
            String Hole13 = tfHole13.getText();
            String Hole14 = tfHole14.getText();
            String Hole15 = tfHole15.getText();
            String Hole16 = tfHole16.getText();
            String Hole17 = tfHole17.getText();
            String Hole18 = tfHole18.getText();
            
            
            if( Name.length() > 0 && Tees.length() > 0
            && Hole1.length() > 0 && Hole2.length() > 0 && Hole3.length() > 0 && Hole4.length() > 0 && Hole5.length() > 0 && Hole6.length() > 0 && Hole7.length() > 0 && Hole8.length() > 0 && Hole9.length() > 0 && Hole10.length() > 0 && Hole11.length() > 0 && Hole12.length() > 0 && Hole13.length() > 0 && Hole14.length() > 0 && Hole15.length() > 0 && Hole16.length() > 0 && Hole17.length() > 0 && Hole18.length() > 0 )
              tournamentdetails(Mship,Tees,Name,Handicap,Hole1,Hole2,Hole3,Hole4,Hole5,Hole6,Hole7,Hole8,Hole9,Hole10,Hole11,Hole12,Hole13,Hole14,Hole15,Hole16,Hole17,Hole18);
              else 
               output("ERROR: one or more feilds are empty please try again");
        }
} 
public void tournamentdetails(String Tees,String Handicap,String Mship,String Name,String Hole1,String Hole2, String Hole3, String Hole4, String Hole5, String Hole6,String Hole7,String Hole8, String Hole9, String Hole10, String Hole11, String Hole12,String Hole13,String Hole14, String Hole15, String Hole16, String Hole17, String Hole18)
{
    /*
     * This saves a database of all the members in the  Golf Club 
     * There could be more than 600-700 members in the Golf Club
     * Parameters:
     * Each member detail has the following fields in their record:
     * Membership no     - 10 bytes
       Name       - 50 bytes
       Hole1      - 5 bytes
       Hole2      - 5 bytes
       Hole3      - 5 bytes
       Hole4      - 5 bytes
       Hole5      - 5 bytes
       Hole6      - 5 bytes
       Hole7      - 5 bytes
       Hole8      - 5 bytes
       Hole9      - 5 bytes
       Hole10      - 5 bytes
       Hole11      - 5 bytes
       Hole12      - 5 bytes
       Hole13      - 5 bytes
       Hole14      - 5 bytes
       Hole15      - 5 bytes
       Hole16      - 5 bytes
       Hole17      - 5 bytes
       Hole18     - 5 bytes
       Handicap - 20 bytes
       
     * Therefore, one member has 170 bytes space required. If there are around 700 
     * members in one club, the random access file will need to be around 119000 bytes.

     * Before: There is a random access file, main program has decided that this is not a duplicate
     * After: There is a random access file with a new tournament details database
     * Pseudocode:
     * seek to the end of file
     * write in data - save tournamnet
     * */
 try
        {
           RandomAccessFile tournamentdetails = new RandomAccessFile("tournamentdetails.dat","rw");
           long data = (tournamentdetails.length()+169)/170;
           long filelength = tournamentdetails.length();
           
         
                   tournamentdetails.seek(data*130); //seeks the position of book name
                   tournamentdetails.writeUTF(Mship);// writes the book name in the database
                   tournamentdetails.seek((data*130)+10); //seeks the position of author name
                   tournamentdetails.writeUTF(Name);//writes the author name in the database
                   tournamentdetails.seek((data*130)+60); //seeks the position of book of the book id
                   tournamentdetails.writeUTF (Hole1);//writes the book id in the database
                   tournamentdetails.seek((data*130)+65); //seeks the position of the type
                   tournamentdetails.writeUTF(Hole2);//writes the type in the database
                   tournamentdetails.seek((data*130)+70); //seeks the position of the publisher
                   tournamentdetails.writeUTF(Hole3);//writes the publisher in the database
                   tournamentdetails.seek((data*130)+75); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole4);// writes the book name in the database
                   tournamentdetails.seek((data*130)+80); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole5);// writes the book name in the database
                   tournamentdetails.seek((data*130)+85); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole6);// writes the book name in the database
                   tournamentdetails.seek((data*130)+90); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole7);// writes the book name in the database
                   tournamentdetails.seek((data*130)+95); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole8);// writes the book name in the database
                   tournamentdetails.seek((data*130)+100); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole9);// writes the book name in the database
                   tournamentdetails.seek((data*130)+105); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole10);// writes the book name in the database
                   tournamentdetails.seek((data*130)+110); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole11);// writes the book name in the database
                   tournamentdetails.seek((data*130)+115); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole12);// writes the book name in the database
                   tournamentdetails.seek((data*130)+120); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole13);// writes the book name in the database
                   tournamentdetails.seek((data*130)+125); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole14);// writes the book name in the database
                   tournamentdetails.seek((data*130)+130); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole15);// writes the book name in the database
                   tournamentdetails.seek((data*130)+135); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole16);// writes the book name in the database
                   tournamentdetails.seek((data*130)+140); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole17);// writes the book name in the database
                   tournamentdetails.seek((data*130)+145); //seeks the position of book name
                   tournamentdetails.writeUTF(Hole18);// writes the book name in the database
                   tournamentdetails.seek((data*130)+150); //seeks the position of book name
                   tournamentdetails.writeUTF(Handicap);// writes the book name in the database
                    output("Tournament details have been added");
          
            tournamentdetails.close();
            this.dispose();
        }
        catch (IOException e)//handling the error
        {
            System.out.println("ERROR OCCURED WHILE TRYING TO SAVE CUSTOMER DETAILS");
        }
    }
}