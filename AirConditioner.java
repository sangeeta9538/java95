public class AirConditioner{
    String brandName;
    int powerConsumption;
    String colour;
    int price;
    boolean isItDualClimate;
    int warranty;



    public void display()
    {
        System.out.println("Brand Name=" +brandName);
        System.out.println("Power Consumption=" +powerConsumption);
        System.out.println("Colour=" +colour);
        System.out.println("Price=" +price);
        System.out.println("Is It Dual climate=" +isItDualClimate);
        System.out.println("Warranty=" +warranty); 
   }


AirConditioner(String brandName, int powerConsumption, String colour, int price, boolean isItDualClimate, int warranty )
{
    this(brandName,powerConsumption,colour,price,isItDualClimate);
    this.warranty=warranty;
    System.out.println("6 parameter constructor");
}
AirConditioner(String brandName, int powerConsumption, String colour, int price, boolean isItDualClimate)
{
    this(brandName,powerConsumption,colour,price);
    this.isItDualClimate=isItDualClimate;
    System.out.println("5 parameter constructor");

}
AirConditioner(String brandName, int powerConsumption, String colour, int price)
{
    this(brandName,powerConsumption,colour);
    this.price=price;
    System.out.println("4 parameter constructor");
}
AirConditioner(String brandName, int powerConsumption, String colour)
{
    this(brandName,powerConsumption);
    this.colour=colour;
    System.out.println("3 parameter constructor");

}
AirConditioner(String brandName, int powerConsumption)
{
    this(brandName);
    this.powerConsumption=powerConsumption;
    System.out.println("2 parameter constructor");
}
AirConditioner(String brandName)
{
    this();
    this.brandName=brandName;
    System.out.println("1 parameter constructor");

}
AirConditioner()
{
    System.out.println("No Parameter Constructor");
}

}