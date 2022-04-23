package lesson_9.task2;

public class Main {
    public static void main(String[] args) {
        CarBody audi = new CarBody("Audi", "A4", "sedan", "red");
        Engine engine = new Engine();
        engine.setCapacity(4200);
        engine.setType("petrol");
        engine.setPower(150);

        GearBox gearBox = new GearBox();
        gearBox.setType("manual");

        Wheel wheel = new Wheel();
        wheel.setModel("GoodYear");
        wheel.setRadius(18);
        wheel.setProfile(205);
        wheel.setWidth(45);
        Wheel[] wheels = wheel.wheelArr(wheel);

        Car car = new Car();
        car.setCarBody(audi);
        car.setEngine(engine);
        car.setGearBox(gearBox);
        car.setWheels(wheels);

        car.carInfo();
    }

}
