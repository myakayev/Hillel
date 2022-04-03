package com.lesson5;

public class CreditCard {
    String cardNumber;
    String owner;
    String type;
    CreditCard (String cardNumber, String owner, String type) {
        this.cardNumber = owner;
        this.owner = owner;
        this.type = type;
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard("3456", "Ivan", "МИР");
        switch (card.type) {
            case "VISA", "MASTERCARD" -> System.out.println("Ув." + card.owner + ", поздравляем, вы используете " +
                    "нормальную карту");
            case "МИР" -> System.out.println(card.owner + ", пошел ты на х#й вместе со своим русским кораблем!!”");
            default -> System.out.println("Неизвестный тип карты " + card.type);
        }
    }
}
