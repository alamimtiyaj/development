class Super 
{
  int x=10;
   Void disp()
    {
    System.out.printf("super",+x); 
    }
}
 class Sub extends Super
 { 
  int y=30;
  Void display()
   {
   System.out.printf("super",+x);
   System.out.printf("sub",+y);
   }
  }

 class Demo
 { 
  public static void main(String args[])
  {
   Sub obj=new Sub();
    obj.disp();
    obj.display();
   }
  }
