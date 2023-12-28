public class Camera
{
        String brandName;
        int price;
        int resolution;
        CameraType type1;
        BatteryType type2 ;
        ChargingType type3;
        DisplayType type4;
        int modelYear;
        String features[];

        Camera(String brandName,  int price, int resolution, CameraType  type1, BatteryType type2, ChargingType type3, DisplayType type4, int modelYear, String[] features)
        {
            this.brandName=brandName;
            this.price=price;
            this.resolution=resolution;
            this.type1=type1;
            this.type2=type2;
            this.type3=type3;
            this.type4=type4;
            this.modelYear=modelYear;
            this.features=features;
        }

        Camera()
        {
            System.out.println("NO Parameter Constructor");

        }

        public void display()
        {
            System.out.println("Brand Name="+brandName);
            System.out.println("Price="+price);
            System.out.println("Resolution="+resolution);
            System.out.println("Camera type="+type1);
            System.out.println("Battery Type="+type2);
            System.out.println("Charging Type="+type3);
            System.out.println("Display Type="+type4);
            System.out.println("Model Year="+modelYear);
            System.out.println("features:");
        }



}