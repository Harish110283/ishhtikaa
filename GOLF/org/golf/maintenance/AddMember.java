package org.golf.maintenance;
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

import org.golf.GolfCore;

public class AddMember extends GolfCore
{
    int autocode=0;
    Label lTitle = addLabel("Add a new Member",200,50,250,30,this);
    Label lMbship = addLabel("Membership no.",20,100,150,20,this);
    Label lName = addLabel("Name",20,140,140,20,this);
    Label lDob = addLabel("Date of Birth",20,180,150,20,this);
    Label lMF = addLabel("M/F",20,220,50,20,this);
    Label lEmail =addLabel("E-mail ID",20,260,70,20,this);
    TextField tfMbship = addTextField("",170,100,75,20,this);
    TextField tfName = addTextField("",170,140,120,20,this);
    TextField tfDob = addTextField("",170,180,120,20,this);
    Choice chMF = addChoice("Male|Female",170,220,120,20,this);
    TextField tfEmail =addTextField("",170,260,130,20,this);
    
    
    Label lMobilno = addLabel("Mobile Number",350,180,100,20,this);
    Label lAddresse = addLabel("Addresse",350,220,100,20,this);
    Label lHandicap = addLabel("Handicap",350,300,100,20,this);  
    TextField tfMobilno = addTextField("",450,180,120,20,this);
    TextField tfAddresse = addTextField("",450,220,120,60,this);
    TextField tfHandicap = addTextField("",450,300,120,20,this);
      
      
    Button bSave = addButton("SAVE",200,370,100,50,this);
    Button bCancel = addButton("CANCEL",330,370,100,50,this);
   
    Menu AddNewCdMenu = addMenu("Help|Back to Main Menu|Quit");

     public AddMember()
    { 
        lTitle.setFont(new Font("Courier New",3,16));
        setSize(650,500);
        setTitle("New Member");
    }
    public void actions(Object source, String command)
    {
        if(source==bCancel)
        {this.dispose();}
     if(source == bSave)
        {
            String Mship = tfMbship.getText();
            String Name = tfName.getText();
            String Dob = tfDob.getText();
            String MF = chMF.getSelectedItem();
            String Email = tfEmail.getText();
            String Mobilno = tfMobilno.getText();
            String Addresse = tfAddresse.getText();
            String Handicap = tfHandicap.getText();
            
            if(Mship.length() > 0 && Name.length() > 0 && Dob.length() > 0 && MF.length() > 0 && Email.length() > 0 
            && Addresse.length() > 0 && Handicap.length() > 0   && Mobilno.length() > 0)
              
            memberdetails(Mship,Name,Dob,MF, Email,Mobilno,Addresse,Handicap);
            else 
               output("ERROR: one or more feilds are empty please try again");
        }
        }
        public void memberdetails(String Mship,String Name,String Dob,String MF, String Email, String Mobilno, String Addresse, String Handicap)
    {
        /*
     * This saves a database of all the members in the  Golf Club 
     * There could be more than 600-700 members in the Golf Club
     * Parameters:
     * Each member detail has the following fields in their record:
     * Membership no     - 20 bytes
       Name       - 50 bytes
       DOB      - 20 bytes
       MF       - 10 bytes
       Email-ID - 50 bytes
       Mobil no      - 20 bytes
       Addresse - 100 bytes
       Handicap - 20 bytes
       
     * Therefore, one member has 290 bytes space required. If there are around 700 
     * members in one club, the random access file will need to be around 203000 bytes.

     * Before: There is a random access file, main program has decided that this is not a duplicate
     * After: There is a random access file with a new member details database
     * Pseudocode:
     * seek to the end of file
     * write in data - save member
     * */

 try
        {
           RandomAccessFile memberdata = new RandomAccessFile("memberdetails.dat","rw");
           long data = (memberdata.length()+289)/290;
           long filelength = memberdata.length();
           
         
                   memberdata.seek(data*290); //seeks the position of book name
                   memberdata.writeUTF(Mship);// writes the book name in the database
                   memberdata.seek((data*290)+20); //seeks the position of author name
                   memberdata.writeUTF(Name);//writes the author name in the database
                   memberdata.seek((data*290)+70); //seeks the position of book of the book id
                   memberdata.writeUTF (Dob);//writes the book id in the database
                   memberdata.seek((data*290)+90); //seeks the position of the type
                   memberdata.writeUTF(MF);//writes the type in the database
                   memberdata.seek((data*290)+100); //seeks the position of the publisher
                   memberdata.writeUTF(Email);//writes the publisher in the database
                   memberdata.seek((data*290)+150); //seeks the position of book name
                   memberdata.writeUTF(Mobilno);// writes the book name in the database
                   memberdata.seek((data*290)+170); //seeks the position of book name
                   memberdata.writeUTF(Addresse);// writes the book name in the database
                   memberdata.seek((data*290)+270); //seeks the position of book name
                   memberdata.writeUTF(Handicap);// writes the book name in the database
                   
                    output("Member details have been added");
          
            memberdata.close();
            this.dispose();
        }
        catch (IOException e)//handling the error
        {
            System.out.println("ERROR OCCURED WHILE TRYING TO SAVE MEMBER DETAILS");
        }

}

    }
    