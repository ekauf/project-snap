import cards.Card;

import java.util.ArrayList;
import java.util.Scanner;



public class Snap extends CardGame {
    private ArrayList<Card> playerDeck;
    private Card previousCard;

    public Snap(ArrayList<Card> deckOfCards, String name) {
        super(deckOfCards, name);
        playerDeck = new ArrayList<>();
        previousCard = null;
    }

    public void play() {
        shuffleDeck();
        Scanner input = new Scanner(System.in);

    }




}