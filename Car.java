public class Car {
     String brandName;
     String colour;
     int price;
     int mileage;
     int engineCapacity;
     int noOfAirbags;
     int topSpeed;
     boolean havingAc;

     Car(String brandName, String colour, int price, int mileage, int engineCapacity,
               int noOfAirbags, int topSpeed, boolean havingAc) {
        this.brandName = brandName;
        this.colour = colour;
        this.price = price;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.noOfAirbags = noOfAirbags;
        this.topSpeed = topSpeed;
        this.havingAc = havingAc;
    }

     void displayCarDetails() {
        System.out.println(brandName);
        System.out.println(colour);
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(engineCapacity);
        System.out.println(noOfAirbags);
        System.out.println(topSpeed);
        System.out.println(havingAc);
		
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 26000, 15, 2000, 6, 180, true);
        Car car2 = new Car("Honda", "Blue", 35000, 14, 1800, 4, 200, true);
        Car car3 = new Car("Ford", "Black", 36000, 12, 2500, 8, 220, false);
        Car car4 = new Car("Chevrolet", "White", 25000, 16, 1600, 5, 170, true);
        Car car5 = new Car("BMW", "Silver", 51000, 10, 3000, 10, 250, true);

        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
        car4.displayCarDetails();
        car5.displayCarDetails();
    }
}
