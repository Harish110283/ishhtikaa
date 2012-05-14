package org.golf;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class CreateClub extends GolfCore
{
    int autocode=0;
    Label lTitle = addLabel("Create Club",350,50,250,30,this);
    Label StrokeIndex1 = addLabel("S.I=Stroke Index",600,400,250,20,this);
    
    Label Name = addLabel("Enter the name of the club",20,95,150,20,this);
    TextField tfName= addTextField("",190,95,100,20,this);
       
    Label Par= addLabel("Par",80,180,35,20,this);
    Label Par1= addLabel("Par",420,180,35,20,this);
    
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");// Keep the MM (month) upper case
    String formattedDate = df.format(date);
    Label Date= addLabel("Date",500,90,50,20,this);
    TextField tfDate = addTextField(formattedDate,550,90,100,20,this);
   
    
    Label lHole1 = addLabel("Hole 1",20,200,50,20,this);  
    Label lHole2 = addLabel("Hole 2",20,220,50,20,this); 
    Label lHole3 = addLabel("Hole 3",20,240,50,20,this);  
    Label lHole4 = addLabel("Hole 4",20,260,50,20,this);
    Label lHole5 = addLabel("Hole 5",20,280,50,20,this);
    Label lHole6 = addLabel("Hole 6",20,300,50,20,this);
    Label lHole7 = addLabel("Hole 7",20,320,50,20,this);
    Label lHole8 = addLabel("Hole 8",20,340,50,20,this);
    Label lHole9 = addLabel("Hole 9",20,360,50,20,this);
    Label lHole10 = addLabel("Hole 10",350,200,50,20,this);
    Label lHole11 = addLabel("Hole 11",350,220,50,20,this);
    Label lHole12 = addLabel("Hole 12",350,240,50,20,this);
    Label lHole13 = addLabel("Hole 13",350,260,50,20,this);
    Label lHole14 = addLabel("Hole 14",350,280,50,20,this);
    Label lHole15 = addLabel("Hole 15",350,300,50,20,this);
    Label lHole16 = addLabel("Hole 16",350,320,50,20,this);
    Label lHole17 = addLabel("Hole 17",350,340,50,20,this);
    Label lHole18 = addLabel("Hole 18",350,360,50,20,this);
        
    TextField tfHole1 = addTextField("",80,200,35,20,this);
    TextField tfHole2 = addTextField("",80,220,35,20,this);
    TextField tfHole3 = addTextField("",80,240,35,20,this);
    TextField tfHole4 = addTextField("",80,260,35,20,this);
    TextField tfHole5 = addTextField("",80,280,35,20,this);
    TextField tfHole6 = addTextField("",80,300,35,20,this);
    TextField tfHole7 = addTextField("",80,320,35,20,this);
    TextField tfHole8 = addTextField("",80,340,35,20,this);
    TextField tfHole9 = addTextField("",80,360,35,20,this);
    TextField tfHole10 = addTextField("",420,200,35,20,this);
    TextField tfHole11 = addTextField("",420,220,35,20,this);
    TextField tfHole12 = addTextField("",420,240,35,20,this);
    TextField tfHole13 = addTextField("",420,260,35,20,this);
    TextField tfHole14 = addTextField("",420,280,35,20,this);
    TextField tfHole15 = addTextField("",420,300,35,20,this);
    TextField tfHole16 = addTextField("",420,320,35,20,this);
    TextField tfHole17 = addTextField("",420,340,35,20,this);
    TextField tfHole18 = addTextField("",420,360,35,20,this);
    
    Label Stoke= addLabel("S.I",130,180,35,20,this);
    Label Stoke1= addLabel("S.I",470,180,35,20,this);
    
    TextField tfSI1 = addTextField("",130,200,35,20,this);
    TextField tfSI2 = addTextField("",130,220,35,20,this);
    TextField tfSI3 = addTextField("",130,240,35,20,this);
    TextField tfSI4 = addTextField("",130,260,35,20,this);
    TextField tfSI5 = addTextField("",130,280,35,20,this);
    TextField tfSI6 = addTextField("",130,300,35,20,this);
    TextField tfSI7 = addTextField("",130,320,35,20,this);
    TextField tfSI8 = addTextField("",130,340,35,20,this);
    TextField tfSI9 = addTextField("",130,360,35,20,this);
    TextField tfSI10 = addTextField("",470,200,35,20,this);
    TextField tfSI11 = addTextField("",470,220,35,20,this);
    TextField tfSI12 = addTextField("",470,240,35,20,this);
    TextField tfSI13 = addTextField("",470,260,35,20,this);
    TextField tfSI14 = addTextField("",470,280,35,20,this);
    TextField tfSI15 = addTextField("",470,300,35,20,this);
    TextField tfSI16 = addTextField("",470,320,35,20,this);
    TextField tfSI17 = addTextField("",470,340,35,20,this);
    TextField tfSI18 = addTextField("",470,360,35,20,this);
    
Label Tees= addLabel("Tees",240,160,35,20,this);
Label Tees1= addLabel("Tees",550,160,35,20,this);
        
  TextField tfTee1 = addTextField("",180,180,40,20,this);
  TextField tfTEE1 = addTextField("",520,180,40,20,this);
   
    TextField tfT1 = addTextField("",180,200,35,20,this);
    TextField tfT2 = addTextField("",180,220,35,20,this);
    TextField tfT3 = addTextField("",180,240,35,20,this);
    TextField tfT4 = addTextField("",180,260,35,20,this);
    TextField tfT5 = addTextField("",180,280,35,20,this);
    TextField tfT6 = addTextField("",180,300,35,20,this);
    TextField tfT7 = addTextField("",180,320,35,20,this);
    TextField tfT8 = addTextField("",180,340,35,20,this);
    TextField tfT9 = addTextField("",180,360,35,20,this);
    TextField tfT10 = addTextField("",520,200,35,20,this);
    TextField tfT11 = addTextField("",520,220,35,20,this);
    TextField tfT12 = addTextField("",520,240,35,20,this);
    TextField tfT13 = addTextField("",520,260,35,20,this);
    TextField tfT14 = addTextField("",520,280,35,20,this);
    TextField tfT15 = addTextField("",520,300,35,20,this);
    TextField tfT16 = addTextField("",520,320,35,20,this);
    TextField tfT17 = addTextField("",520,340,35,20,this);
    TextField tfT18 = addTextField("",520,360,35,20,this);
    
    
 TextField tfTee2 = addTextField("",220,180,40,20,this);
 TextField tfTEE2 = addTextField("",560,180,40,20,this);
    
    TextField tfTA1 = addTextField("",220,200,35,20,this);
    TextField tfTA2 = addTextField("",220,220,35,20,this);
    TextField tfTA3 = addTextField("",220,240,35,20,this);
    TextField tfTA4 = addTextField("",220,260,35,20,this);
    TextField tfTA5 = addTextField("",220,280,35,20,this);
    TextField tfTA6 = addTextField("",220,300,35,20,this);
    TextField tfTA7 = addTextField("",220,320,35,20,this);
    TextField tfTA8 = addTextField("",220,340,35,20,this);
    TextField tfTA9 = addTextField("",220,360,35,20,this);
    TextField tfTA10 = addTextField("",560,200,35,20,this);
    TextField tfTA11 = addTextField("",560,220,35,20,this);
    TextField tfTA12 = addTextField("",560,240,35,20,this);
    TextField tfTA13 = addTextField("",560,260,35,20,this);
    TextField tfTA14 = addTextField("",560,280,35,20,this);
    TextField tfTA15 = addTextField("",560,300,35,20,this);
    TextField tfTA16 = addTextField("",560,320,35,20,this);
    TextField tfTA17 = addTextField("",560,340,35,20,this);
    TextField tfTA18 = addTextField("",560,360,35,20,this);
    
    
 TextField tfTee3 = addTextField("",260,180,40,20,this);
 TextField tfTEE3 = addTextField("",600,180,40,20,this);
    
    TextField tfTB1 = addTextField("",260,200,35,20,this);
    TextField tfTB2 = addTextField("",260,220,35,20,this);
    TextField tfTB3 = addTextField("",260,240,35,20,this);
    TextField tfTB4 = addTextField("",260,260,35,20,this);
    TextField tfTB5 = addTextField("",260,280,35,20,this);
    TextField tfTB6 = addTextField("",260,300,35,20,this);
    TextField tfTB7 = addTextField("",260,320,35,20,this);
    TextField tfTB8 = addTextField("",260,340,35,20,this);
    TextField tfTB9 = addTextField("",260,360,35,20,this);
    TextField tfTB10 = addTextField("",600,200,35,20,this);
    TextField tfTB11 = addTextField("",600,220,35,20,this);
    TextField tfTB12 = addTextField("",600,240,35,20,this);
    TextField tfTB13 = addTextField("",600,260,35,20,this);
    TextField tfTB14 = addTextField("",600,280,35,20,this);
    TextField tfTB15 = addTextField("",600,300,35,20,this);
    TextField tfTB16 = addTextField("",600,320,35,20,this);
    TextField tfTB17 = addTextField("",600,340,35,20,this);
    TextField tfTB18 = addTextField("",600,360,35,20,this);
    
    
    
 TextField tfTee4 = addTextField("",300,180,40,20,this);
 TextField tfTEE4 = addTextField("",640,180,40,20,this);
    
    TextField tfTC1 = addTextField("",300,200,35,20,this);
    TextField tfTC2 = addTextField("",300,220,35,20,this);
    TextField tfTC3 = addTextField("",300,240,35,20,this);
    TextField tfTC4 = addTextField("",300,260,35,20,this);
    TextField tfTC5 = addTextField("",300,280,35,20,this);
    TextField tfTC6 = addTextField("",300,300,35,20,this);
    TextField tfTC7 = addTextField("",300,320,35,20,this);
    TextField tfTC8 = addTextField("",300,340,35,20,this);
    TextField tfTC9 = addTextField("",300,360,35,20,this);
    TextField tfTC10 = addTextField("",640,200,35,20,this);
    TextField tfTC11 = addTextField("",640,220,35,20,this);
    TextField tfTC12 = addTextField("",640,240,35,20,this);
    TextField tfTC13 = addTextField("",640,260,35,20,this);
    TextField tfTC14 = addTextField("",640,280,35,20,this);
    TextField tfTC15 = addTextField("",640,300,35,20,this);
    TextField tfTC16 = addTextField("",640,320,35,20,this);
    TextField tfTC17 = addTextField("",640,340,35,20,this);
    TextField tfTC18 = addTextField("",640,360,35,20,this);
        
   Label Course = addLabel("Enter Course rating:",20,405,150,20,this);
    TextField tfCourse= addTextField("",180,405,35,20,this);
    TextField tfCourse1= addTextField("",220,405,35,20,this);
    TextField tfCourse2= addTextField("",260,405,35,20,this);
    TextField tfCourse3= addTextField("",300,405,35,20,this);
    
    Label Slope = addLabel("Enter Slope rating:",20,435,150,20,this);
    TextField tfSlope= addTextField("",180,435,35,20,this);
    TextField tfSlope1= addTextField("",220,435,35,20,this);
    TextField tfSlope2= addTextField("",260,435,35,20,this);
    TextField tfSlope3= addTextField("",300,435,35,20,this);
    
    
    Button bSave = addButton("SAVE",300,500,100,50,this);
    Button bCancel = addButton("CANCEL",440,500,100,50,this);
     Menu AddNewCdMenu = addMenu("Help|Back to New Clubs|Quit");
     
   
         public CreateClub()
    {
        
        setSize(800,600);
        setTitle("Create Club");
       lTitle.setFont(new Font("Courier New",3,22));
    }
     
     public void actions(Object source, String command)
    {
        if(source==bCancel)
        {this.dispose();}
   if(source == bSave)
        {
            String Name = tfName.getText();
                        
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
            
            String SI1 = tfSI1.getText();
            String SI2 = tfSI2.getText();
            String SI3 = tfSI3.getText();
            String SI4 = tfSI4.getText();
            String SI5 = tfSI5.getText();
            String SI6 = tfSI6.getText();
            String SI7 = tfSI7.getText();
            String SI8 = tfSI8.getText();
            String SI9 = tfSI9.getText();
            String SI10 = tfSI10.getText();
            String SI11 = tfSI11.getText();
            String SI12 = tfSI12.getText();
            String SI13 = tfSI13.getText();
            String SI14 = tfSI14.getText();
            String SI15 = tfSI15.getText();
            String SI16 = tfSI16.getText();
            String SI17 = tfSI17.getText();
            String SI18 = tfSI18.getText();
            
            String Course=tfCourse.getText();
            String Course1=tfCourse1.getText();
            String Course2=tfCourse1.getText();
            String Course3=tfCourse1.getText();
            
            String Slope=tfSlope.getText();
            String Slope1=tfSlope1.getText();
            String Slope2=tfSlope2.getText();
            String Slope3=tfSlope3.getText();
            
            String Tee1 =tfTee1.getText();
            String Tee2 =tfTee2.getText();
            String Tee3 =tfTee3.getText();
            String Tee4 =tfTee4.getText();
            
            String TEE1 =tfTEE1.getText();
            String TEE2 =tfTEE2.getText();
            String TEE3 =tfTEE3.getText();
            String TEE4 =tfTEE4.getText();
            
    String T1 = tfT1.getText();
    String T2 = tfT2.getText();
    String T3 = tfT3.getText();
    String T4 = tfT4.getText();
    String T5 = tfT5.getText();
    String T6 = tfT6.getText();
    String T7 = tfT7.getText();
    String T8 = tfT8.getText();
    String T9 = tfT9.getText();
    String T10 = tfT10.getText();
    String T11 = tfT11.getText();
    String T12 = tfT12.getText();
    String T13 = tfT13.getText();
    String T14 = tfT14.getText();
    String T15 = tfT15.getText();
    String T16 = tfT16.getText();
    String T17 = tfT17.getText();
    String T18 = tfT18.getText();
    
    String TA1 = tfTA1.getText();
    String TA2 = tfTA2.getText();
    String TA3 = tfTA3.getText();
    String TA4 = tfTA4.getText();
    String TA5 = tfTA5.getText();
    String TA6 = tfTA6.getText();
    String TA7 = tfTA7.getText();
    String TA8 = tfTA8.getText();
    String TA9 = tfTA9.getText();
    String TA10 = tfTA10.getText();
    String TA11 = tfTA11.getText();
    String TA12 = tfTA12.getText();
    String TA13 = tfTA13.getText();
    String TA14 = tfTA14.getText();
    String TA15 = tfTA15.getText();
    String TA16 = tfTA16.getText();
    String TA17 = tfTA17.getText();
    String TA18 = tfTA18.getText();
    
    String TB1 = tfTB1.getText();
    String TB2 = tfTB2.getText();
    String TB3 = tfTB3.getText();
    String TB4 = tfTB4.getText();
    String TB5 = tfTB5.getText();
    String TB6 = tfTB6.getText();
    String TB7 = tfTB7.getText();
    String TB8 = tfTB8.getText();
    String TB9 = tfTB9.getText();
    String TB10 = tfTB10.getText();
    String TB11 = tfTB11.getText();
    String TB12 = tfTB12.getText();
    String TB13 = tfTB13.getText();
    String TB14 = tfTB14.getText();
    String TB15 = tfTB15.getText();
    String TB16 = tfTB16.getText();
    String TB17 = tfTB17.getText();
    String TB18 = tfTB18.getText();
    
    String TC1 = tfTC1.getText();
    String TC2 = tfTC2.getText();
    String TC3 = tfTC3.getText();
    String TC4 = tfTC4.getText();
    String TC5 = tfTC5.getText();
    String TC6 = tfTC6.getText();
    String TC7 = tfTC7.getText();
    String TC8 = tfTC8.getText();
    String TC9 = tfTC9.getText();
    String TC10 = tfTC10.getText();
    String TC11 = tfTC11.getText();
    String TC12 = tfTC12.getText();
    String TC13 = tfTC13.getText();
    String TC14 = tfTC14.getText();
    String TC15 = tfTC15.getText();
    String TC16 = tfTC16.getText();
    String TC17 = tfTC17.getText();
    String TC18 = tfTC18.getText();
    
            if(Name.length() > 0 && Course.length() > 0 && Course1.length() > 0 && Course2.length() > 0 && Course3.length() > 0 && Slope.length() > 0 && Slope1.length() > 0  && Slope2.length() > 0  && Slope3.length() > 0
            && Tee1.length() >0 && Tee2.length()  >0 && TEE1.length()  >0  && TEE2.length()  >0 
            && Hole1.length() > 0 && Hole2.length() > 0 && Hole3.length() > 0 && Hole4.length() > 0 && Hole5.length() > 0 && Hole6.length() > 0 && Hole7.length() > 0 && Hole8.length() > 0 && Hole9.length() > 0 && Hole10.length() > 0 && Hole11.length() > 0 && Hole12.length() > 0 && Hole13.length() > 0 && Hole14.length() > 0 && Hole15.length() > 0 && Hole16.length() > 0 && Hole17.length() > 0 && Hole18.length() > 0 
            && SI1.length() > 0 && SI2.length() > 0 && SI3.length() > 0 && SI4.length() > 0 && SI5.length() > 0 && SI6.length() > 0 && SI7.length() > 0 && SI8.length() > 0 && SI9.length() > 0 && SI10.length() > 0 && SI11.length() > 0 && SI12.length() > 0 && SI13.length() > 0 && SI14.length() > 0 && SI15.length() > 0 && SI16.length() > 0 && SI17.length() > 0 && SI18.length() > 0 )
      
            clubdetails(Name,
            Hole1,Hole2,Hole3,Hole4,Hole5,Hole6,Hole7,Hole8,Hole9,Hole10,Hole11,Hole12,Hole13,Hole14,Hole15,Hole16,Hole17,Hole18,
            SI1,SI2,SI3,SI4,SI5,SI6,SI7,SI8,SI9,SI10,SI11,SI12,SI13,SI14,SI15,SI16,SI17,SI18,
            
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
            TA1,TA2,TA3,TA4,TA5,TA6,TA7,TA8,TA9,TA10,TA11,TA12,TA13,TA14,TA15,TA16,TA17,TA18,
            TB1,TB2,TB3,TB4,TB5,TB6,TB7,TB8,TB9,TB10,TB11,TB12,TB13,TB14,TB15,TB16,TB17,TB18,
            TC1,TC2,TC3,TC4,TC5,TC6,TC7,TC8,TC9,TC10,TC11,TC12,TC13,TC14,TC15,TC16,TC17,TC18,
            Course,Course1,Course2,Course3,Slope,Slope1,Slope2,Slope3,Tee1,Tee2,Tee3,Tee4,TEE1,TEE2,TEE3,TEE4
            );
              else 
               output("ERROR: one or more feilds are empty please try again");
        }
}
public void clubdetails(String Hole1,String Hole2, String Hole3, String Hole4, String Hole5, String Hole6,String Hole7,String Hole8, String Hole9, String Hole10, String Hole11, String Hole12,String Hole13,String Hole14, String Hole15, String Hole16, String Hole17, String Hole18,
                        String Name,String Course, String Course1, String Course2, String Course3, String Slope, String Slope1, String Slope2, String Slope3,                      
                        String Tee1, String Tee2,String Tee3,String Tee4 , String TEE1, String TEE2, String TEE3, String TEE4,
                        
                        String SI1, String SI2, String SI3, String SI4, String SI5, String SI6, String SI7, String SI8, String SI9, String SI10, String SI11, String SI12, String SI13, String SI14, String SI15, String SI16, String SI17, String SI18,
                        String T1, String T2, String T3, String T4, String T5, String T6, String T7, String T8, String T9, String T10, String T11, String T12, String T13, String T14, String T15, String T16, String T17, String T18,
                        String TA1, String TA2, String TA3, String TA4, String TA5, String TA6, String TA7, String TA8, String TA9, String TA10, String TA11, String TA12, String TA13, String TA14, String TA15, String TA16, String TA17, String TA18,
                        String TB1, String TB2, String TB3, String TB4, String TB5, String TB6, String TB7, String TB8, String TB9, String TB10, String TB11, String TB12, String TB13, String TB14, String TB15, String TB16, String TB17, String TB18,
                        String TC1, String TC2, String TC3, String TC4, String TC5, String TC6, String TC7, String TC8, String TC9, String TC10, String TC11, String TC12, String TC13, String TC14, String TC15, String TC16, String TC17, String TC18
                        )
{
    /*
     * This saves a database of all the members in the  Golf Club 
     * There could be more than 600-700 members in the Golf Club
     * Parameters:
     * Each member detail has the following fields in their record:
     
     * Name       - 50 bytes
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
       
       SI1      - 5 bytes
       SI2      - 5 bytes
       SI3      - 5 bytes
       SI4      - 5 bytes
       SI5      - 5 bytes
       SI6      - 5 bytes
       SI7      - 5 bytes
       SI8      - 5 bytes
       SI9      - 5 bytes
       SI10      - 5 bytes
       SI11      - 5 bytes
       SI12      - 5 bytes
       SI13      - 5 bytes
       SI14      - 5 bytes
       SI15      - 5 bytes
       SI16      - 5 bytes
       SI17      - 5 bytes
       SI18      - 5 bytes
       
       T1      - 5 bytes
       T2      - 5 bytes
       T3      - 5 bytes
       T4      - 5 bytes
       T5      - 5 bytes
       T6      - 5 bytes
       T7      - 5 bytes
       T8      - 5 bytes
       T9      - 5 bytes
       T10      - 5 bytes
       T11      - 5 bytes
       T12      - 5 bytes
       T13      - 5 bytes
       T14      - 5 bytes
       T15      - 5 bytes
       T16      - 5 bytes
       T17      - 5 bytes
       T18      - 5 bytes
       
       TA1      - 5 bytes
       TA2      - 5 bytes
       TA3      - 5 bytes
       TA4      - 5 bytes
       TA5      - 5 byes
       TA6      - 5 bytes
       TA7      - 5 bytes
       TA8      - 5 bytes
       TA9      - 5 bytes
       TA10      - 5 bytes
       TA11      - 5 bytes
       TA12      - 5 bytes
       TA13      - 5 bytes
       TA14      - 5 bytes
       TA15      - 5 bytes
       TA16      - 5 bytes
       TA17      - 5 bytes
       TA18      - 5 bytes
       
       TB1      - 5 bytes
       TB2      - 5 bytes
       TB3      - 5 bytes
       TB4      - 5 bytes
       TB5      - 5 bytes
       TB6      - 5 bytes
       TB7      - 5 bytes
       TB8      - 5 bytes
       TB9      - 5 bytes
       TB10      - 5 bytes
       TB11      - 5 bytes
       TB12      - 5 bytes
       TB13      - 5 bytes
       TB14      - 5 bytes
       TB15      - 5 bytes
       TB16      - 5 bytes
       TB17      - 5 bytes
       TB18      - 5 bytes
       
       
       TC1      - 5 bytes
       TC2      - 5 bytes
       TC3      - 5 bytes
       TC4      - 5 bytes
       TC5      - 5 bytes
       TC6      - 5 bytes
       TC7      - 5 bytes
       TC8      - 5 bytes
       TC9      - 5 bytes
       TC10      - 5 bytes
       TC11      - 5 bytes
       TC12      - 5 bytes
       TC13      - 5 bytes
       TC14      - 5 bytes
       TC15      - 5 bytes
       TC16      - 5 bytes
       TC17      - 5 bytes
       TC18      - 5 bytes
       
       
       Course - 5 bytes
       Course1 - 5 bytes
       Course2 - 5 bytes
       Course3 - 5 bytes
       
       Slope  - 5 bytes
       Slope1  - 5 bytes
       Slope2  - 5 bytes
       Slope3  - 5 bytes
       
       Tee1 - 5 bytes
       Tee2 - 5 bytes
       Tee3 - 5 bytes
       Tee4 - 5 bytes
      
       TEE1 - 5 bytes
       TEE2 - 5 bytes
       TEE3 - 5 bytes
       TEE4 - 5 bytes
       
     * Therefore, one member has 670 bytes space required. If there are around 700 
     * members in one club, the random access file will need to be around 469000 bytes.

     * Before: There is a random access file, main program has decided that this is not a duplicate
     * After: There is a random access file with a new tournament details database
     * Pseudocode:
     * seek to the end of file
     * write in data - save tournamnet
     * *////
 try
        {
           RandomAccessFile clubdetails = new RandomAccessFile("clubdetails.dat","rw");
           long data = (clubdetails.length()+669)/670;
           long filelength = clubdetails.length();
           
         
                   clubdetails.seek(data*670); //seeks the position of book name
                   clubdetails.writeUTF(Name);// writes the book name in the database
                   
                   clubdetails.seek((data*670)+50); //seeks the position of author name
                   clubdetails.writeUTF(Slope1);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+55); //seeks the position of author name
                   clubdetails.writeUTF(Slope2);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+60); //seeks the position of author name
                   clubdetails.writeUTF(Slope3);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+65); //seeks the position of author name
                   clubdetails.writeUTF(Course);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+70); //seeks the position of author name
                   clubdetails.writeUTF(Course1);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+75); //seeks the position of author name
                   clubdetails.writeUTF(Course2);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+80); //seeks the position of author name
                   clubdetails.writeUTF(Course3);//writes the author name in the database
                   
                   clubdetails.seek((data*670)+85); //seeks the position of author name                
                   clubdetails.writeUTF (Hole1);//writes the book id in the database
                   clubdetails.seek((data*670)+90); //seeks the position of the type
                   clubdetails.writeUTF(Hole2);//writes the type in the database
                   clubdetails.seek((data*270)+95); //seeks the position of the publisher
                   clubdetails.writeUTF(Hole3);//writes the publisher in the database
                   clubdetails.seek((data*670)+100); //seeks the position of book name
                   clubdetails.writeUTF(Hole4);// writes the book name in the database
                   clubdetails.seek((data*670)+105); //seeks the position of book name
                   clubdetails.writeUTF(Hole5);// writes the book name in the database
                   clubdetails.seek((data*670)+110); //seeks the position of book name
                   clubdetails.writeUTF(Hole6);// writes the book name in the database
                   clubdetails.seek((data*670)+115); //seeks the position of book name
                   clubdetails.writeUTF(Hole7);// writes the book name in the database
                   clubdetails.seek((data*670)+120); //seeks the position of book name
                   clubdetails.writeUTF(Hole8);// writes the book name in the database
                   clubdetails.seek((data*670)+125); //seeks the position of book name
                   clubdetails.writeUTF(Hole9);// writes the book name in the database
                   clubdetails.seek((data*670)+130); //seeks the position of book name
                   clubdetails.writeUTF(Hole10);// writes the book name in the database
                   clubdetails.seek((data*670)+135); //seeks the position of book name
                   clubdetails.writeUTF(Hole11);// writes the book name in the database
                   clubdetails.seek((data*670)+140); //seeks the position of book name
                   clubdetails.writeUTF(Hole12);// writes the book name in the database
                   clubdetails.seek((data*670)+145); //seeks the position of book name
                   clubdetails.writeUTF(Hole13);// writes the book name in the database
                   clubdetails.seek((data*670)+150); //seeks the position of book name
                   clubdetails.writeUTF(Hole14);// writes the book name in the database
                   clubdetails.seek((data*670)+155); //seeks the position of book name
                   clubdetails.writeUTF(Hole15);// writes the book name in the database
                   clubdetails.seek((data*670)+160); //seeks the position of book name
                   clubdetails.writeUTF(Hole16);// writes the book name in the database
                   clubdetails.seek((data*670)+165); //seeks the position of book name
                   clubdetails.writeUTF(Hole17);// writes the book name in the database
                   clubdetails.seek((data*670)+170); //seeks the position of book name
                   clubdetails.writeUTF(Hole18);// writes the book name in the database
                   clubdetails.seek((data*670)+175); //seeks the position of book name

                   clubdetails.seek((data*670)+180); //seeks the position of book of the book id
                   clubdetails.writeUTF (SI1);//writes the book id in the database
                   clubdetails.seek((data*670)+185); //seeks the position of the type
                   clubdetails.writeUTF(SI2);//writes the type in the database
                   clubdetails.seek((data*670)+190); //seeks the position of the publisher
                   clubdetails.writeUTF(SI3);//writes the publisher in the database
                   clubdetails.seek((data*670)+195); //seeks the position of book name
                   clubdetails.writeUTF(SI4);// writes the book name in the database
                   clubdetails.seek((data*670)+200); //seeks the position of book name
                   clubdetails.writeUTF(SI5);// writes the book name in the database
                   clubdetails.seek((data*670)+205); //seeks the position of book name
                   clubdetails.writeUTF(SI6);// writes the book name in the database
                   clubdetails.seek((data*670)+210); //seeks the position of book name
                   clubdetails.writeUTF(SI7);// writes the book name in the database
                   clubdetails.seek((data*670)+215); //seeks the position of book name
                   clubdetails.writeUTF(SI8);// writes the book name in the database
                   clubdetails.seek((data*670)+220); //seeks the position of book name
                   clubdetails.writeUTF(SI9);// writes the book name in the database
                   clubdetails.seek((data*670)+225); //seeks the position of book name
                   clubdetails.writeUTF(SI10);// writes the book name in the database
                   clubdetails.seek((data*670)+230); //seeks the position of book name
                   clubdetails.writeUTF(SI11);// writes the book name in the database
                   clubdetails.seek((data*670)+235); //seeks the position of book name
                   clubdetails.writeUTF(SI12);// writes the book name in the database
                   clubdetails.seek((data*670)+240); //seeks the position of book name
                   clubdetails.writeUTF(SI13);// writes the book name in the database
                   clubdetails.seek((data*670)+245); //seeks the position of book name
                   clubdetails.writeUTF(SI14);// writes the book name in the database
                   clubdetails.seek((data*670)+250); //seeks the position of book name
                   clubdetails.writeUTF(SI15);// writes the book name in the database
                   clubdetails.seek((data*670)+255); //seeks the position of book name
                   clubdetails.writeUTF(SI16);// writes the book name in the database
                   clubdetails.seek((data*670)+260); //seeks the position of book name
                   clubdetails.writeUTF(SI17);// writes the book name in the database
                   clubdetails.seek((data*670)+265); //seeks the position of book name
                   clubdetails.writeUTF(SI18);// writes the book name in the database
                   
                   clubdetails.seek((data*670)+270); //seeks the position of book name
                   clubdetails.writeUTF(Tee1);// writes the book name in the database
                   clubdetails.seek((data*670)+275); //seeks the position of book name
                   clubdetails.writeUTF(Tee2);// writes the book name in the database
                   clubdetails.seek((data*670)+280); //seeks the position of book name
                   clubdetails.writeUTF(Tee3);// writes the book name in the database
                   clubdetails.seek((data*670)+285); //seeks the position of book name
                   clubdetails.writeUTF(Tee4);// writes the book name in the database
                   clubdetails.seek((data*670)+670); //seeks the position of book name
                   clubdetails.writeUTF(TEE1);// writes the book name in the database
                   clubdetails.seek((data*670)+295); //seeks the position of book name
                   clubdetails.writeUTF(TEE2);// writes the book name in the database
                   clubdetails.seek((data*670)+300); //seeks the position of book name
                   clubdetails.writeUTF(TEE3);// writes the book name in the database
                   clubdetails.seek((data*670)+305); //seeks the position of book name
                   clubdetails.writeUTF(TEE4);// writes the book name in the database
                   
                   clubdetails.seek((data*670)+310); //seeks the position of book of the book id
                   clubdetails.writeUTF (T1);//writes the book id in the database
                   clubdetails.seek((data*670)+315); //seeks the position of the type
                   clubdetails.writeUTF(T2);//writes the type in the database
                   clubdetails.seek((data*670)+320); //seeks the position of the publisher
                   clubdetails.writeUTF(T3);//writes the publisher in the database
                   clubdetails.seek((data*670)+325); //seeks the position of book name
                   clubdetails.writeUTF(T4);// writes the book name in the database
                   clubdetails.seek((data*670)+330); //seeks the position of book name
                   clubdetails.writeUTF(T5);// writes the book name in the database
                   clubdetails.seek((data*670)+335); //seeks the position of book name
                   clubdetails.writeUTF(T6);// writes the book name in the database
                   clubdetails.seek((data*670)+340); //seeks the position of book name
                   clubdetails.writeUTF(T7);// writes the book name in the database
                   clubdetails.seek((data*670)+345); //seeks the position of book name
                   clubdetails.writeUTF(T8);// writes the book name in the database
                   clubdetails.seek((data*670)+350); //seeks the position of book name
                   clubdetails.writeUTF(T9);// writes the book name in the database
                   clubdetails.seek((data*670)+355); //seeks the position of book name
                   clubdetails.writeUTF(T10);// writes the book name in the database
                   clubdetails.seek((data*670)+360); //seeks the position of book name
                   clubdetails.writeUTF(T11);// writes the book name in the database
                   clubdetails.seek((data*670)+365); //seeks the position of book name
                   clubdetails.writeUTF(T12);// writes the book name in the database
                   clubdetails.seek((data*670)+370); //seeks the position of book name
                   clubdetails.writeUTF(T13);// writes the book name in the database
                   clubdetails.seek((data*670)+375); //seeks the position of book name
                   clubdetails.writeUTF(T14);// writes the book name in the database
                   clubdetails.seek((data*670)+380); //seeks the position of book name
                   clubdetails.writeUTF(T15);// writes the book name in the database
                   clubdetails.seek((data*670)+385); //seeks the position of book name
                   clubdetails.writeUTF(T16);// writes the book name in the database
                   clubdetails.seek((data*670)+390); //seeks the position of book name
                   clubdetails.writeUTF(T17);// writes the book name in the database
                   clubdetails.seek((data*670)+395); //seeks the position of book name
                   clubdetails.writeUTF(T18);// writes the book name in the database
                   
                   clubdetails.seek((data*670)+400); //seeks the position of book of the book id
                   clubdetails.writeUTF (TA1);//writes the book id in the database
                   clubdetails.seek((data*670)+405); //seeks the position of the type
                   clubdetails.writeUTF(TA2);//writes the type in the database
                   clubdetails.seek((data*670)+410); //seeks the position of the publisher
                   clubdetails.writeUTF(TA3);//wites the publisher in the database
                   clubdetails.seek((data*670)+415); //seeks the position of book name
                   clubdetails.writeUTF(TA4);// writes the book name in the database
                   clubdetails.seek((data*670)+420); //seeks the position of book name
                   clubdetails.writeUTF(TA5);// writes the book name in the database
                   clubdetails.seek((data*670)+425); //seeks the position of book name
                   clubdetails.writeUTF(TA6);// writes the book name in the database
                   clubdetails.seek((data*670)+430); //seeks the position of book name
                   clubdetails.writeUTF(TA7);// writes the book name in the database
                   clubdetails.seek((data*670)+435); //seeks the position of book name
                   clubdetails.writeUTF(TA8);// writes the book name in the database
                   clubdetails.seek((data*670)+440); //seeks the position of book name
                   clubdetails.writeUTF(TA9);// writes the book name in the database
                   clubdetails.seek((data*670)+445); //seeks the position of book name
                   clubdetails.writeUTF(TA10);// writes the book name in the database
                   clubdetails.seek((data*670)+450); //seeks the position of book name
                   clubdetails.writeUTF(TA11);// writes the book name in the database
                   clubdetails.seek((data*670)+455); //seeks the position of book name
                   clubdetails.writeUTF(TA12);// writes the book name in the database
                   clubdetails.seek((data*670)+460); //seeks the position of book name
                   clubdetails.writeUTF(TA13);// writes the book name in the database
                   clubdetails.seek((data*670)+465); //seeks the position of book name
                   clubdetails.writeUTF(TA14);// writes the book name in the database
                   clubdetails.seek((data*670)+470); //seeks the position of book name
                   clubdetails.writeUTF(TA15);// writes the book name in the database
                   clubdetails.seek((data*670)+475); //seeks the position of book name
                   clubdetails.writeUTF(TA16);// writes the book name in the database
                   clubdetails.seek((data*670)+480); //seeks the position of book name
                   clubdetails.writeUTF(TA17);//writes the book name in the database
                   clubdetails.seek((data*670)+485); //seeks the position of book name
                   clubdetails.writeUTF(TA18);// writes the book name in the database                  
                   
                   clubdetails.seek((data*670)+490); //seeks the position of book of the book id
                   clubdetails.writeUTF (TB1);//writes the book id in the database
                   clubdetails.seek((data*670)+495); //seeks the position of the type
                   clubdetails.writeUTF(TB2);//writes the type in the database
                   clubdetails.seek((data*670)+500); //seeks the position of the publisher
                   clubdetails.writeUTF(TB3);//writes the publisher in the database
                   clubdetails.seek((data*670)+505); //seeks the position of book name
                   clubdetails.writeUTF(TB4);// writes the book name in the database
                   clubdetails.seek((data*670)+510); //seeks the position of book name
                   clubdetails.writeUTF(TB5);// writes the book name in the database
                   clubdetails.seek((data*670)+515); //seeks the position of book name
                   clubdetails.writeUTF(TB6);// writes the book name in the database
                   clubdetails.seek((data*670)+520); //seeks the position of book name
                   clubdetails.writeUTF(TB7);// writes the book name in the database
                   clubdetails.seek((data*670)+525); //seeks the position of book name
                   clubdetails.writeUTF(TB8);// writes the book name in the database
                   clubdetails.seek((data*670)+530); //seeks the position of book name
                   clubdetails.writeUTF(TB9);// writes the book name in the database
                   clubdetails.seek((data*670)+535); //seeks the position of book name
                   clubdetails.writeUTF(TB10);// writes the book name in the database
                   clubdetails.seek((data*670)+540); //seeks the position of book name
                   clubdetails.writeUTF(TB11);// writes the book name in the database
                   clubdetails.seek((data*670)+545); //seeks the position of book name
                   clubdetails.writeUTF(TB12);// writes the book name in the database
                   clubdetails.seek((data*670)+550); //seeks the position of book name
                   clubdetails.writeUTF(TB13);// writes the book name in the database
                   clubdetails.seek((data*670)+555); //seeks the position of book name
                   clubdetails.writeUTF(TB14);// writes the book name in the database
                   clubdetails.seek((data*670)+560); //seeks the position of book name
                   clubdetails.writeUTF(TB15);// writes the book name in the database
                   clubdetails.seek((data*670)+565); //seeks the position of book name
                   clubdetails.writeUTF(TB16);// writes the book name in the database
                   clubdetails.seek((data*670)+570); //seeks the position of book name
                   clubdetails.writeUTF(TB17);// writes the book name in the database
                   clubdetails.seek((data*670)+575); //seeks the position of book name
                   clubdetails.writeUTF(TB18);// writes the book name in the database     
                  
                                      clubdetails.seek((data*670)+580); //seeks the position of book of the book id
                   clubdetails.writeUTF (TC1);//writes the book id in the database
                   clubdetails.seek((data*670)+585); //seeks the position of the type
                   clubdetails.writeUTF(TC2);//writes the type in the database
                   clubdetails.seek((data*670)+590); //seeks the position of the publisher
                   clubdetails.writeUTF(TC3);//writes the publisher in the database
                   clubdetails.seek((data*670)+595); //seeks the position of book name
                   clubdetails.writeUTF(TC4);// writes the book name in the database
                   clubdetails.seek((data*670)+600); //seeks the position of book name
                   clubdetails.writeUTF(TC5);// writes the book name in the database
                   clubdetails.seek((data*670)+605); //seeks the position of book name
                   clubdetails.writeUTF(TC6);// writes the book name in the database
                   clubdetails.seek((data*670)+610); //seeks the position of book name
                   clubdetails.writeUTF(TC7);// writes the book name in the database
                   clubdetails.seek((data*670)+615); //seeks the position of book name
                   clubdetails.writeUTF(TC8);// writes the book name in the database
                   clubdetails.seek((data*670)+620); //seeks the position of book name
                   clubdetails.writeUTF(TC9);// writes the book name in the database
                   clubdetails.seek((data*670)+625); //seeks the position of book name
                   clubdetails.writeUTF(TC10);// writes the book name in the database
                   clubdetails.seek((data*670)+630); //seeks the position of book name
                   clubdetails.writeUTF(TC11);// writes the book name in the database
                   clubdetails.seek((data*670)+635); //seeks the position of book name
                   clubdetails.writeUTF(TC12);// writes the book name in the database
                   clubdetails.seek((data*670)+640); //seeks the position of book name
                   clubdetails.writeUTF(TC13);// writes the book name in the database
                   clubdetails.seek((data*670)+ 645); //seeks the position of book name
                   clubdetails.writeUTF(TC14);// writes the book name in the database
                   clubdetails.seek((data*670)+650); //seeks the position of book name
                   clubdetails.writeUTF(TC15);// writes the book name in the database
                   clubdetails.seek((data*670)+655); //seeks the position of book name
                   clubdetails.writeUTF(TC16);//rites the book name in the database
                   clubdetails.seek((data*670)+660); //seeks the position of book name
                   clubdetails.writeUTF(TC17);// writes the book name in the database
                   clubdetails.seek((data*670)+665); //seeks the position of book name
                   clubdetails.writeUTF(TC18);// writes the book name in the database
                   
                   output("Club details have been added");
          
            clubdetails.close();
            this.dispose();
        }
        catch (IOException e)//handling the error
        {
            System.out.println("ERROR OCCURED WHILE TRYING TO SAVE CLUB DETAILS");
        }
    }

}