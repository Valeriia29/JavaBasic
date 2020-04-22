package HW.Cars_21_04_2020;

public class Movement {
    public static void startLessonExample(){
        Car car = new Car();
        Bus bus = new Bus();
        Lorry lorry = new Lorry();

        car.drive();
        bus.drive();
        lorry.drive();
        car.stop();
     }
}
