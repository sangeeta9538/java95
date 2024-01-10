public class Telephone {
    private String brand;
    private String model;

    // Constructor with no parameters
    public Telephone() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    // Constructor with two parameters (brand and model)
    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Constructor with one parameter (only brand, model set to default)
    public Telephone(String brand) {
        this.brand = brand;
        this.model = "Unknown";
    }

    // Constructor with one parameter (only model, brand set to default)
    public Telephone(int model) {
        this.brand = "Unknown";
        this.model = "Model " + model;
    }

    // Method to display the details of the telephone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Telephone telephone1 = new Telephone();  // No-arg constructor
        Telephone telephone2 = new Telephone("Samsung", "Galaxy S21");  // Constructor with two parameters
        Telephone telephone3 = new Telephone("Apple");  // Constructor with one parameter (brand)
        Telephone telephone4 = new Telephone(10);  // Constructor with one parameter (model)

        // Displaying details of each telephone
        System.out.println("Telephone 1:");
        telephone1.displayDetails();
        System.out.println();

        System.out.println("Telephone 2:");
        telephone2.displayDetails();
        System.out.println();

        System.out.println("Telephone 3:");
        telephone3.displayDetails();
        System.out.println();

        System.out.println("Telephone 4:");
        telephone4.displayDetails();
    }
}
