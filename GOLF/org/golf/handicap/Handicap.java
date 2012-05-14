package org.golf.handicap;
import java.io.*;
import java.util.Scanner;
class Handicap
{
public static void main()
{

int i,number,j,x;
x=0;
double differntial,differentialw,max,hcap,hcap2,sum,sum2;
max=99999999;
sum=0;
sum2=0;
int counter=0;
double scr=0;
double temp=0;
double scr2=0;
double temp2=0;

double slopegold=120;
double slopeblue=114;
double slopewhite=110;
double slopered=110;

double ratinggold=70.1;
double ratingblue=68.1;
double ratingwhite=64.1;
double ratingred=64.1;

double [] diff= new double [2000];
double [] score=new double [2000];
double [] diffw=new double[2000];

System.out.println("Number of Differentials Used");
System.out.println("");
System.out.println("Rounds Entered	Differentials Used");
System.out.println("5-6	             1 lowest");
System.out.println("7-8	             2 lowest");
System.out.println("9-10	             3 lowest");
System.out.println("11-12	             4 lowest");
System.out.println("13-14	             5 lowest");
System.out.println("15-16	             6 lowest");
System.out.println("17	             7 lowest");
System.out.println("18	             8 lowest");
System.out.println("19	             9 lowest");
System.out.println("20	             10 lowest");

System.out.println("");
System.out.println("Enter the number of rounds to which you want to calculate your handicap:");
System.out.println("Between 5&20");

Scanner p=new Scanner(System.in);
number =p.nextInt();
System.out.println("");

System.out.println("Enter your last "+number+" scores over 18 holes");
System.out.println("");

for(i=0;i<number;i++)
{
System.out.print("Score "+(i+1)+":");
Scanner sc=new Scanner(System.in);
score[i]=sc.nextInt();

differntial=(score[i]-ratingblue)*(113/slopeblue);
differentialw=(score[i]-ratingwhite)*(113/slopewhite);

diffw[i]=differentialw;
diff[i]=differntial;
}

if(number==5){x=1;}
if(number==6){x=1;}
if(number==7){x=2;}
if(number==8){x=2;}
if(number==9){x=3;}
if(number==10){x=3;}
if(number==11){x=4;}
if(number==12){x=4;}
if(number==13){x=5;}
if(number==14){x=5;}
if(number==15){x=6;}
if(number==16){x=6;}
if(number==17){x=7;}
if(number==18){x=8;}
if(number==19){x=9;}
if(number==20){x=10;}

counter=0;
int counter2=0;

while(counter<number)
{
if(diff[counter]>diff[counter + 1] )
{
temp=diff[counter];
diff[counter]=diff[counter+1];
diff[counter+1]=temp;

scr=score[counter];
score[counter]=score[counter+1];
score[counter+1]=scr;
counter=0;
continue;
}
counter++;
}
System.out.println(" ");


while(counter2<=number)
{
if(diffw[counter2]>diffw[counter2 + 1] )
{
temp2=diffw[counter2];
diffw[counter2]=diffw[counter2+1];
diffw[counter2+1]=temp2;
counter2=0;
continue;
}
counter2++;
}



System.out.println("Top "+x+" differentials blue");
for(counter=0;counter<=x-1;++counter)
{
System.out.println("Differential " +(counter + 1)+ ":"+diff[counter]+" at scores:"+score[counter]);
sum=sum+diff[counter];
}
System.out.println(" ");
System.out.println("Sum of differentials:"+sum);
hcap=(sum*0.96)/x;
System.out.println("Your handicap for your last "+number+" scores are:"+hcap);
System.out.println("");


System.out.println("Top "+x+" differentials white");
for(counter=0;counter<=x-1;++counter)
{
System.out.println("Differential "+(counter+1)+":"+diffw[counter]+" at scores"+score[counter]);
sum2=sum2+diffw[counter];
}
hcap2=(sum2*0.96)/x;
System.out.println(" ");
System.out.println("Sum of differentials:"+sum2);
System.out.println("Your handicap for your last"+number+" scores are:"+hcap2);
System.out.println("");
}
}

