package org.example.D01;

public class Cards {
    public static void main(String[] args) {
        String input = "2H 3D 5S 9C KD 2C 3H 4S 8C AH";
        String[] cards = input.split(" ");
        for (String card : cards) {
            String rank = card.substring(0, card.length() - 1);
            String suit = card.substring(card.length() - 1);
            String rankWord = "";
            String suitWord = "";
            if (rank.equals("2")) rankWord = "duice";
            else if (rank.equals("3")) rankWord = "three";
            else if (rank.equals("4")) rankWord = "four";
            else if (rank.equals("5")) rankWord = "five";
            else if (rank.equals("6")) rankWord = "six";
            else if (rank.equals("7")) rankWord = "seven";
            else if (rank.equals("8")) rankWord = "eight";
            else if (rank.equals("9")) rankWord = "nine";
            else if (rank.equals("10")) rankWord = "ten";
            else if (rank.equals("J")) rankWord = "jack";
            else if (rank.equals("Q")) rankWord = "queen";
            else if (rank.equals("K")) rankWord = "king";
            else if (rank.equals("A")) rankWord = "ace";

            if (suit.equals("H")) suitWord = "heart";
            else if (suit.equals("D")) suitWord = "diamond";
            else if (suit.equals("S")) suitWord = "spread";
            else if (suit.equals("C")) suitWord = "club";

            System.out.println(rankWord + " of " + suitWord);
        }
    }
}
