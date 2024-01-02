public class MathExample {

    public static void main(String[] args) {
       
        double num1 = 5.5;
        double num2 = 2.5;

      
        double sum = Math.addExact((int) num1, (int) num2);
        double difference = Math.subtractExact((int) num1, (int) num2); 
        double product = Math.multiplyExact((int) num1, (int) num2);
        double quotient = num1 / num2;

      
        double powerResult = Math.pow(num1, num2);
        double squareRoot = Math.sqrt(num1);

      
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Power Result: " + powerResult);
        System.out.println("Square Root: " + squareRoot);

    }
}
