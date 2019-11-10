package com.train06almostincreasingdequence.app;
/*
 * Given a sequence of integers as an array, determine whether it
 * is possible to obtain a strictly increasing sequence by removing
 * no more than one element from the array.
 * 
 * Note: sequence a0, a1, ..., an is considered to be a strictly 
 * increasing if a0 < a1 < ... < an. Sequence containing only one 
 * element is also considered to be strictly increasing.
 * 
 * [execution time limit] 3 seconds (java)
 * [input] array.integer sequence
 * [output] boolean
 * Guaranteed constraints:
 * 		2 <= sequence.length <= 105,
 * 		-105 <= sequence[i] <= 105.
 * 
 */
public class almostIncreasingSequence {
	public static void main(String[] args) {
		int[] myArray1 = {1, 3, 2, 1};
		System.out.println(almostIncreasingSequence(myArray1));
		int[] myArray2 = {10, 1, 2, 3, 4, 5};
		System.out.println(almostIncreasingSequence(myArray2));
	}
	
	public static boolean almostIncreasingSequence(int[] sequence) {
	    int times = 0;
	    int max = -100000;
	    int secondMax = -100000;
	    for(int i = 0; i < sequence.length; i++){
	        if(sequence[i]>max){
	            secondMax = max;
	            max = sequence[i];
	        }
	        else if(sequence[i]>secondMax){
	            max = sequence[i];
	            times++;
	        }
	        else{ 
	            times++;
	        }
	    }
	    return times < 2;
	}
}
