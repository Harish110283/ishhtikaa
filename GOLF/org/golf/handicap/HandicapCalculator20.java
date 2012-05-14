package org.golf.handicap;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;

public class HandicapCalculator20 extends GolfCore
{
int autocode=0;


     Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    Label Date= addLabel("Date",350,100,50,20,this);
    TextField tfDate = addTextField(formattedDate,400,100,100,20,this);
    

Label Handicap = addLabel("Handicap for last 20 Scores",200,50,250,30,this);
Label Confirm= addLabel("Enter your last 20 scores to calculate handicap",20,100,300,20,this);


Label Score1= addLabel("Score 1",20,150,150,20,this);
Label Score2= addLabel("Score 2",20,170,150,20,this);
Label Score3= addLabel("Score 3",20,190,150,20,this);
Label Score4= addLabel("Score 4",20,210,150,20,this);
Label Score5= addLabel("Score 5",20,230,150,20,this);
Label Score6= addLabel("Score 6",20,250,150,20,this);
Label Score7= addLabel("Score 7",20,270,150,20,this);
Label Score8= addLabel("Score 8",20,290,150,20,this);
Label Score9= addLabel("Score 9",20,310,150,20,this);
Label Score10= addLabel("Score 10",20,330,150,20,this);
Label Score11= addLabel("Score 11",300,150,150,20,this);
Label Score12= addLabel("Score 12",300,170,150,20,this);
Label Score13= addLabel("Score 13",300,190,150,20,this);
Label Score14= addLabel("Score 14",300,210,150,20,this);
Label Score15= addLabel("Score 15",300,230,150,20,this);
Label Score16= addLabel("Score 16",300,250,150,20,this);
Label Score17= addLabel("Score 17",300,270,150,20,this);
Label Score18= addLabel("Score 18",300,290,150,20,this);
Label Score19= addLabel("Score 19",300,310,150,20,this);
Label Score20= addLabel("Score 20",300,330,150,20,this);


    TextField tfScore1 = addTextField("",170,150,55,20,this);
    TextField tfScore2 = addTextField("",170,170,55,20,this);
    TextField tfScore3 = addTextField("",170,190,55,20,this);
    TextField tfScore4 = addTextField("",170,210,55,20,this);
    TextField tfScore5 = addTextField("",170,230,55,20,this);
    TextField tfScore6 = addTextField("",170,250,55,20,this);
    TextField tfScore7 = addTextField("",170,270,55,20,this);
    TextField tfScore8 = addTextField("",170,290,55,20,this);
    TextField tfScore9 = addTextField("",170,310,55,20,this);
    TextField tfScore10 = addTextField("",170,330,55,20,this);
    TextField tfScore11 = addTextField("",450,150,55,20,this);
    TextField tfScore12 = addTextField("",450,170,55,20,this);
    TextField tfScore13 = addTextField("",450,190,55,20,this);
    TextField tfScore14 = addTextField("",450,210,55,20,this);
    TextField tfScore15 = addTextField("",450,230,55,20,this);
    TextField tfScore16 = addTextField("",450,250,55,20,this);
    TextField tfScore17 = addTextField("",450,270,55,20,this);
    TextField tfScore18 = addTextField("",450,290,55,20,this);
    TextField tfScore19 = addTextField("",450,310,55,20,this);
    TextField tfScore20 = addTextField("",450,330,55,20,this);

    
    Button bSave = addButton("SAVE",200,400,100,50,this);
    Button bCancel = addButton("CANCEL",330,400,100,50,this);
   
     public HandicapCalculator20()
    {
        
        setSize(650,500);
        setTitle("Handicap_Calculator_20");
    }
    
    Menu AddNewCdMenu = addMenu("Help|Back to Handicap|Quit");
    
    public void actions(Object source, String command)
    {
        if(source==bCancel)
        {this.dispose();}
 
}

}