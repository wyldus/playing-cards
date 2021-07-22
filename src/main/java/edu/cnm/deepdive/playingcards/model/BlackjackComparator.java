package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.Comparator;

public class BlackjackComparator implements Comparator<Hand<Card>> {

  private int hand = 0;
  private int aces = 0;

  @Override
  public int compare(Hand<Card> o1, Hand<Card> o2) {


    int value = hand;
    if (hand > 21) {
      value = 0;
    } else if (hand <= 11 && aces > 0) {
      value += 10;
    }
    return value;

  }
}
