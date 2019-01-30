class Student
{
String firstName;
String lastName;
Address addr;
Date dob;
String [] skills;
Qualification[] qual;
Project [] projects;
String eMail;
String contactNo;
}
Student( String f;String l;String e;String c)
{
this.firstName=f;
this.lastName=l;
this.eMail=e;
this.contactNo=c;
}
void getAddress(String l1;String l2;String c;String s;int p)
{
addr=new Address(l1,l2,c,s,p)
}
void getDOB(int d;int m;int y)
{
dob=new Date(d,m,y)
}
