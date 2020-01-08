/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

/**
 *
 * @author pydch
 */
public class DeckOfCards {

    public static void main(String[] args){
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        //Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        
        //Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            //Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //Display the first #n cards
        for (int i = 0; i < 2; i++) {
            String suit = suits[deck[i]/13];
            String rank = ranks[deck[i]%13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}


