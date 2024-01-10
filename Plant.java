public class Plant{


Plant()
    {
        this("Rose");
        System.out.println("No parameter constructor");
    }
    Plant(String plantName)
    {
        this(5,"order Rosales");
        System.out.println("plant Name="+plantName);

    }
    Plant(int plantHeight, String plantFamily)
    {
            this("order Rosales","Rose");
            System.out.println("plant Height="+plantHeight);
            System.out.println("plant Family="+plantFamily);
    }

    Plant(String plantFamily, String plantName)
    {
        System.out.println("plant Family="+plantFamily);
        System.out.println("plant Name="+plantName);
    }


    public static void main(String args[])
    {
        Plant p=new Plant();

    }

}