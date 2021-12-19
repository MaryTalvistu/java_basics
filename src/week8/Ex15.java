package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Ex15 {
    public static void main(String[] args) {
        // write some test code here
        Hand hand = new Hand();

        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(4, Card.CLUBS));
        hand.add(new Card(2, Card.DIAMONDS));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(7, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));

        hand.sortAgainstSuit();

        hand.print();
    }

    public static class Card implements Comparable<Card> {

        /*
         * These are static constant variables. These variables can be used inside and outside
         * of this class like, for example, Card.CLUBS
         */
        public static final int SPADES = 0;
        public static final int DIAMONDS = 1;
        public static final int HEARTS = 2;
        public static final int CLUBS = 3;
        /*
         * To make printing easier, Card-class also has string arrays for suits and values.
         * SUITS[suit] is a string representation of the suit (Clubs, Diamonds, Hearts, Spades)
         * VALUES[value] is an abbreviation of the card's value (A, J, Q, K, [2..10]).
         */
        public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
        public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        private final int value;
        private final int suit;

        public Card(int value, int suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public int compareTo(Card card) {

            if (this.value != card.getValue()) {
                return this.value - card.getValue();
            } else {
                return this.suit - card.getSuit();
            }
        }

        @Override
        public String toString() {
            return VALUES[value] + " of " + SUITS[suit];
        }

        public int getValue() {
            return value;
        }

        public int getSuit() {
            return suit;
        }

    }

    public static class Hand implements Comparable <Hand>{

        private final List<Card> hand;

        public Hand() {
            this.hand = new ArrayList<Card>();
        }

        //this method adds card to the arraylist hand
        public void add(Card card) {
            this.hand.add(card);
        }

        //this method prints out the card
        public void print() {
            for (Card card : this.hand) {
                System.out.println(card);
            }
        }

        public void sort() {
            Collections.sort(this.hand);
        }


        @Override
        public int compareTo(Hand hh){
            int sum1 = 0;
            for (Card card : hh.hand){
                sum1 += card.getValue();
            }

            int sum2 = 0;
            for (Card card : this.hand){
                sum2 += card.getValue();
            }

            return sum2 - sum1;
        }

        public void sortAgainstSuit(){
            SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
            Collections.sort(this.hand, suitSorter);
        }
    }

    public static class SortAgainstSuit implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            return card1.getSuit() - card2.getSuit();
        }
    }

    public static class SortAgainstSuitAndValue implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            if (card1.getSuit() == card2.getSuit()){
                return card1.getValue() - card2.getValue();
            } else {
                return card1.getSuit() - card2.getSuit();
            }
        }
    }
}
