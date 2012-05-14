package org.golf.stats;
import java.util.Scanner;
import java.io.*;

class StableFord
{
public static void main()throws IOException
{


int i,z,q,l,j,hole,sum,sum2,x;
double m,max,g,stableford,handicap = 0.0;;
char s;
int t,player;
int testscore=0;
double []net = new double[2000];
double []gross = new double[2000];
double []stb=new double[2000];
sum2=0;
sum=0;
x=0;
max=999999999;
z=0;
q=0;
l=0;
g=999999999;
stableford=0;
m=0000;
int [] par={5,3,4,5,4,3,4,3,4,3,4,4,3,4,4,5,3,5};

System.out.print("Enter number of players :");
Scanner p = new Scanner(System.in);
player = p.nextInt();

System.out.println(" ");

System.out.print("Enter number of holes played:");
Scanner h=new Scanner(System.in);
hole=h.nextInt();

System.out.print("Enter your "+hole +" hole scores:");
System.out.println("");
System.out.println("");

String[] names= new String[20];
String[] names2= new String[20];
String[] names3= new String[20];
Scanner scan=new Scanner(System.in);


for(j=0;j<=(player-1);j++)
{
System.out.println("Player:"+(j+1));
System.out.print("Enter your name: ");
names[j]=scan.nextLine();
names2[j]=names[j];
names3[j]=names[j];

for(i=0;i<=(hole-1);i++)
{
System.out.print("Please enter your score for"+" "+"hole"+" "+(i+1)+"=");
System.out.print("");

Scanner input = new Scanner(System.in);
testscore = input.nextInt();

if(testscore-par[i]>1)
stableford=stableford+0;
if(testscore-par[i]==1)
stableford=stableford+1;
if(testscore-par[i]==0)
stableford=stableford+2;
if(testscore-par[i]==-1)
stableford=stableford+3;
if(testscore-par[i]==-2)
stableford=stableford+4;
if(testscore-par[i]==-3)
stableford=stableford+5;
if(testscore-par[i]==-4)
stableford=stableford+6;

stb[j]=stableford;
sum=sum+testscore;
sum2=sum2+par[i];
}

System.out.println("");


System.out.print("Please enter your handicap:");

Scanner input = new Scanner(System.in);
handicap = input.nextDouble();
 
gross[j]=sum-(sum2);
net[j]=gross[j]-(handicap*hole/18);
System.out.print("");
System.out.println("The gross score is:"+sum);
System.out.println("The net handicap score is:"+net[j]);
System.out.println("The adjusted gross score is:"+gross[j]);
System.out.println("The stableford points are:"+stb[j]);
System.out.println("");



if(net[j]<max)
{
max=net[j];
z=(j+1);
}
System.out.println("Player:"+ z +" "+ names[(z-1)]+" has the highest net Score:"+max+" so far");
if(gross[j]<g)
{
g=gross[j];
q=(j+1);
}
System.out.println("Player:"+ q +" "+ names[(q-1)]+" has the highest net gross Score:"+g+" overall gross score:"+(g+sum2)+" so far");
if(stb[j]>m)
{
m=stb[j];
l=(j+1);
}
System.out.println("Player:"+ l +" "+ names[l-1]+" has the highest stableford Points:"+m+" so far");
System.out.println("");

x=sum2;
stableford=stableford*0;
sum=sum*0;
sum2=sum2*0;
}

int counter=0;
int counter2=0;
int counter3=0;
int k=0;
String[] nme= new String[20];
double temp=0;
double grss=0;
double stbl=0;

while(counter<player-1)
{
if(net[counter]>net[counter + 1] )
{
temp=net[counter];
net[counter]=net[counter+1];
net[counter+1]=temp;

nme[counter]=names[counter];
names[counter]=names[counter+1];
names[counter+1]=nme[counter];
counter=0;
continue;
}
counter++;
}

while(counter2<player-1)
{
if(gross[counter2]>gross[counter2 + 1] )
{
grss=gross[counter2];
gross[counter2]=gross[counter2+1];
gross[counter2+1]=grss;

nme[counter2]=names2[counter2];
names2[counter2]=names2[counter2+1];
names2[counter2+1]=nme[counter2];
counter2=0;
continue;
}
counter2++;
}


while(counter3<player-1)
{
if(stb[counter3]<stb[counter3 + 1] )
{
stbl=stb[counter3];
stb[counter3]=stb[counter3+1];
stb[counter3+1]=stbl;

nme[counter3]=names[counter3];
names[counter3]=names[counter3+1];
names[counter3+1]=nme[counter3];
counter3=0;
continue;
}
counter3++;
}

System.out.println("Final Results");
System.out.println("");

System.out.println("Player:"+ z +" "+ names[z-1]+" has the winning net Score:"+max);
System.out.println("Player:"+ q +" "+ names[q-1]+" has the highest net gross Score:"+g+" has the winning adjusted gross Score:"+(g+x) );
System.out.println("Player:"+ l +" "+ names[l-1]+" has the winning stableford Points:"+m);
System.out.println("");


System.out.println("Net Scores");

for(k=0;k<=(player-1);k++)
{
System.out.println(names[k]+" has a net score of:"+net[k]);
}

System.out.println("");

System.out.println("Gross Scores");

for(counter2=0;counter2<=(player-1);counter2++)
{
System.out.println(names2[counter2]+" net gross:"+gross[counter2]);
}

System.out.println("");

System.out.println("Stableford Scores");
for(counter3=0;counter3<=player-1;counter3++)
{
System.out.println(names3[counter3]+" Stableford scores:"+stb[counter3]);
}
}
}
