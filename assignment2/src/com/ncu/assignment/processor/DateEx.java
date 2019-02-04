package com.ncu.assignment.processor;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.exception.*;

public class DateEx
{
	int day;
	int month;
	int year;

	public DateEx(int d,int m,int y)
	{
		try
		{
		if ((d<=0 || d>31) || (m<=0 || m>12) || (y<=0))
		{
		throw new DateFormatException (StudentValidationMessage.Date);
		}
		else
		{
		this.day = d;
		this.month = m;
		this.year = y;
		}
		}
		catch(DateFormatException e)
		{
		System.out.println(e);
		}
	}
}
