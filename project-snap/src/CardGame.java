import cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    public CardGame(ArrayList<Card> deckOfCards, String name) {
        this.deckOfCards = deckOfCards;
        this.name = name;
        String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660", };
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i = 0; i <suits.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                deckOfCards.add(new Card(suits[i], symbols[j], values[j]));
            }
        }
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public Card dealCard() {
    if (deckOfCards.size() > 0) {
        return deckOfCards.remove(0);
    } else {
        return null;
    }
    };

    public ArrayList<Card> sortDeckInNumberOrder() {
    Collections.sort(deckOfCards, (a,b) -> a.getValue() - b.getValue());
        return deckOfCards;
    };

    public ArrayList<Card> sortDeckIntoSuits() {
    Collections.sort(deckOfCards, (a, b) -> {
        if (!a.suit.equals(b.suit)) {
            return a.getSuit().compareTo(b.getSuit());
        } else {
            return a.getValue() - b.getValue();
        }
    });
    return deckOfCards;
    };

    ArrayList<Card> shuffleDeck() {
    Collections.shuffle(deckOfCards);
    return deckOfCards;
    };



}
