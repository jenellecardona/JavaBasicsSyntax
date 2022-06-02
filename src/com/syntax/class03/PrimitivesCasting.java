package com.syntax.class03;

public class PrimitivesCasting {
		
		//ctrl+space ---> auto completes "Main Method"(public static void main(String[] args)
		public static void main(String[] args) {
			
			int i=100;
			double d=100;//Widening 
			System.out.println(i);//100
			System.out.println(d);//100.0
			
			long l=10000;//Widening
			
			//casting in java is converting one type into another
			/*Two types
			 * Widening & Narrowing 
			 * Widening means converting a smaller type to a larger type size.
			 * (i.e byte->short->int->long->float->double)
			 * Widening happens implicitly (automatically)
			 * Narrowing
			 * Narrowing is going from a bigger type and trying to store it in a smaller type
			 * (i.e double->float->long->int->short->byte
			 * Also known as explicit casting or manual casting 
			 */
			
			//Narrowing or Explicit Casting
			int x=(int)99.99;
			System.out.println(x);
			
			//Type mismatch: cannot convert from int to byte (byte b=130)
			byte b=(byte)130;
			System.out.println(b);
			
			//Type mismatch: cannot convert from double to float (float f=10.99)
			float f=(float)10.99;
			double dd=9.99;
			
			System.out.println(f);
			System.out.println(dd);
			
			
			
			
			
			
			
		}
	

}
