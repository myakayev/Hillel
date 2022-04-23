package lesson_9.task2;

public class Car {
    private CarBody carBody;
    private Engine engine;
    private GearBox gearBox;
    private Wheel[] wheels;

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void carInfo(){
        System.out.println("Your car is " + carBody.getType() + " , model -" +
                 carBody.getModel() + ", color is " + carBody.getColor());
        System.out.println("The type of engine is " + engine.getType() + ". Capacity - " + engine.getCapacity() +
                " cm3. Power - " + engine.getPower() + "hp");
        System.out.println("Your gear box is " + gearBox.getType());
        System.out.println("Your wheels have next characteristics: \n model - " + wheels[0].getModel()
                        + "\n type - " + wheels[0].getProfile() + "/" + wheels[0].getWidth()
                + "/R" + wheels[0].getRadius());
    }
}
