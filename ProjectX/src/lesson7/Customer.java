package lesson7;

public class Customer {
    String name;
    int age;
    double sum;
    boolean wish;

    Customer(String name, int age, double sum, boolean wish) {
        this.name = name;
        this.age = age;
        this.sum = sum;
        this.wish = wish;
    }

    boolean is18() {
        if (age < 18) {
            System.out.println("Извините, приходите, через " + (18 - age) + " лет");
            return false;
        } else {
            return true;
        }
    }
    public double getSum() {
        return sum;
    }
}
