/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

      
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
        }

       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a card value (1-13):");
        int userValue = input.nextInt();
        System.out.println("Enter a suit (Hearts, Diamonds, Spades, Clubs):");
        String userSuit = input.next();

        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

       
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        
        if (cardFound) {
            System.out.println("Card found in the magic hand!");
        } else {
            System.out.println("Card not found in the magic hand.");
        }

       
        input.close();
    }

}
