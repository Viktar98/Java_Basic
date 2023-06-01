import com.auto.finland.Car;

public class Second {

    public static void main(String[] args) {

        System.out.println(Car.histYear);
        System.out.println();

        Car finlandCar1 = new Car();
        System.out.println(finlandCar1.year);
        System.out.println(finlandCar1.fabric);
        System.out.println(finlandCar1.power);
        System.out.println(Car.histYear);
        finlandCar1.printParametrs();

        Car.histYear = 2003;
        System.out.println();

        Car finlandCar2 = new Car();
        finlandCar2.year = 1999;
        finlandCar2.fabric = "bmw";
        finlandCar2.power = 220;
        System.out.println(Car.histYear);
        finlandCar2.printParametrs();


        System.out.println(finlandCar2.year);
        System.out.println(finlandCar2.fabric);
        System.out.println(finlandCar2.power);



    }

}
