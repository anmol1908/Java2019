class ConstructorDemo
{
 public static void main(String [] args)
   {
   Box obj1=new Box();
   double vol1=obj1.volume();
   System.out.print(" \n (Non- parametrised constructor) \nVolume is  : " +vol1);
   Box obj2=new Box(2,3);
   double vol2=obj2.volume();
   System.out.print(" \n (Non- parametrised constructor) \nVolume is  : " +vol2);
   Box obj3=new Box(2,3,4);
   double vol3=obj3.volume();
   System.out.print(" \n (parametrised constructor) \nVolume is  : " +vol3);
   }
}
