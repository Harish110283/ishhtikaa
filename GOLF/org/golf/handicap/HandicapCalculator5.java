package org.golf.handicap;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.golf.GolfCore;

public class HandicapCalculator5 extends GolfCore
{
int autocode=0;

    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    Label Date= addLabel("Date",350,100,50,20,this);
    TextField tfDate = addTextField(formattedDate,400,100,100,20,this);

Label Handicap = addLabel("Handicap for last 5 Scores",200,50,250,30,this);
Label Confirm= addLabel("Enter your last 5 scores to calculate handicap",20,100,300,20,this);


Label Score1= addLabel("Score 1",20,150,150,20,this);
Label Score2= addLabel("Score 2",20,170,150,20,this);
Label Score3= addLabel("Score 3",20,190,150,20,this);
Label Score4= addLabel("Score 4",20,210,150,20,this);
Label Score5= addLabel("Score 5",20,230,150,20,this);

    TextField tfScore1 = addTextField("",170,150,55,20,this);
    TextField tfScore2 = addTextField("",170,170,55,20,this);
    TextField tfScore3 = addTextField("",170,190,55,20,this);
    TextField tfScore4 = addTextField("",170,210,55,20,this);
    TextField tfScore5 = addTextField("",170,230,55,20,this);
   
    Button bSave = addButton("SAVE",200,280,100,50,this);
    Button bCancel = addButton("CANCEL",330,280,100,50,this);
   
    Menu AddNewCdMenu = addMenu("Help|Back to Handicap|Quit");
    
    public void actions(Object source, String command)
    {
 
}

}