public class Number {
    private int num1;
    private int num2;

    // Default constructor
    public Number() {
        // Initialize default values if needed
        this.num1 = 0;
        this.num2 = 0;
    }

    // Constructor with two parameters
    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Another constructor with two parameters
    public Number(double num1, double num2) {
        // You can perform type conversion or any other operations if needed
        this.num1 = (int) num1;
        this.num2 = (int) num2;
    }

    // Yet another constructor with two parameters
    public Number(String num1, String num2) {
        // You can parse strings to integers or perform other operations if needed
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }

    public void displayNumbers() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Number defaultNumber = new Number();
        System.out.println("Default Constructor:");
        defaultNumber.displayNumbers();
        System.out.println();

        // Creating an object using the constructor with two int parameters
        Number intNumber = new Number(10, 20);
        System.out.println("Constructor with two int parameters:");
        intNumber.displayNumbers();
        System.out.println();

        // Creating an object using the constructor with two double parameters
        Number doubleNumber = new Number(30.5, 40.8);
        System.out.println("Constructor with two double parameters:");
        doubleNumber.displayNumbers();
        System.out.println();

        // Creating an object using the constructor with two string parameters
        Number stringNumber = new Number("50", "60");
        System.out.println("Constructor with two string parameters:");
        stringNumber.displayNumbers();
    }
}
