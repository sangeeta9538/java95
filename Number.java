public class Number {
     int num1;
     int num2;

    Number() {
        
    }
     Number(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		}

    
    public Number(double num1, double num2) {

        System.out.println(num1);
		System.out.println(num2);
    }


    public Number(String num1, String num2) {
		System.out.println(num1);
		System.out.println(num2);
		
    }

    public void displayNumbers() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public static void main(String[] args) {
  
        Number defaultNumber = new Number();
        System.out.println("Default Constructor:");
        System.out.println(defaultNumber);

       System.out.println("Constructor with two int parameters:");
	   Number intNumber = new Number(10, 20);
        System.out.println(intNumber);

       
        Number doubleNumber = new Number(30.5, 40.8);
        System.out.println("Constructor with two double parameters:");
        System.out.println(doubleNumber);


        Number charNumber = new Number("s", "k");
        System.out.println("Constructor with two string parameters:");
                System.out.println(charNumber);

    }
}
