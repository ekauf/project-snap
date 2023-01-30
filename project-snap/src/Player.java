import cards.Card;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playerDeck;
    private String name;

    public Player(String name) {
        this.name = name;
        playerDeck = new ArrayList<>();
    }

    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void addCardToDeck(Card card) {
        playerDeck.add(card);
    }

    public String getName() {
        return name;
    }
}
