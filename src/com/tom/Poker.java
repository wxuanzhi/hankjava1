package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
//	int[]cards = new int[52];
//  Card[] cards = new Card[52];
	ArrayList bag = new ArrayList();	
	public Poker(){
		for (int i=0; i<52; i++){
//			cards[i] = i;
//			cards[i] = new Card(i);
			Card c = new Card(i);
			bag.add(c);
		}
		System.out.println(bag.size());
	}
	public void shuffle(){
		for(int i=0; i<52; i++){
			int r = new Random().nextInt(52);
			//a = cards[i];
			//b = cards[r];
//			Card tmp = cards[i];
//		    cards[i] = cards[r];
//	        cards[r] = tmp;
		}
	}
	public void print(){
		for(int i=0; i<52; i++){

			
//			System.out.print(cards[i].get() + " ");
			
			if(i%13 == 12)
			System.out.println();
			
		}
	}

}
