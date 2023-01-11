package com;

import java.util.Arrays;

public class InsertionSort {
	
	/**
	 * main method
	 * Assigning all words as sting
	 * comparing words one by one
	 * then prints the output in sorted manner
	 */
	
	public static void main(String[] args) {
		
		String[] words = {"rekha", "arun", "dog", "chethan"};
		for(int i = 1; i <= words.length; i++) {
			
			String temp = words[i];
			int j = i - 1;
			while(j >= 0) {
				if(temp.compareTo(words[j]) > 0) {
					
					break;
				}
				words[j+1] = words[j];
				j--;
			}
			words[j+1] = temp;
			System.out.println(Arrays.toString(words));
		}
		System.out.println(Arrays.toString(words));
	}
}
