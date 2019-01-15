class BoxDemo
{
 public static void main(String [] args)
   {
   Box obj=new Box();
   obj.setDim(2,3,4);
   double vol=obj.volume();
   System.out.print(" Volume is : " +vol);
   }
}
