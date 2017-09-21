package com.credit_card.creditcard;

public class CreditCard {

    private String cardNum;
    private String cardHolderName;
    private String expireday;

    public enum CardType {
        LASER("Laser"),
        Master("Master"),
        Visa("Visa");

        private final String name;

        CardType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }




}
