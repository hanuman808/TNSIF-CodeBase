package DaySix.finaldemo;

public class FinalVarialble {
//	final int a ;//final instance variable must be instance
	final int x =100;
	//declare a static blank final variable
	final static int y;
	final static int z =10;

   void Change() {
	   //cannot be change or reassign value of final variable
//	   x = 30;
//	   z = 50;
//	   
   }

   @Override
   public String toString() {
	return "FinalVarialble [x=" + x + ",y="+ y +"]";
   }
   
   
   static {
	   y = 101;
//	   z=90; can` t reassign value
   }
}
