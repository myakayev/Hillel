package lesson7;

public class Car {
    String brand;
    double price;
    int amount;
    Car(String brand, int price, int amount){
        this.brand = brand;
        this. price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }
    public boolean checkAmount() {
        if (amount >= 1) {
            return true;
        } else {
            System.out.println("Приходите завтра!");
            return false;
        }
    }
}
