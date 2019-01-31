class MyTime
{
private int hour=0,minute=0,second=0;
public MyTime()
{
this.hour=0;
this.minute=0;
this.second=0;
}
public MyTime(int h,int m,int s)
{
if((h<=23&&h>=0)&&(m<=59&&m>=0)&&(s<=59&&s>=0))
{
this.hour=h;
this.minute=m;
this.second=s;
}
else
{
throw new IllegalArgumentException(" ");
}
}
public void setTime(int h,int m,int s)
{
if((h<=23&&h>=0)&&(m<=59&&m>=0)&&(s<=59&&s>=0))
{
this.hour=h;
this.minute=m;
this.second=s;
}
else
{
throw new IllegalArgumentException(" ");
}
}
public int getHour()
{
return hour;
}
public int getMin()
{
return minute;
}
public int getSec()
{
return second;
}
public void setHour(int h)
{
if(h>23)
this.hour=0;
else if(h<0)
this.hour=23;
else
this.hour=h;
}
public void setMin(int m)
{
if(m>59)
this.minute=0;
else if(m<0)
this.minute=59;
else
this.minute=m;
}

public void setSec(int s)
{
if(s>59)
this.second=0;
else if(s<0)
this.second=59;
else
this.second=s;
}

public String toString()
{
return (String.format("%02d : %02d : %02d" ,hour,minute,second));
}


MyTime nextHour()
{ 
MyTime temp=new MyTime();
temp.setHour(getHour()+1);
temp.setMin(getMin());
temp.setSec(getSec());
return temp;
}


MyTime nextMin()
{
MyTime temp=new MyTime();
if(getMin()==59)
{
temp.setHour(getHour()+1);
temp.setMin(getMin()+1);
temp.setSec(getSec());
}
else
{
temp.setHour(getHour());
temp.setMin(getMin()+1);
temp.setSec(getSec());
}
return temp;
}


MyTime nextSec()
{
MyTime temp=new MyTime();
if(getSec()==59 && getMin()==59)
{
temp.setHour(getHour()+1);
temp.setMin(getMin()+1);
temp.setSec(getSec()+1);
}
else if(getSec()==59 && getMin()!=59)
{
temp.setHour(getHour());
temp.setMin(getMin()+1);
temp.setSec(getSec()+1);
}
else
{
temp.setHour(getHour());
temp.setMin(getMin());
temp.setSec(getSec()+1);
}
return temp;
}





MyTime previousHour()
{
MyTime temp=new MyTime();
temp.setHour(getHour()-1);
temp.setMin(getMin());
temp.setSec(getSec());
return temp;
}


MyTime previousMin()
{
MyTime temp=new MyTime();
if(minute==0)
{
temp.setHour(getHour()-1);
temp.setMin(getMin()-1);
temp.setSec(getSec());
}
else 
{
temp.setHour(getHour());
temp.setMin(getMin()-1);
temp.setSec(getSec());
}
return temp;
}



MyTime previousSec()
{
MyTime temp=new MyTime();
if(second==0 && minute==0)
{
temp.setHour(getHour()-1);
temp.setMin(getMin()-1);
temp.setSec(getSec()-1);
}
else if(second==0)
{
temp.setHour(getHour()-1);
temp.setMin(getMin());
temp.setSec(getSec()-1);
}
else
{
temp.setHour(getHour());
temp.setMin(getMin());
temp.setSec(getSec()-1);
}
return temp;
}




}
