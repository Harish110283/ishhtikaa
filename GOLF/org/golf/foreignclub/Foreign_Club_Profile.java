package org.golf.foreignclub;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;

public class Foreign_Club_Profile extends GolfCore
{    
    int autocode=0;
    
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    TextField tfDate = addTextField(formattedDate,600,50,100,20,this);
    
    Label Mship = addLabel("Enter Membership no.",10,50,150,20,this);
    TextField tfMship = addTextField("",170,50,75,20,this);
    
    Label Choics = addLabel("Tees",10,350,50,20,this);
    Choice chNO = addChoice("|||",70,350,100,20,this); 
    
    Label Tour = addLabel("Welcome to ----- Club:",350,50,300,30,this);
    Label Holes= addLabel("Holes",10,112,40,10,this);
    Label Enter= addLabel("Enter your scores in the following categories",10,80,250,20,this);
    Label Score= addLabel("Score",10,138,40,10,this);
    
    Label Fairways= addLabel("Fairways Hit",10,200,100,10,this);
    Label Greens= addLabel("Green Hit",10,240,100,10,this);
    Label Sand= addLabel("Sand saves",10,280,100,10,this);
    Label Putts= addLabel("Putts",10,320,100,10,this);
    
    
    
    Label lHole1 = addLabel("1",123,110,20,15,this);  
    Label lHole2 = addLabel("2",153,110,20,15,this);
    Label lHole3 = addLabel("3",183,110,20,15,this);  
    Label lHole4 = addLabel("4",213,110,20,15,this); 
    Label lHole5 = addLabel("5",243,110,20,15,this);
    Label lHole6 = addLabel("6",273,110,20,15,this);
    Label lHole7 = addLabel("7",303,110,20,15,this);
    Label lHole8 = addLabel("8",333,110,20,15,this);
    Label lHole9 = addLabel("9",363,110,20,15,this);
    Label lHole10 = addLabel("10",393,110,20,15,this);
    Label lHole11 = addLabel("11",423,110,20,15,this);
    Label lHole12 = addLabel("12",453,110,20,15,this);
    Label lHole13 = addLabel("13",483,110,20,15,this);
    Label lHole14 = addLabel("14",513,110,20,15,this);
    Label lHole15 = addLabel("15",543,110,20,15,this);
    Label lHole16 = addLabel("16",573,110,20,15,this);
    Label lHole17 = addLabel("17",603,110,20,15,this);
    Label lHole18 = addLabel("18",633,110,20,15,this);
    
    
    TextField tfHole1 = addTextField("",120,130,20,20,this);
    TextField tfHole2 = addTextField("",150,130,20,20,this);
    TextField tfHole3 = addTextField("",180,130,20,20,this);
    TextField tfHole4 = addTextField("",210,130,20,20,this);
    TextField tfHole5 = addTextField("",240,130,20,20,this);
    TextField tfHole6 = addTextField("",270,130,20,20,this);
    TextField tfHole7 = addTextField("",300,130,20,20,this);
    TextField tfHole8 = addTextField("",330,130,20,20,this);
    TextField tfHole9 = addTextField("",360,130,20,20,this);
    TextField tfHole10 = addTextField("",390,130,20,20,this);
    TextField tfHole11 = addTextField("",420,130,20,20,this);
    TextField tfHole12= addTextField("",450,130,20,20,this);
    TextField tfHole13 = addTextField("",480,130,20,20,this);
    TextField tfHole14 = addTextField("",510,130,20,20,this);
    TextField tfHole15 = addTextField("",540,130,20,20,this);
    TextField tfHole16 = addTextField("",570,130,20,20,this);
    TextField tfHole17 = addTextField("",600,130,20,20,this);
    TextField tfHole18 = addTextField("",630,130,20,20,this);
    
    
    TextField tfFw1 = addTextField("",120,200,20,20,this);
    TextField tfFw2 = addTextField("",150,200,20,20,this);
    TextField tfFw3 = addTextField("",180,200,20,20,this);
    TextField tfFw4 = addTextField("",210,200,20,20,this);
    TextField tfFw5 = addTextField("",240,200,20,20,this);
    TextField tfFw6 = addTextField("",270,200,20,20,this);
    TextField tfFw7 = addTextField("",300,200,20,20,this);
    TextField tfFw8 = addTextField("",330,200,20,20,this);
    TextField tfFw9 = addTextField("",360,200,20,20,this);
    TextField tfFw10 = addTextField("",390,200,20,20,this);
    TextField tfFw11 = addTextField("",420,200,20,20,this);
    TextField tfFw12 = addTextField("",450,200,20,20,this);
    TextField tfFw13 = addTextField("",480,200,20,20,this);
    TextField tfFw14 = addTextField("",510,200,20,20,this);
    TextField tfFw15 = addTextField("",540,200,20,20,this);
    TextField tfFw16 = addTextField("",570,200,20,20,this);
    TextField tfFw17 = addTextField("",600,200,20,20,this);
    TextField tfFw18 = addTextField("",630,200,20,20,this);
    
    TextField tfGr1 = addTextField("",120,240,20,20,this);
    TextField tfGr2 = addTextField("",150,240,20,20,this);
    TextField tfGr3 = addTextField("",180,240,20,20,this);
    TextField tfGr4 = addTextField("",210,240,20,20,this);
    TextField tfGr5 = addTextField("",240,240,20,20,this);
    TextField tfGr6 = addTextField("",270,240,20,20,this);
    TextField tfGr7 = addTextField("",300,240,20,20,this);
    TextField tfGr8 = addTextField("",330,240,20,20,this);
    TextField tfGr9 = addTextField("",360,240,20,20,this);
    TextField tfGr10 = addTextField("",390,240,20,20,this);
    TextField tfGr11 = addTextField("",420,240,20,20,this);
    TextField tfGr12 = addTextField("",450,240,20,20,this);
    TextField tfGr13 = addTextField("",480,240,20,20,this);
    TextField tfGr14 = addTextField("",510,240,20,20,this);
    TextField tfGr15 = addTextField("",540,240,20,20,this);
    TextField tfGr16 = addTextField("",570,240,20,20,this);
    TextField tfGr17 = addTextField("",600,240,20,20,this);
    TextField tfGr18 = addTextField("",630,240,20,20,this);
    
    TextField tfSand1 = addTextField("",120,280,20,20,this);
    TextField tfSand2 = addTextField("",150,280,20,20,this);
    TextField tfSand3 = addTextField("",180,280,20,20,this);
    TextField tfSand4 = addTextField("",210,280,20,20,this);
    TextField tfSand5 = addTextField("",240,280,20,20,this);
    TextField tfSand6 = addTextField("",270,280,20,20,this);
    TextField tfSand7 = addTextField("",300,280,20,20,this);
    TextField tfSand8 = addTextField("",330,280,20,20,this);
    TextField tfSand9 = addTextField("",360,280,20,20,this);
    TextField tfSand10 = addTextField("",390,280,20,20,this);
    TextField tfSand11 = addTextField("",420,280,20,20,this);
    TextField tfSand12 = addTextField("",450,280,20,20,this);
    TextField tfSand13 = addTextField("",480,280,20,20,this);
    TextField tfSand14 = addTextField("",510,280,20,20,this);
    TextField tfSand15 = addTextField("",540,280,20,20,this);
    TextField tfSand16 = addTextField("",570,280,20,20,this);
    TextField tfSand17 = addTextField("",600,280,20,20,this);
    TextField tfSand18 = addTextField("",630,280,20,20,this);
    
    TextField tfPutt1 = addTextField("",120,320,20,20,this);
    TextField tfPutt2 = addTextField("",150,320,20,20,this);
    TextField tfPutt3 = addTextField("",180,320,20,20,this);
    TextField tfPutt4 = addTextField("",210,320,20,20,this);
    TextField tfPutt5 = addTextField("",240,320,20,20,this);
    TextField tfPutt6 = addTextField("",270,320,20,20,this);
    TextField tfPutt7 = addTextField("",300,320,20,20,this);
    TextField tfPutt8 = addTextField("",330,320,20,20,this);
    TextField tfPutt9 = addTextField("",360,320,20,20,this);
    TextField tfPutt10 = addTextField("",390,320,20,20,this);
    TextField tfPutt11 = addTextField("",420,320,20,20,this);
    TextField tfPutt12 = addTextField("",450,320,20,20,this);
    TextField tfPutt13 = addTextField("",480,320,20,20,this);
    TextField tfPutt14 = addTextField("",510,320,20,20,this);
    TextField tfPutt15 = addTextField("",540,320,20,20,this);
    TextField tfPutt16 = addTextField("",570,320,20,20,this);
    TextField tfPutt17 = addTextField("",600,320,20,20,this);
    TextField tfPutt18 = addTextField("",630,320,20,20,this);
        
    
    Button bSave = addButton("SAVE",300,400,100,50,this);
    Button bCancel = addButton("CANCEL",425,400,100,50,this);
   
    Menu AddNewCdMenu = addMenu("Help|Back to Access Profile |Quit");
       
    public Foreign_Club_Profile()
    {
        
        setSize(800,550);
        setTitle("Foreign Club Profile");
          Tour.setFont(new Font("Courier New",3,16));
    }
    public void actions(Object source, String command)
    {
        if(source==bCancel)
        {
            output("Are you sure you want to quit");
            this.dispose();
        }
        
  if(source == bSave)
        {
            
            String Mship = tfMship.getText();    
            String NO = chNO.getSelectedItem();
            
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
            
            String Fw1 = tfFw1.getText();
            String Fw2 = tfFw2.getText();
            String Fw3 = tfFw3.getText();
            String Fw4 = tfFw4.getText();
            String Fw5 = tfFw5.getText();
            String Fw6 = tfFw6.getText();
            String Fw7 = tfFw7.getText();
            String Fw8 = tfFw8.getText();
            String Fw9 = tfFw9.getText();
            String Fw10 = tfFw10.getText();
            String Fw11 = tfFw11.getText();
            String Fw12 = tfFw12.getText();
            String Fw13 = tfFw13.getText();
            String Fw14 = tfFw14.getText();
            String Fw15 = tfFw15.getText();
            String Fw16 = tfFw16.getText();
            String Fw17 = tfFw17.getText();
            String Fw18 = tfFw18.getText();
            
               
    String Gr1 = tfGr1.getText();
    String Gr2 = tfGr2.getText();
    String Gr3 = tfGr3.getText();
    String Gr4 = tfGr4.getText();
    String Gr5 = tfGr5.getText();
    String Gr6 = tfGr6.getText();
    String Gr7 = tfGr7.getText();
    String Gr8 = tfGr8.getText();
    String Gr9 = tfGr9.getText();
    String Gr10 = tfGr10.getText();
    String Gr11 = tfGr11.getText();
    String Gr12 = tfGr12.getText();
    String Gr13 = tfGr13.getText();
    String Gr14 = tfGr14.getText();
    String Gr15 = tfGr15.getText();
    String Gr16 = tfGr16.getText();
    String Gr17 = tfGr17.getText();
    String Gr18 = tfGr18.getText();
    
    String Putt1 = tfPutt1.getText();
    String Putt2 = tfPutt2.getText();
    String Putt3 = tfPutt3.getText();
    String Putt4 = tfPutt4.getText();
    String Putt5 = tfPutt5.getText();
    String Putt6 = tfPutt6.getText();
    String Putt7 = tfPutt7.getText();
    String Putt8 = tfPutt8.getText();
    String Putt9 = tfPutt9.getText();
    String Putt10 = tfPutt10.getText();
    String Putt11 = tfPutt11.getText();
    String Putt12 = tfPutt12.getText();
    String Putt13 = tfPutt13.getText();
    String Putt14 = tfPutt14.getText();
    String Putt15 = tfPutt15.getText();
    String Putt16 = tfPutt16.getText();
    String Putt17 = tfPutt17.getText();
    String Putt18 = tfPutt18.getText();
    
    String Sand1 = tfSand1.getText();
    String Sand2 = tfSand2.getText();
    String Sand3 = tfSand3.getText();
    String Sand4 = tfSand4.getText();
    String Sand5 = tfSand5.getText();
    String Sand6 = tfSand6.getText();
    String Sand7 = tfSand7.getText();
    String Sand8 = tfSand8.getText();
    String Sand9 = tfSand9.getText();
    String Sand10 = tfSand10.getText();
    String Sand11 = tfSand11.getText();
    String Sand12 = tfSand12.getText();
    String Sand13 = tfSand13.getText();
    String Sand14 = tfSand14.getText();
    String Sand15 = tfSand15.getText();
    String Sand16 = tfSand16.getText();
    String Sand17 = tfSand17.getText();
    String Sand18 = tfSand18.getText();
    
            if(Mship.length() >0 && NO.length() > 0  
            && Hole1.length() > 0 && Hole2.length() > 0 && Hole3.length() > 0 && Hole4.length() > 0 && Hole5.length() > 0 && Hole6.length() > 0 && Hole7.length() > 0 && Hole8.length() > 0 && Hole9.length() > 0 && Hole10.length() > 0 && Hole11.length() > 0 && Hole12.length() > 0 && Hole13.length() > 0 && Hole14.length() > 0 && Hole15.length() > 0 && Hole16.length() > 0 && Hole17.length() > 0 && Hole18.length() > 0 
            && Fw1.length() > 0 && Fw2.length() > 0 && Fw3.length() > 0 && Fw4.length() > 0 && Fw5.length() > 0 && Fw6.length() > 0 && Fw7.length() > 0 && Fw8.length() > 0 && Fw9.length() > 0 && Fw10.length() > 0 && Fw11.length() > 0 && Fw12.length() > 0 && Fw13.length() > 0 && Fw14.length() > 0 && Fw15.length() > 0 && Fw16.length() > 0 && Fw17.length() > 0 && Fw18.length() > 0 )
      
            fcprofile(Mship,NO,
            Hole1,Hole2,Hole3,Hole4,Hole5,Hole6,Hole7,Hole8,Hole9,Hole10,Hole11,Hole12,Hole13,Hole14,Hole15,Hole16,Hole17,Hole18,
            Fw1,Fw2,Fw3,Fw4,Fw5,Fw6,Fw7,Fw8,Fw9,Fw10,Fw11,Fw12,Fw13,Fw14,Fw15,Fw16,Fw17,Fw18,
            
            Gr1,Gr2,Gr3,Gr4,Gr5,Gr6,Gr7,Gr8,Gr9,Gr10,Gr11,Gr12,Gr13,Gr14,Gr15,Gr16,Gr17,Gr18,
            Putt1,Putt2,Putt3,Putt4,Putt5,Putt6,Putt7,Putt8,Putt9,Putt10,Putt11,Putt12,Putt13,Putt14,Putt15,Putt16,Putt17,Putt18,
            Sand1,Sand2,Sand3,Sand4,Sand5,Sand6,Sand7,Sand8,Sand9,Sand10,Sand11,Sand12,Sand13,Sand14,Sand15,Sand16,Sand17,Sand18);
              else 
               output("ERROR: one or more feilds are empty please try again");
        }
}
public void fcprofile(String Mship,String NO,
                        String Hole1,String Hole2, String Hole3, String Hole4, String Hole5, String Hole6,String Hole7,String Hole8, String Hole9, String Hole10, String Hole11, String Hole12,String Hole13,String Hole14, String Hole15, String Hole16, String Hole17, String Hole18,
                                                                   
                        String Fw1, String Fw2, String Fw3, String Fw4, String Fw5, String Fw6, String Fw7, String Fw8, String Fw9, String Fw10, String Fw11, String Fw12, String Fw13, String Fw14, String Fw15, String Fw16, String Fw17, String Fw18,
                        String Gr1, String Gr2, String Gr3, String Gr4, String Gr5, String Gr6, String Gr7, String Gr8, String Gr9, String Gr10, String Gr11, String Gr12, String Gr13, String Gr14, String Gr15, String Gr16, String Gr17, String Gr18,
                        String Putt1, String Putt2, String Putt3, String Putt4, String Putt5, String Putt6, String Putt7, String Putt8, String Putt9, String Putt10, String Putt11, String Putt12, String Putt13, String Putt14, String Putt15, String Putt16, String Putt17, String Putt18,
                        String Sand1, String Sand2, String Sand3, String Sand4, String Sand5, String Sand6, String Sand7, String Sand8, String Sand9, String Sand10, String Sand11, String Sand12, String Sand13, String Sand14, String Sand15, String Sand16, String Sand17, String Sand18
                        )
{
    /*
     * This saves a database of all the members in the  Golf Club 
     * There could be more than 600-700 members in the Golf Club
     * Parameters:
     * Each member detail has the following fields in their record:
     
     * Mship       - 20 bytes
     * Tees        -10 bytes
     * 
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
       
       Fw1      - 5 bytes
       Fw2      - 5 bytes
       Fw3      - 5 bytes
       Fw4      - 5 bytes
       Fw5      - 5 bytes
       Fw6      - 5 bytes
       Fw7      - 5 bytes
       Fw8      - 5 bytes
       Fw9      - 5 bytes
       Fw10      - 5 bytes
       Fw11      - 5 bytes
       Fw12      - 5 bytes
       Fw13      - 5 bytes
       Fw14      - 5 bytes
       Fw15      - 5 bytes
       Fw16      - 5 bytes
       Fw17      - 5 bytes
       Fw18      - 5 bytes
       
           
       Gr1      - 5 bytes
       Gr2      - 5 bytes
       Gr3      - 5 bytes
       Gr4      - 5 bytes
       Gr5      - 5 byes
       Gr6      - 5 bytes
       Gr7      - 5 bytes
       Gr8      - 5 bytes
       Gr9      - 5 bytes
       Gr10      - 5 bytes
       Gr11      - 5 bytes
       Gr12      - 5 bytes
       Gr13      - 5 bytes
       Gr14      - 5 bytes
       Gr15      - 5 bytes
       Gr16      - 5 bytes
       Gr17      - 5 bytes
       Gr18      - 5 bytes
       
       Putt1      - 5 bytes
       Putt2      - 5 bytes
       Putt3      - 5 bytes
       Putt4      - 5 bytes
       Putt5      - 5 bytes
       Putt6      - 5 bytes
       Putt7      - 5 bytes
       Putt8      - 5 bytes
       Putt9      - 5 bytes
       Putt10      - 5 bytes
       Putt11      - 5 bytes
       Putt12      - 5 bytes
       Putt13      - 5 bytes
       Putt14      - 5 bytes
       Putt15      - 5 bytes
       Putt16      - 5 bytes
       Putt17      - 5 bytes
       Putt18      - 5 bytes
       
       
       Sand1      - 5 bytes
       Sand2      - 5 bytes
       Sand3      - 5 bytes
       Sand4      - 5 bytes
       Sand5      - 5 bytes
       Sand6      - 5 bytes
       Sand7      - 5 bytes
       Sand8      - 5 bytes
       Sand9      - 5 bytes
       Sand10      - 5 bytes
       Sand11      - 5 bytes
       Sand12      - 5 bytes
       Sand13      - 5 bytes
       Sand14      - 5 bytes
       Sand15      - 5 bytes
       Sand16      - 5 bytes
       Sand17      - 5 bytes
       Sand18      - 5 bytes
       
       
            
     * Therefore, one member has 480 bytes space required. If there are around 1000 
     * members in one club, the random access file will need to be around 480000 bytes.

     * Before: There is a random access file, main program has decided that this is not a duplicate
     * After: There is a random access file with a new tournament details database
     * Pseudocode:
     * seek to the end of file
     * write in data - save tournamnet
     * *////
 try
        {
           RandomAccessFile fcprofile = new RandomAccessFile("fcprofile.dat","rw");
           long data = (fcprofile.length()+479)/480;
           long filelength = fcprofile.length();
           
         
                   fcprofile.seek(data*480); //seeks the position of book name
                   fcprofile.writeUTF(Mship);// writes the book name in the database
                   
                   fcprofile.seek((data*480)+20); //seeks the position of author name
                   fcprofile.writeUTF(NO);//writes the author name in the database              
                                    
                   fcprofile.seek((data*480)+30); //seeks the position of author name                
                   fcprofile.writeUTF (Hole1);//writes the book id in the database
                   fcprofile.seek((data*480)+35); //seeks the position of the type
                   fcprofile.writeUTF(Hole2);//writes the type in the database
                   fcprofile.seek((data*270)+40); //seeks the position of the publisher
                   fcprofile.writeUTF(Hole3);//writes the publisher in the database
                   fcprofile.seek((data*480)+45); //seeks the position of book name
                   fcprofile.writeUTF(Hole4);// writes the book name in the database
                   fcprofile.seek((data*480)+50); //seeks the position of book name
                   fcprofile.writeUTF(Hole5);// writes the book name in the database
                   fcprofile.seek((data*480)+55); //seeks the position of book name
                   fcprofile.writeUTF(Hole6);// writes the book name in the database
                   fcprofile.seek((data*480)+60); //seeks the position of book name
                   fcprofile.writeUTF(Hole7);// writes the book name in the database
                   fcprofile.seek((data*480)+65); //seeks the position of book name
                   fcprofile.writeUTF(Hole8);// writes the book name in the database
                   fcprofile.seek((data*480)+70); //seeks the position of book name
                   fcprofile.writeUTF(Hole9);// writes the book name in the database
                   fcprofile.seek((data*480)+75); //seeks the position of book name
                   fcprofile.writeUTF(Hole10);// writes the book name in the database
                   fcprofile.seek((data*480)+80); //seeks the position of book name
                   fcprofile.writeUTF(Hole11);// writes the book name in the database
                   fcprofile.seek((data*480)+85); //seeks the position of book name
                   fcprofile.writeUTF(Hole12);// writes the book name in the database
                   fcprofile.seek((data*480)+90); //seeks the position of book name
                   fcprofile.writeUTF(Hole13);// writes the book name in the database
                   fcprofile.seek((data*480)+95); //seeks the position of book name
                   fcprofile.writeUTF(Hole14);// writes the book name in the database
                   fcprofile.seek((data*480)+100); //seeks the position of book name
                   fcprofile.writeUTF(Hole15);// writes the book name in the database
                   fcprofile.seek((data*480)+105); //seeks the position of book name
                   fcprofile.writeUTF(Hole16);// writes the book name in the database
                   fcprofile.seek((data*480)+110); //seeks the position of book name
                   fcprofile.writeUTF(Hole17);// writes the book name in the database
                   fcprofile.seek((data*480)+115); //seeks the position of book name
                   fcprofile.writeUTF(Hole18);// writes the book name in the database
                 
                   fcprofile.seek((data*480)+120); //seeks the position of book of the book id
                   fcprofile.writeUTF (Fw1);//writes the book id in the database
                   fcprofile.seek((data*480)+125); //seeks the position of the type
                   fcprofile.writeUTF(Fw2);//writes the type in the database
                   fcprofile.seek((data*480)+130); //seeks the position of the publisher
                   fcprofile.writeUTF(Fw3);//writes the publisher in the database
                   fcprofile.seek((data*480)+135); //seeks the position of book name
                   fcprofile.writeUTF(Fw4);// writes the book name in the database
                   fcprofile.seek((data*480)+140); //seeks the position of book name
                   fcprofile.writeUTF(Fw5);// writes the book name in the database
                   fcprofile.seek((data*480)+145); //seeks the position of book name
                   fcprofile.writeUTF(Fw6);// w5rites the book name in the database
                   fcprofile.seek((data*480)+150); //seeks the position of book name
                   fcprofile.writeUTF(Fw7);// wites the book name in the database
                   fcprofile.seek((data*480)+155); //seeks the position of book name
                   fcprofile.writeUTF(Fw8);// writes the book name in the database
                   fcprofile.seek((data*480)+160); //seeks the position of book name
                   fcprofile.writeUTF(Fw9);// writes the book name in the database
                   fcprofile.seek((data*480)+165); //seeks the position of book name
                   fcprofile.writeUTF(Fw10);// writes the book name in the database
                   fcprofile.seek((data*480)+170); //seeks the position of book name
                   fcprofile.writeUTF(Fw11);// writes the book name in the database
                   fcprofile.seek((data*480)+175); //seeks the position of book name
                   fcprofile.writeUTF(Fw12);// writes the book name in the database
                   fcprofile.seek((data*480)+180); //seeks the position of book name
                   fcprofile.writeUTF(Fw13);// rites the book name in the database
                   fcprofile.seek((data*480)+185); //seeks the position of book name
                   fcprofile.writeUTF(Fw14);// rites the book name in the database
                   fcprofile.seek((data*480)+190); //seeks the position of book name
                   fcprofile.writeUTF(Fw15);// writes the book name in the database
                   fcprofile.seek((data*480)+195); //seeks the position of book name
                   fcprofile.writeUTF(Fw16);//rites the book name in the database
                   fcprofile.seek((data*480)+200); //seeks the position of book name
                   fcprofile.writeUTF(Fw17);// writes the book name in the database
                   fcprofile.seek((data*480)+205); //seeks the position of book name
                   fcprofile.writeUTF(Fw18);// writes the book name in the database
                   
                                  
                   fcprofile.seek((data*480)+210); //seeks the position of book of the book id
                   fcprofile.writeUTF (Gr1);//writes the book id in the database
                   fcprofile.seek((data*480)+215); //seeks the position of the type
                   fcprofile.writeUTF(Gr2);//writes the type in the database
                   fcprofile.seek((data*480)+220); //seeks the position of the publisher
                   fcprofile.writeUTF(Gr3);//wites the publisher in the database
                   fcprofile.seek((data*480)+225); //seeks the position of book name
                   fcprofile.writeUTF(Gr4);// writes the book name in the database
                   fcprofile.seek((data*480)+230); //seeks the position of book name
                   fcprofile.writeUTF(Gr5);// wites the book name in the database
                   fcprofile.seek((data*480)+235); //seeks the position of book name
                   fcprofile.writeUTF(Gr6);// writes the book name in the database
                   fcprofile.seek((data*480)+240); //seeks the position of book name
                   fcprofile.writeUTF(Gr7);// writes the book name in the database
                   fcprofile.seek((data*480)+245); //seeks the position of book name
                   fcprofile.writeUTF(Gr8);// writes the book name in the database
                   fcprofile.seek((data*480)+250); //seeks the position of book name
                   fcprofile.writeUTF(Gr9);// wites the book name in the database
                   fcprofile.seek((data*480)+255); //seeks the position of book name
                   fcprofile.writeUTF(Gr10);// writes the book name in the database
                   fcprofile.seek((data*480)+260); //seeks the position of book name
                   fcprofile.writeUTF(Gr11);// writes the book name in the database
                   fcprofile.seek((data*480)+265); //seeks the position of book name
                   fcprofile.writeUTF(Gr12);// writes the book name in the database
                   fcprofile.seek((data*480)+270); //seeks the position of book name
                   fcprofile.writeUTF(Gr13);// writes the book name in the database
                   fcprofile.seek((data*480)+275); //seeks the position of book name
                   fcprofile.writeUTF(Gr14);// writes the book name in the database
                   fcprofile.seek((data*480)+280); //seeks the position of book name
                   fcprofile.writeUTF(Gr15);// rites the book name in the database
                   fcprofile.seek((data*480)+285); //seeks the position of book name
                   fcprofile.writeUTF(Gr16);// writes the book name in the database
                   fcprofile.seek((data*480)+290); //seeks the position of book name
                   fcprofile.writeUTF(Gr17);//writes the book name in the database
                   fcprofile.seek((data*480)+295); //seeks the position of book name
                   fcprofile.writeUTF(Gr18);// rites the book name in the database                  
                   
                   fcprofile.seek((data*480)+300); //seeks the position of book of the book id
                   fcprofile.writeUTF (Putt1);//writes the book id in the database
                   fcprofile.seek((data*480)+305); //seeks the position of the type
                   fcprofile.writeUTF(Putt2);//rites the type in the database
                   fcprofile.seek((data*480)+310); //seeks the position of the publisher
                   fcprofile.writeUTF(Putt3);//writes the publisher in the database
                   fcprofile.seek((data*480)+315); //seeks the position of book name
                   fcprofile.writeUTF(Putt4);// writes the book name in the database
                   fcprofile.seek((data*480)+320); //seeks the position of book name
                   fcprofile.writeUTF(Putt5);// writes the book name in the database
                   fcprofile.seek((data*480)+325); //seeks the position of book name
                   fcprofile.writeUTF(Putt6);// writes the book name in the database
                   fcprofile.seek((data*480)+330); //seeks the position of book name
                   fcprofile.writeUTF(Putt7);// writes the book name in the database
                   fcprofile.seek((data*480)+335); //seeks the position of book name
                   fcprofile.writeUTF(Putt8);// writes the book name in the database
                   fcprofile.seek((data*480)+340); //seeks the position of book name
                   fcprofile.writeUTF(Putt9);// writes the book name in the database
                   fcprofile.seek((data*480)+345); //seeks the position of book name
                   fcprofile.writeUTF(Putt10);// writes the book name in the database
                   fcprofile.seek((data*480)+350); //seeks the position of book name
                   fcprofile.writeUTF(Putt11);// writes the book name in the database
                   fcprofile.seek((data*480)+355); //seeks the position of book name
                   fcprofile.writeUTF(Putt12);// writes the book name in the database
                   fcprofile.seek((data*480)+360); //seeks the position of book name
                   fcprofile.writeUTF(Putt13);// writes the book name in the database
                   fcprofile.seek((data*480)+365); //seeks the position of book name
                   fcprofile.writeUTF(Putt14);// writes the book name in the database
                   fcprofile.seek((data*480)+370); //seeks the position of book name
                   fcprofile.writeUTF(Putt15);// writes the book name in the database
                   fcprofile.seek((data*480)+375); //seeks the position of book name
                   fcprofile.writeUTF(Putt16);// writes the book name in the database
                   fcprofile.seek((data*480)+380); //seeks the position of book name
                   fcprofile.writeUTF(Putt17);// writes the book name in the database
                   fcprofile.seek((data*480)+385); //seeks the position of book name
                   fcprofile.writeUTF(Putt18);// writes the book name in the database     
                  
                                      fcprofile.seek((data*480)+390); //seeks the position of book of the book id
                   fcprofile.writeUTF (Sand1);//writes the book id in the database
                   fcprofile.seek((data*480)+395); //seeks the position of the type
                   fcprofile.writeUTF(Sand2);//writes the type in the database
                   fcprofile.seek((data*480)+400); //seeks the position of the publisher
                   fcprofile.writeUTF(Sand3);//writes the publisher in the database
                   fcprofile.seek((data*480)+405); //seeks the position of book name
                   fcprofile.writeUTF(Sand4);// writes the book name in the database
                   fcprofile.seek((data*480)+410); //seeks the position of book name
                   fcprofile.writeUTF(Sand5);// writes the book name in the database
                   fcprofile.seek((data*480)+415); //seeks the position of book name
                   fcprofile.writeUTF(Sand6);// writes the book name in the database
                   fcprofile.seek((data*480)+420); //seeks the position of book name
                   fcprofile.writeUTF(Sand7);// writes the book name in the database
                   fcprofile.seek((data*480)+425); //seeks the position of book name
                   fcprofile.writeUTF(Sand8);// writes the book name in the database
                   fcprofile.seek((data*480)+430); //seeks the position of book name
                   fcprofile.writeUTF(Sand9);// writes the book name in the database
                   fcprofile.seek((data*480)+435); //seeks the position of book name
                   fcprofile.writeUTF(Sand10);// writes the book name in the database
                   fcprofile.seek((data*480)+440); //seeks the position of book name
                   fcprofile.writeUTF(Sand11);// writes the book name in the database
                   fcprofile.seek((data*480)+445); //seeks the position of book name
                   fcprofile.writeUTF(Sand12);// writes the book name in the database
                   fcprofile.seek((data*480)+450); //seeks the position of book name
                   fcprofile.writeUTF(Sand13);// writes the book name in the database
                   fcprofile.seek((data*480)+ 450); //seeks the position of book name
                   fcprofile.writeUTF(Sand14);// writes the book name in the database
                   fcprofile.seek((data*480)+460); //seeks the position of book name
                   fcprofile.writeUTF(Sand15);// writes the book name in the database
                   fcprofile.seek((data*480)+465); //seeks the position of book name
                   fcprofile.writeUTF(Sand16);//rites the book name in the database
                   fcprofile.seek((data*480)+470); //seeks the position of book name
                   fcprofile.writeUTF(Sand17);// writes the book name in the database
                   fcprofile.seek((data*480)+475); //seeks the position of book name
                   fcprofile.writeUTF(Sand18);// writes the book name in the database
                   
                   output("Club details have been added");
          
            fcprofile.close();
            this.dispose();
        }
        catch (IOException e)//handling the error
        {
            System.out.println("ERROR OCCURED WHILE TRYING TO SAVE CLUB DEGrILS");
        }
}

}



