public class AirCondition{

    public static void main(String args[])
    {
        AirConditioner air1=new AirConditioner("abc",180,"white",450000,true,3);
        air1.display();
        System.out.println("__________________________________________");

        AirConditioner air2=new AirConditioner("lg",300,"Blue",50000,false);
        air2.display();
        System.out.println("__________________________________________");

        AirConditioner air3=new AirConditioner("Whirlpool",220,"white",45000);
        air3.display();
        System.out.println("__________________________________________");

        AirConditioner air4=new AirConditioner("samsung",600,"Black");
        air4.display();
        System.out.println("__________________________________________");

        AirConditioner air5=new AirConditioner("Goodman",650);
        air5.display();
        System.out.println("__________________________________________");

        AirConditioner air6=new AirConditioner("Haier");
        air6.display();
        System.out.println("__________________________________________");
    }
}