package com.tom;

import java.util.Random;

public class PokerGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowers = {0x2663, 0x2666, 0x2665, 0x2660};
		int nums[] = new int[5];
		nums[0] = 77;
		nums[4] = 98;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		
		for (int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 9830;
		System.out.println(f);
		
		Random random = new Random();
		int poker = random.nextInt(13) + 1;
		int flower = random.nextInt(4);
		System.out.print(poker);
		char c = 0;
		switch(flower){
		case 0 :
			c= 'S';
			break;
		case 1 :
			c = 'H';
			break;
		case 2 :
			c = 'D';
			break;
		case 3 :
			c = 'C';
			break;
		}
		System.out.println(c);
	
	}
}

