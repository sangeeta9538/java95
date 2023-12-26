public class CameraRunner{

    public static void main(String args[])
    {
        String[] features={"Battery_duration","Storage","Resolution","Dynamic_range"};

        Camera camera1=new Camera("Canon",282000,24000, CameraType.NIKON, BatteryType.LITHIUM, ChargingType.USBC, DisplayType.LCD, 1971,features);
        camera1.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera1.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera1.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera1.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera1.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");

        Camera camera2=new Camera("Sony",40000,7680, CameraType.PLOARIOD, BatteryType.ALKALINE, ChargingType.MICROUSB, DisplayType.OLED, 2002,features);
        camera2.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera2.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera2.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera2.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera2.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");

        Camera camera3=new Camera("PenTax",35000,23000, CameraType.BRIDGE, BatteryType.SALTBASED, ChargingType.LIGHTINGCABLE, DisplayType.AMOLED, 2000,features);
        camera3.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera3.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera3.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera3.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera3.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");

        Camera camera4=new Camera("Nikon",32500,6000, CameraType.NIKON, BatteryType.LITHIUM, ChargingType.USBC, DisplayType.LCD, 1999,features);
        camera4.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera4.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera4.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera4.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera4.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");

        Camera camera5=new Camera("Panasonic",65000,5600, CameraType.NIKON, BatteryType.LITHIUM, ChargingType.USBC, DisplayType.LCD, 1989,features);
        camera5.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera5.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera5.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera5.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera5.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");

        Camera camera6=new Camera("Fujifilm",55000,2876, CameraType.NIKON, BatteryType.LITHIUM, ChargingType.USBC, DisplayType.LCD, 1899,features);
        camera6.display();
        for(int i=0;i<features.length;i++)
        {
            System.out.println(features[i]);
        }

        switch(camera6.type1)
        {
            case NIKON:
                System.out.println("Camera type is NIKON");
                break;
            case PLOARIOD:
                System.out.println("Camera type is PLOARIOD");
                break;
            case BRIDGE:
                System.out.println("Camera type is BRIDGE");
                break;
            case SONY:
                System.out.println("Camera type is SONY");
                break;
        }

        switch(camera6.type2)
        {
            case LITHIUM:
                System.out.println("Battery type is LITHIUM");
                break;

            case ALKALINE:
                System.out.println("Battery type is ALKALINE");
                break;

            case SALTBASED:
                System.out.println("Battery type is SALT-BASED");
                break;

            case NICKELMETAL:
                System.out.println("Battery type is NICKELMETAL");
                break;
        }
        switch(camera6.type3)
        {
            case USBC:
                System.out.println("charging type is USBC");
                break;

            case MICROUSB:
                System.out.println("charging type is MICROUSB");
                break;

            case LIGHTINGCABLE:
                System.out.println("charging type is LIGHTINGCABLE");
                break;

            case USBTOLIGHTING:
                System.out.println("charging type is USBTOLIGHTING");
                break;
        }

        switch(camera6.type4)
        {
            case LCD:
                System.out.println("Display type is LCD");
                break;

            case OLED:
                System.out.println("Display type is OLED");
                break;

            case AMOLED:
                System.out.println("Display type is AMOLED");
                break;

            case DVD:
                System.out.println("Display type is DVD");
                break;


        }
        System.out.println("                                             ");





    }
}