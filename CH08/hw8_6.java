// hw8_6
class CCircle        // �w�q���OCCircle
{
   double pi=3.14;
   double radius;

   void show_periphery()   // show_periphery(), ��ܥX��P��
   {
      System.out.println("periphery="+2*this.pi*this.radius);
   }
}

public class hw8_6
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();

      cir1.radius=3.0;
      cir1.show_periphery();  // �I�sshow_periphery()
   }
}

/* output-------
periphery=18.84
--------------*/