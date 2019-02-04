package com.ncu.assignment.processor;


import java.util.*;
public class Project
{
public String name;
public DateEx startDate;
public DateEx endDate;
public String role;
public String [] responsibilities;

Scanner scan=new Scanner(System.in);


public Project()
{
this.name=null;
this.role=null;
}


public Project(String n,String role)
{
this.name=name;
this.role=role;
}


public void setStartDate (int d,int m, int y)
{
startDate=new DateEx(d,m,y);	
}

public void setEndDate (int d,int m, int y)
{
 endDate=new DateEx(d,m,y);	
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
