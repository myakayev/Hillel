package com.lesson2;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard card1 = new IdentityCard(11100011, "Hnat", "Petrenko");
        IdentityCard card2 = new IdentityCard(22224444, "Kyrylo", "Kopiika");
        IdentityCard card3 = new IdentityCard(34235654, "Albert", "Enstain");
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}
