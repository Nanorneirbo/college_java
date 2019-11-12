package com.company;


public class Main{

    public static void main (String args[]){

        //Card card1 = new Card();
        //bring over a new deck
        Deck deck1 = new Deck();
        int[] newCards;
        newCards = deck1.getNumericalCards();
        //shuffle the deck
        int[] shuffledDeck;
        shuffledDeck = deck1.shuffleCards(newCards);


        // deal two hands
        int [] hand1 = new int[5];
        int[] hand2 = new int[5];


        int k;
        int i = 0;

        //deal every second card each time.
        for (k = 0; k < 5; k++) {
            hand1[k] = shuffledDeck[i];
            hand2[k] = shuffledDeck[i + 1];
            i += 2;
        }
       //testing
       /* hand1[0] = 12;
        hand1[1] = 13;
        hand1[2] = 14;
        hand1[3] = 15;
        hand1[4] = 16;

        hand2[0] = 4;
        hand2[1] = 17;
        hand2[2] = 30;
        hand2[3] = 42;
        hand2[4] = 41;*/
        // display the hands
        // bring over display Deck
        String[] displayDeck = new String[52];

        displayDeck = deck1.getDisplayDeck();
        String[] displayHand1 = new String[5];
        String[] displayHand2 = new String[5];


        // create a visual of the hands that were dealt

        for(i=0; i<5; i++){
            displayHand1[i] = displayDeck[hand1[i]];
            displayHand2[i] = displayDeck[hand2[i]];
        }



    //Display the hands
        System.out.println("Player 1 your hand is :");
            for(i=0; i<5; i++){
        System.out.println("-  " + displayHand1[i]);
    }

	System.out.println("Player 2 your hand is :");
            for(i=0; i<5; i++){
        System.out.println(" -  " + displayHand2[i]);
    }



    // evaluate two hands

        //declare results


            System.out.println(" Player 1 has a: " + deck1.checkResult(deck1.checkHand(hand1)));
            System.out.println(" Player 2 has a: " + deck1.checkResult(deck1.checkHand(hand2)));

    // declare a winner
        if(deck1.checkHand(hand1)> deck1.checkHand(hand2)){
            System.out.println("Player 1 wins!");
        }
        else if (deck1.checkHand(hand1)== deck1.checkHand(hand2)){
            System.out.println("its a Draw!");
        }
        else{
            System.out.println("Player 2 wins");
        }




}

}