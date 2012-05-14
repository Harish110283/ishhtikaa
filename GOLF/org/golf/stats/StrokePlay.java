package org.golf.stats;
import java.util.Scanner;
import java.io.*;
public class StrokePlay
{
public static void main()
{

int i,sum,j,z;
double max,g;
char s,x;
int t,player;
sum=0;
max=999999999;
z=0;
g=999999999;


System.out.print("Enter number of players :");
Scanner p = new Scanner(System.in);
player = p.nextInt();

System.out.print("Enter your 9 hole score:");
System.out.println("");
System.out.println("");

int testScore = 0;
for(j=1;j<=player;j++)
{
System.out.println("Player:"+j);
System.out.print("Enter your name: ");

Scanner name = new Scanner(System.in);
String line = name.nextLine();

for(i=1;i<=9;i++)
{
System.out.print("Please enter your score for"+" "+"hole"+" "+i+"=");
System.out.print("");

Scanner input = new Scanner(System.in);
testScore = input.nextInt();
sum=sum+testScore;
}


System.out.println("");
System.out.print("");
System.out.println("The total Score is:"+sum);
System.out.println("");

double net,gross;
double handicap = 0.0;
System.out.print("Please enter your handicap:");

Scanner input = new Scanner(System.in);
handicap = input.nextDouble();
 
gross=sum-35;
net=gross-(handicap/2);

System.out.println("");
System.out.print("");
System.out.println("The total Score is:"+sum);
System.out.println("The net handicap score is:"+net);
System.out.println("The gross handicap score is:"+ gross);
System.out.println("");
System.out.println("");

sum=sum*0;
if(net<max)
z=j;
max=net;

if(gross<g)
z=j;
g=gross;
int m;
}
System.out.println("Player:"+""+z+" has the winning net Score:"+max);
System.out.println("Player:"+""+z+" has the winning gross Score:"+g);
}
}


