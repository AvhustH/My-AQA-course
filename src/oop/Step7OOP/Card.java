package oop.Step7OOP;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

import static java.lang.Integer.parseInt;
import static oop.Step7OOP.CardType.MasterCard;
import static oop.Step7OOP.CardType.Visa;
import static oop.Step7OOP.RoleType.VIEWER;

public class Card {
    private int id;
    private int number;
    private int[] expireDate;
    private int[] cvv;
    private String cardType;

    private Card() {
    }

    public static int parseCard(String s) throws NumberFormatException {
        return parseInt(s,10);
    }

    private Card(int number, int[] expireDate, int[] cvv, String cardType) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        CardType userTypeCard = CardType.valueOf(cardType);

        if (Objects.equals(userTypeCard,MasterCard )) {
            this.cardType = cardType;
        } else if (Objects.equals(userTypeCard,Visa )) {
            this.cardType = cardType;
        } else {
            this.cardType = null;
        }
        id++;

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setExpireDate(int[] expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvv(int[] cvv) {
        this.cvv = cvv;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getNumber() {
        return number;
    }

    public int[] getExpireDate() {
        return expireDate;
    }

    public int[] getCvv() {
        return cvv;
    }

    public String getCardType() {
        return cardType;
    }
}
