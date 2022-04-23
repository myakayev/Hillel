package lesson_9.task2;

public class Wheel {
    private int radius;
    private String model;
    private int profile;
    private int width;


    public int getRadius() {
        return radius;
    }

    public String getModel() {
        return model;
    }

    public int getProfile() {
        return profile;
    }

    public int getWidth() {
        return width;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public Wheel[] wheelArr (Wheel wheel) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            wheels[i].model = wheel.getModel();
            wheels[i].profile = wheel.profile;
            wheels[i].radius = wheel.radius;
            wheels[i].width = wheel.width;
        }
        return wheels;
    }
}
