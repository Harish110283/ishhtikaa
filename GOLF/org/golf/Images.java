package org.golf;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

class MyCanvas extends Canvas 
{
Image img;
 public MyCanvas(Image img)
 {
  this.img = img;
 }
 public void paint (Graphics g)
 {
  if (img != null)
  {
  g.drawImage(img, 200, 50, 200, 200, this);
  }
 }
 public void setImage (Image img)
 {
  this.img = img;
 }
 }
 
public class Images implements ActionListener, WindowListener 
{
Frame fr = new Frame ("Frame");
Label Label1 = new Label("Choose Picture:");

Button Button1 = new Button("Search");
Image Image1;
MyCanvas Canvas1;
FileDialog fd = new FileDialog(fr,"Open", FileDialog.LOAD);
 
void initialize ()
{ 
fr.setSize(500,400);
fr.setLocation(400,300);
fr.setBackground(Color.white);
fr.setLayout(new FlowLayout());
fr.add(Label1);
fr.add(Button1);
fr.addWindowListener(this);
Button1.addActionListener(this);
Canvas1 = new MyCanvas(null);
Canvas1.setSize(400,400);
fr.add(Canvas1);
fr.show();
}
void imageload () 
{
fd.show();
if(fd.getFile() == null)
{ 
Label1.setText("You have not chosen any image files yet");
}
else
{
String d = (fd.getDirectory() + fd.getFile());
Toolkit toolkit = Toolkit.getDefaultToolkit();
Image1 = toolkit.getImage(d);
Canvas1.setImage(Image1);
Canvas1.repaint();
} 
}
 
public void windowClosing(WindowEvent e)
{
// Use fr.hide(); for subsequent forms in multi form applications
System.exit(0); 
}
public void windowActivated(WindowEvent e)
{
}
public void windowClosed(WindowEvent e)
{
}
public void windowDeactivated(WindowEvent e)
{
}
public void windowDeiconified(WindowEvent e)
{
}
public void windowIconified(WindowEvent e)
{
}
public void windowOpened(WindowEvent e)
{
}
public void actionPerformed(ActionEvent event)
{
Button b = (Button)event.getSource();
if(b == Button1) 
{
imageload();
}
} 

    
public static void main(String args[])
{

Images a = new Images(); 
a.initialize();
} 
}
