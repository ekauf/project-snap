import cards.Card;

import java.util.ArrayList;
import java.util.Scanner;



public class Snap extends CardGame {

        private ArrayList<Card> playerDeck;
        private Card previousCard;

    public Snap(ArrayList < Card > deckOfCards, String name) {
            super(deckOfCards, name);
            playerDeck = new ArrayList<>();
            previousCard = null;
        }


        public void play () {
            shuffleDeck();
            Scanner input = new Scanner(System.in);
            System.out.println("Press ENTER to start your turn...");
            while (true) {
                input.nextLine();
                Card currentCard = dealCard();
                playerDeck.add(currentCard);
                System.out.println("Dealt card: " + currentCard);
                if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                    System.out.println("SNAP! You win!");
                    break;
                }
                previousCard = currentCard;
            }
            input.close();
        }



}