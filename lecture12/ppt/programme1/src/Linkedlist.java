import java.util.*;
public class Linkedlist{
public static void main(String args[])

{
LinkedList<String> s1=new LinkedList<String>();
System.out.println("Initial elements of elements:\n\n "+s1);
s1.add("ravi");
s1.add("vijay");
s1.add("ajay");
System.out.println(" After invoking add method:\n\n "+s1);
s1.add(1,"gaurav");
System.out.println("after invoking add(no.,name)method \n\n"+s1);
LinkedList <String> s2=new LinkedList<String>();
s2.add("Sonoo");
s2.add("hanumat");
s1.addAll(s2);
System.out.println(" after adding all elements: \n\n"+s1);

LinkedList<String> s3=new LinkedList<String>();
s3.add("John");
s3.add("Rahul");
s1.addAll(1,s3);
System.out.println(" After invoking addAll(int index )method :\n\n "+s1);
s1.addFirst("Lokesh");
System.out.println(" after invoking addFirst method\n\n"+s1);

}
}

