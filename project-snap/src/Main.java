import cards.Card;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> deckOfCards = new ArrayList<>();
        Snap snap = new Snap(deckOfCards, "Snap");
        snap.play();
    }
}
