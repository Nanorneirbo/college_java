package com.company;
import java.util.Arrays;
import java.util.Random;

public class Deck {
    private String suit;
    private String value;
    Random ran = new Random();


    /**
     * +
     *
     * @return
     */
    public int[] getNumericalCards() {
        int[] numericalCards = new int[52];
        int i;
        for (i = 0; i < 52; i++) {
            numericalCards[i] = i;
        }
        return numericalCards;
    }

    /**
     * +
     *
     * @param deck
     * @return
     */

    public int[] shuffleCards(int[] deck) {
        int j;
        int randomCard;
        int temp;
        // Shuffle deck
        for (j = 0; j < 100; j++) {
            randomCard = ran.nextInt(51);
            temp = deck[randomCard];
            while (randomCard < 51) {
                deck[randomCard] = deck[randomCard + 1];
                randomCard++;
            }
            deck[51] = temp;
        }
        return deck;

    }

    public String[] getDisplayDeck() {
        String[] wordCards = new String[52];
        int i;
        for (i = 0; i < 52; i++) {
//suits initialise
            if (i <= 12) {
                suit = "Hearts";
            } else if (i <= 25) {
                suit = "Clubs";
            } else if (i <= 38) {
                suit = "Spades";
            } else
                suit = "Diamonds";

// Initialise all values
            if (i % 13 == 10) {
                value = "Jack";
            } else if (i % 13 == 11) {
                value = "Queen";
            } else if (i % 13 == 12) {
                value = "King";
            } else if (i % 13 == 0) {
                value = "Ace";
            } else {
                value = Integer.toString(i % 13 + 1);
            }

            wordCards[i] = value + " of " + suit;

        }
        return wordCards;

    }

    public int checkHand(int[] hand) {

        //check pairs ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        int handRank =0;
        int[] modHand = new int[5];
        int i;

        //need each value in the hand to be modded since they are at intervals of 13
        for (i = 0; i < 5; i++) {
            modHand[i] = (hand[i]) % 13;
        }

        // sort the hand - not strictly necessary
        Arrays.sort(modHand);

        int matchCount = 0;
        int maxMatch = 0;
        int checkCard;
        int matchCard = 0;
        int l;
        int h;
        //check each card for a pair or a triplet,
        for (h = 0; h < 5; h++) {
            matchCount = 0;
            checkCard = modHand[h];
            for (l = 0; l < 5; l++) {

                if (checkCard == modHand[l]) {
                    matchCount++;
                }
                if (matchCount > maxMatch) {
                    maxMatch = matchCount;
                    matchCard = hand[l];
                }
            }

        }
        switch(maxMatch){
            case 1:
                handRank = 0;
                // if no matches there might be a straight or a flush.
                // Flush check

                    boolean flush;
                                                                            //String flushType = "";
                    // check ranges to find the flush
                    if (hand[0] <= 12 && hand[1] <= 12 && hand[2] <= 12 && hand[3] <= 12 && hand[4] <= 12) {
                        flush = true;
                        //flushType = "Hearts";
                    } else if (13 <= hand[0] && hand[0] <= 25 && 13 <= hand[1] && hand[1] <= 25 && 13 <= hand[2] && hand[2] <= 25 && 13 <= hand[3] && hand[3] <= 25 && 13 <= hand[4] && hand[4] <= 25) {
                        flush = true;
                        //flushType = "Clubs";
                    } else if (26 <= hand[0] && hand[0] <= 38 && 26 <= hand[1] && hand[1] <= 38 && 26 <= hand[2] && hand[2] <= 38 && 26 <= hand[3] && hand[3] <= 38 && 26 <= hand[4] && hand[4] <= 38) {
                        flush = true;
                        //flushType = "Spades";
                    } else if (39 <= hand[0] && 39 <= hand[1] && 39 <= hand[2] && 39 <= hand[3] && 39 <= hand[4]) {
                        flush = true;
                        //flushType = "Diamonds";
                    } else {
                        flush = false;
                    }

                    // print the result
                    if (flush == true) {
                        handRank = 5;
                    } else {
                        handRank = 0;
                    }
                //check for a straight --------------------------------------------------------------------------------------------------------------------------------------
                // a straight will have sequential values
                //arrange the array
                Arrays.sort(hand);
                Arrays.sort(modHand);
                boolean straight = false;
                int highCard = 0;
                // for loop to check that all are sequentially in order of 1

                //System.out.println("card - should be ordered -  " + (i + 1) + " is " + wordCards[p1hand[i]]);
                if (modHand[1] - modHand[0] == 1 && modHand[2] - modHand[1] == 1 && modHand[3]-modHand[2]==1 && modHand[4]-modHand[3]==1) {
                    straight = true;
                    highCard = modHand[4];
                }
                else if (modHand[0] == 0 && modHand[1] == 9 && modHand[2]==10 && modHand[3] == 11 && modHand[4]==12) {
                    straight = true;
                    highCard = modHand[4];
                }
                else {
                    straight = false;

                }
                if (straight) {
                    //Stop it running through the ace
                    switch (highCard) {
                        case 0:
                            straight = false;
                            break;
                        case 1:
                            straight = false;
                            break;
                        case 2:
                            straight = false;
                            break;
                        case 3:
                            straight = false;
                            break;
                        case 4:
                            straight = true;
                            break;
                        case 5:
                            straight = true;
                            break;
                        case 6:
                            straight = true;
                            break;
                        case 7:
                            straight = true;
                            break;
                        case 8:
                            straight = true;
                            break;
                        case 9:
                            straight = true;
                            break;
                        case 10:
                            straight = true;
                            break;
                        case 11:
                            straight = true;
                            break;
                        case 12:
                            straight = true;
                            break;
                        default:
                            straight = false;
                            break;
                    }
                }
                //String outputHighCard;
                //outputHighCard = wordCards[modHand[4]];
                if (straight) {
                    handRank = 4;
                }

                if (straight && flush){
                    handRank = 8;
                }
                break;

            case 2:
                // there is a pair
                handRank = 1;
                break;
            case 3:    // triplets
                handRank = 2;
                break;
            case 4:
                handRank = 7;
        }

        //System.out.println("Player 1 You have - " + maxMatch + " " + (matchCard % 13 + 1) + "'s");
        return handRank;
    }

    // results array
    public String checkResult(int handRank) {
        String[] results = new String[9];
        results[0] = " Nothing";
        results[1] = " Pair";
        results[2] = " 3 of a kind";
        results[4] = " Straight";
        results[5] = " Flush";
        results[6] = " Full House";
        results[7] = " 4 of a kind";
        results[8] = " Straight Flush";
        return results[handRank];
    }
}


