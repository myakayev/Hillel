package lesson_9.task2;

public class CarBody {
    private final String brand;
    private final String model;
    private final String type;
    private final String color;


    public CarBody(String brand, String model, String type, String color) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
