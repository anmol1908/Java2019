package com.ncu.assignment.processor;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.exception.*;

public class Student
{
public String firstName;
public String lastName;
public Address addr;
public DateEx dob;
public String [] skills;
public Qualification[] qual;
public Project [] projects;
public String eMail;
public String contactNo;


public Student()
{
	this.firstName=null;
	this.lastName=null;
	this.eMail=null;
	this.contactNo=null;
}
public Student( String f,String l,String e,String c)
{
	this.firstName=f;
	this.lastName=l;
	this.eMail=e;
	this.contactNo=c;
}
void getAddress(String l1,String l2,String c,String s,int p)
{
	addr=new Address(l1,l2,c,s,p);
}
void getDOB(int d,int m,int y)
{
	dob=new DateEx(d,m,y);
}


public void display()
	{
	try
	{
		try
		{
			if(firstName==null||lastName==null||eMail==null||contactNo==null||addr==null)
			{
			throw new MandatoryMissingException(StudentValidationMessage.Mandatory);
			}
		        else
			{
	System.out.println("Name of Student: " +firstName+ " " +lastName);
	System.out.println("\n\nDOBof student is "+dob.day+"/"+dob.month+"/"+dob.year);		
	System.out.println("\n\nAddress of student: "+addr.line1+", "+addr.line2+"\nCity:"+addr.city+" , "+addr.pinCode+"\nstate: "+addr.state);
	System.out.println("\n\nE-Mail Address: " +eMail);
	System.out.println("\n\nContact Number: "+contactNo);

	System.out.println("\n\n Qualifications: ");
	for (int n=0;n<qual.length;n++)
        {
      System.out.println((n+1)+". "+qual[n].qualName+" institute  "+qual[n].institute+"\n university  "+qual[n].university+"\n  CGPA- "+qual[n].cgpa );
        }

	System.out.println("\n\nSkills:");
	for (int i=0;i<skills.length;i++)
	System.out.println((i+1)+"  "+skills[i]);

	System.out.println("\n\nProjects:");
	for (int i=0;i<projects.length;i++)
	{
	System.out.println((i+1)+" "+projects[i].name);
	System.out.println("Started on: "+projects[i].startDate.day+"/"+projects[i].startDate.month+"/"+projects[i].startDate.year);
	System.out.println("Ended on: "+projects[i].endDate.day+"/"+projects[i].endDate.month+"/"+projects[i].endDate.year);
	System.out.println("Role: "+projects[i].role);
	System.out.print("\n\nResponsibilities: ");
		for (int counter=0;counter<projects[i].responsibilities.length;counter++)
		{
		System.out.print(projects[i].responsibilities[counter]+"\t");
		}
	}
		}
    		}
		 catch(MandatoryMissingException a)
		{
			System.out.println(a);
		}
		}
        catch(NullPointerException e)
	{
	System.out.println(e);
	}
	
	}


}

