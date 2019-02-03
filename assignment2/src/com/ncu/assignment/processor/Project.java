package com.ncu.assignment.processor;


import java.util.*;
public class Project
{
String name;
Date startDate;
Date endDate;
String role;
String [] responsibilities;

Scanner scan=new Scanner(System.in);


Project()
{
this.name=null;
this.role=null;
}


Project(String n,String role)
{
this.name=name;
this.role=role;
}


void setStartDate (int d,int m, int y)
{
startDate=new Date(d,m,y);	
}

void setEndDate (int d,int m, int y)
{
 endDate=new Date(d,m,y);	
}

void responsiblities(String res)
{
System.out.println("  how many responsiblities does the student have ? enter number ");
int num=scan.nextInt();
System.out.println(" Enter responsiblities ");
for(int i=0;i<num;++i)
this.responsibilities[i]=res;
}
}
