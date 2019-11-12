package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String suit;
        String value;
        Random ran = new Random(786);

        // 0 =2, 1 =3, 2 = 4,

        // create an array of strings - 0-51 for the deck
        int i;
        String[] wordCards = new String[52];
        int[] numericalCards = new int[52];

        //initialise numerical deck

        for (i = 0; i < 52; i++) {
            numericalCards[i] = i;
        }
        //initialise array values
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
        int j;
        int randomCard;
        int temp;
        // Shuffle deck
        for (j = 0; j < 100; j++) {
            randomCard = ran.nextInt(51);
            temp = numericalCards[randomCard];
            while (randomCard < 51) {
                numericalCards[randomCard] = numericalCards[randomCard + 1];
                randomCard++;
            }
            numericalCards[51] = temp;
        }

        //Show current state of Deck
        // for(i=0; i<10; i++){
        //    System.out.println(numericalCards[i]);
        //  }
        // play a game - two arrays one for player 1 and one for player 2
        int[] p1hand = new int[5];
       /* p1hand[0] = 0;
        p1hand[1] = 11;
        p1hand[2] = 12;
        p1hand[3] = 9;
        p1hand[4] = 10;*/
        int[] p2hand = new int[5];
        int k;


        i = 0;
        for (k = 0; k < 5; k++) {
            p1hand[k] = numericalCards[i];
            p2hand[k] = numericalCards[i + 1];
            i += 2;
        }


        //System.out.println("Hand 1 " + ", " + p1hand[0]+ ", " + p1hand[1]+ ", " +p1hand[2]+ ", " + p1hand[3]+ ", " + p1hand[4]);
        //System.out.println("Hand 2 " + ", " + p2hand[0] +", " +  p2hand[1]+", " +  p2hand[2]+", " +  p2hand[3] +", " + p2hand[4]);
        int handValue;

        //check pairs ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        int[] p1Moddedhand = new int[5];
        int[] p2Moddedhand = new int[5];
        for (i = 0; i < 5; i++) {
            p1Moddedhand[i] = (p1hand[i]) % 13;
            p2Moddedhand[i] = (p2hand[i]) % 13;
            // System.out.println(p1Moddedhand[i] + ",");//System.out.println(p2Moddedhand[i] + ",");
        }

        // Arrays.sort(p1Moddedhand);
        Arrays.sort(p2Moddedhand);

        System.out.println("Player 1: ");
        for (i = 0; i < 5; i++) {
            System.out.println("card " + (i + 1) + " is " + wordCards[p1hand[i]]);
        }

        System.out.println();
        System.out.println("Player 2: ");
       /* for (i = 0; i < 5; i++) {
            System.out.println("card " + (i + 1) + " is " + wordCards[p2hand[i]]);
        }*/
        // number of matching cards --
        int matchCount = 0;
        int maxMatch = 0;
        int checkCard;
        int matchCard = 0;
        int l;
        int h;
        //check each card for a pair or a triplet,
        for (h = 0; h < 5; h++) {
            matchCount = 0;
            checkCard = p1Moddedhand[h];
            for (l = 0; l < 5; l++) {

                if (checkCard == p1Moddedhand[l]) {
                    matchCount++;
                }
                if (matchCount > maxMatch) {
                    maxMatch = matchCount;
                    matchCard = p1hand[l];
                }
            }

        }
        System.out.println("Player 1 You have - " + maxMatch + " " + (matchCard % 13 + 1) + "'s");
        //check for a flush-----------------------------------------------------------------------------------------------------------------------------------
        boolean flush = false;
        String flushType = "";
        // check ranges to find the flush
        if (p1hand[0] <= 12 && p1hand[1] <= 12 && p1hand[2] <= 12 && p1hand[3] <= 12 && p1hand[4] <= 12) {
            flush = true;
            flushType = "Hearts";
        } else if (13 <= p1hand[0] && p1hand[0] <= 25 && 13 <= p1hand[1] && p1hand[1] <= 25 && 13 <= p1hand[2] && p1hand[2] <= 25 && 13 <= p1hand[3] && p1hand[3] <= 25 && 13 <= p1hand[4] && p1hand[4] <= 25) {
            flush = true;
            flushType = "Clubs";
        } else if (26 <= p1hand[0] && p1hand[0] <= 38 && 26 <= p1hand[1] && p1hand[1] <= 38 && 26 <= p1hand[2] && p1hand[2] <= 38 && 26 <= p1hand[3] && p1hand[3] <= 38 && 26 <= p1hand[4] && p1hand[4] <= 38) {
            flush = true;
            flushType = "Spades";
        } else if (39 <= p1hand[0] && 39 <= p1hand[1] && 39 <= p1hand[2] && 39 <= p1hand[3] && 39 <= p1hand[4]) {
            flush = true;
            flushType = "Diamonds";
        } else {
            flush = false;
        }

        // print the result
        if (flush == true) {
            System.out.println("You have a flush of " + flushType);
        } else {
            System.out.println("No flush");
        }


        //check for a straight --------------------------------------------------------------------------------------------------------------------------------------
        // a straight will have sequential values
        //arrange the array
        Arrays.sort(p1hand);
        Arrays.sort(p1Moddedhand);
        boolean straight = false;
        int highCard = 0;
        // for loop to check that all are sequentially in order of 1

            //System.out.println("card - should be ordered -  " + (i + 1) + " is " + wordCards[p1hand[i]]);
            if (p1Moddedhand[1] - p1Moddedhand[0] == 1 && p1Moddedhand[2] - p1Moddedhand[1] == 1 && p1Moddedhand[3]-p1Moddedhand[2]==1 && p1Moddedhand[4]-p1Moddedhand[3]==1) {
                straight = true;
                highCard = p1Moddedhand[4];
            }
            else if (p1Moddedhand[0] == 0 && p1Moddedhand[1] == 9 && p1Moddedhand[2]==10 && p1Moddedhand[3] == 11 && p1Moddedhand[4]==12) {
            straight = true;
            highCard = p1Moddedhand[4];
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
            String outputHighCard;
            outputHighCard = wordCards[p1Moddedhand[4]];
            if (straight) {
                System.out.println("You have a straight with a high card of the " + outputHighCard);
            } else {
                System.out.println("No Straight");
            }


    }
}
