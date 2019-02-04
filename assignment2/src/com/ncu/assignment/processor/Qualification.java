package com.ncu.assignment.processor;


public class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
	public Qualification()
	{
		this.qualName = null;
		this.university = null;
		this.institute = null;
		this.cgpa = 0;
	}
	public Qualification(String q, String u, String i, float c)
	{
		this.qualName = q;
		this.university = u;
		this.institute = i;
		this.cgpa = c;
	}
}
