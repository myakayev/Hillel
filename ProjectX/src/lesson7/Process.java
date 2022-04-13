package lesson7;

public class Process {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan Petrovych", 18, 499991, false);
        Car car = new Car("Audi", 50000, 1);
        double cred = (car.price - customer.sum)/36;
        if (customer.is18()) {
            if (car.checkAmount()) {
                if (customer.getSum() - car.getPrice() >= 0) {
                    System.out.println("Мы завернули для Вас машину! Наслаждайтесь приобретением!");
                } else {
                    if (customer.wish) {
                        System.out.println("Вы будете платить в банк по " + cred
                        + " в месяц на протяжении 3-х лет. Мы завернули для Вас машину! Наслаждайтесь " +
                                "приобретением и кредитом!");
                    } else {
                        System.out.println("Приходите, когда желание появится!");
                    }
                }
            }
        }
    }
}

