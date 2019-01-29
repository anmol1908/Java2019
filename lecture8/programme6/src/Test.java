class Test
{
public static void main(String args[])
{
ResizableCircle r=new ResizableCircle(10);
System.out.println(r.getPerimeter()+"   "+r.getArea()+"   "+r.reSize(10)+"   "+r.getPerimeter()+"   "+r.getArea());
}
}
