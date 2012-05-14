package org.golf.maintenance;
import java.util.Scanner;
import java.io.*;

class SearchMember
{
public static void main()throws IOException 
{
int i,score;
int others=0;
int dbogey=0;
int bogey=0;
int par=0;
int eagle=0;
int birdie=0;
int albatross=0;
int [] parr={5,3,4,5,4,3,4,3,4,3,4,4,3,4,4,5,3,5};

double []bog = new double[200];
double []dbog = new double[200];
double []p=new double[200];
double []brd = new double[200];
double []egl = new double[200];
double []alb=new double[200];
double []oth=new double[200];
double []hole=new double[200];

System.out.println("Enter your 9 hole scores:");
System.out.println("");


for(i=0;i<=8;i++)
{
System.out.print("Please enter your score for"+" "+"hole"+" "+(i+1)+"=");
System.out.print("");

Scanner input = new Scanner(System.in);
score = input.nextInt();

hole[i]=i;

if(score-parr[i]>2)
others=others+1;
if(score-parr[i]==2)
dbogey=dbogey+1;
if(score-parr[i]==1)
bogey=bogey+1;
if(score-parr[i]==0)
par=par+1;
if(score-parr[i]==-1)
birdie=birdie+1;
if(score-parr[i]==-2)
eagle=eagle+1;
if(score-parr[i]==-3)
albatross=albatross+1;

dbog[i]=dbogey;
bog[i]=bogey;
oth[i]=others;
p[i]=par;
egl[i]=eagle;
brd[i]=birdie;
alb[i]=albatross;

}
System.out.println("");
System.out.println("");

System.out.println("You Scored:");
System.out.println("");
System.out.println("Double Bogey:"+dbogey);
System.out.println("Bogey:"+bogey);
System.out.println("Par:"+par);
System.out.println("Birdie:"+birdie);
System.out.println("Eagle:"+eagle);
System.out.println("Albatross:"+albatross);
System.out.println("Others:"+others);

}
}