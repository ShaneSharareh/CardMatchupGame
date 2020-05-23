package com.example.cardmatchup;

import java.util.ArrayList;
import java.util.Collections;

public class GameController {
    private int score= 0;
    private boolean cardIsActive = true;
    private ArrayList<Integer> cards = new ArrayList<Integer>();
    GameController(){

        cards.add(R.drawable.ic_ace);
        cards.add(R.drawable.ic_eight);
        cards.add(R.drawable.ic_jacks);
        cards.add(R.drawable.ic_king);
        cards.add(R.drawable.ic_nine);
        cards.add(R.drawable.ic_queen);
        //add duplicates to end of list
        cards.addAll(cards);


    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public int getCards(int index){
        return cards.get(index);
    }

    public boolean compareCards(int card1, int card2){
        return (card1==card2)? true: false;
    }


    public int getScore() {
        return score;
    }

    public void incrementScore(){
        score++;
    }

    public void setCardActive(boolean status){
        cardIsActive = status;
    }

    public boolean getCardStatus(){
        return cardIsActive;
    }
}
