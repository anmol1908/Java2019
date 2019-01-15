/* Program to display size and ranges of different primitive data types in Java */


class Size{
   public static void main(String args[])
   {
   int counter=1;
   // colums of table 
   System.out.print("S.N. \t Data Type \t Size \t Min value \t Max value \n");
   // size and range of data type byte
   System.out.print(+(counter)+" \t "+Byte.TYPE+" \t\t "+Byte.SIZE+" \t "+Byte.MIN_VALUE+" \t\t "+Byte.MAX_VALUE+" \n");
   // size and range of data type short
   System.out.print(+(counter++)+" \t "+Short.TYPE+" \t\t "+Short.SIZE+" \t "+Short.MIN_VALUE+" \t\t "+Short.MAX_VALUE+" \n");
   // size and range of data type integer
   System.out.print(+(counter++)+" \t "+Integer.TYPE+" \t\t "+Integer.SIZE+" \t "+Integer.MIN_VALUE+" \t\t "+Integer.MAX_VALUE+" \n");
   // size and range of data type long
   System.out.print(+(counter++)+" \t "+Long.TYPE+" \t\t "+Long.SIZE+" \t "+Long.MIN_VALUE+" \t\t "+Long.MAX_VALUE+" \n");
   // size and range of data type float
   System.out.print(+(counter++)+" \t "+Float.TYPE+" \t\t "+Float.SIZE+" \t "+Float.MIN_VALUE+" \t\t "+Float.MAX_VALUE+" \n");
   // size and range of data type double
   System.out.print(+(counter++)+" \t "+Double.TYPE+" \t\t "+Double.SIZE+" \t "+Double.MIN_VALUE+" \t\t "+Double.MAX_VALUE+" \n");
   // size and range of data type character
   System.out.print(+(counter++)+" \t "+Character.TYPE+" \t\t "+Character.SIZE+" \t "+(int)Character.MIN_VALUE+" \t\t "+(int)Character.MAX_VALUE +" \n");
   // size and range of data type boolean
   System.out.print(+(counter++)+"  Boolean does not have any size or range . It id used to indicate true or false. \n");
   }
}
