package com.tomspencerlondon.cards;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage: Deal hands cards");
      return;
    }

    List<String> list = new ArrayList<>(asList("a", "b", "c", "d"));

    Collections.sort(list);
    Collections.shuffle(list);
    Collections.reverse(list);
    Collections.rotate(list, 1);

    int numHands = Integer.parseInt(args[0]);
    int cardsPerHand = Integer.parseInt(args[1]);
    String[] suit = {"spades", "hearts", "diamonds", "clubs"};
    String[] rank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    List<String> deck = new ArrayList<>();

    for (int i = 0; i < suit.length; i++) {
      for (int j = 0; j < rank.length; j++) {
        deck.add(rank[j] + " of " + suit[i]);
      }
    }

    Collections.shuffle(deck);

    if (numHands * cardsPerHand > deck.size()) {
      System.out.println("Not enough cards.");
      return;
    }

    for (int i = 0; i < numHands; i++) {
      System.out.println(dealHand(deck, cardsPerHand));
    }
  }

  private static <E> List<E> dealHand(List<E> deck, int cardsPerHand) {
    int deckSize = deck.size();
    List<E> handView = deck.subList(deckSize - cardsPerHand, deckSize);
    List<E> hand = new ArrayList<>(handView);

    handView.clear();
    return hand;
  }

}
