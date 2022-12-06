package class26;

import java.util.Iterator;
import java.util.LinkedList;

public class Homework_2 {
    /* Create a Card class that will have implemented and unimplemented methods and a constructor that will
       initializes credit card type. Create 3 subclasses of a Card card. Create 3 objects of different card
       and store them into LinkedList. Using for loop/advanced for loop/ iterator access all methods of the class. */
    public static void main(String[] args) {
        Card visaCC = new Visa("Visa Credit Card");
        Card mastercardCC = new MasterCard("Master Card Credit");
        Card discoveryCC = new Discovery("Discovery Credit Card");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(visaCC);
        cards.add(mastercardCC);
        cards.add(discoveryCC);

        // Using for loop
        System.out.println("************ For loop **********");
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).paidBalance();
            cards.get(i).increaseLimit();
        }
        // Using advanced for loop
        System.out.println("************ Advanced for loop **********");
        for (Card card : cards) {
            card.paidBalance();
            card.increaseLimit();
        }
        // Using iterator access
        System.out.println("************ Iterator access **********");
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()) {
            Card card = iterator.next();
            card.paidBalance();
            card.increaseLimit();
        }

    }
}

class Card {
    String typeOfCC;

    void paidBalance () {
        System.out.println(typeOfCC + ": Balance is paid");
    }

    void increaseLimit() {

    }
    Card(String typeOfCC) {
        this.typeOfCC = typeOfCC;
    }
}

class Visa extends Card {
    Visa(String typeOfCC) {
        super(typeOfCC);
    }
}
class MasterCard extends Card{
    MasterCard(String typeOfCC) {
        super(typeOfCC);
    }
}
class Discovery extends Card {
    Discovery(String typeOfCC) {
        super(typeOfCC);
    }
}
