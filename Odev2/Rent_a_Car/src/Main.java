import Car.Concrete.HatcBackCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> carTypes = new ArrayList<String>();
        HatcBackCar hb = new HatcBackCar(300,14,"siyah",5);
        carTypes.add("SUV");
        carTypes.add("Hatcback");
        carTypes.add("Sedan");
        System.out.println(carTypes+" "+hb);
    }
}