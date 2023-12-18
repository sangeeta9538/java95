public class Typecast{ 
    public static void main(String args[]){
		byte a = 127;
		long b=a;
		System.out.println("Byte value:"+ a);
		System.out.println("long value after casting:"+ b);
		
		short shortNumber =32767;
		int intNumber = shortNumber;
		System.out.println("short value:"+ shortNumber);
		System.out.println("int value after Typecasting:"+ intNumber);
		
		int intValue =2147483647;
		long longValue =intValue;
		System.out.println("int value:"+ intValue);
		System.out.println("long value after Typecasting:"+ longValue);
		
		
		byte x = 127;
		short y= x;
		System.out.println("Byte value:"+ x);
		System.out.println("short value after casting:"+ y);
		
		float p = 127f;
		double q= (float)p;
		System.out.println("float value:"+ p);
		System.out.println("double value after casting:"+ q);
		
		long longNum =2147483647L;
		int intnum =(int)longNum;
		System.out.println("long value:"+ longNum);
		System.out.println("int value after downcasting:"+ intnum);
		
		
		
		
		
		
	}
	










}