package com.arrays.examples;

/**
 * 
 * @author Sujit Desai
 * 
 * Assignment is: Find out middle index where sum of both ends are equal
 *  without using predefine methods.
 * Description: You are given an array of numbers. 
 * Find out the array index or position where sum of numbers preceding the index
 *  is equals to sum of numbers succeeding the index.
 
	Example:
	int[] num = { 2, 4, 4, 5, 4, 1 };
	 
	All the best!! Thanks, Bijay
	
	This Class will find the middle index, if possible 
 */
public class PlayWithArrays {
	
	public static void main(String[] args){
		int middleIndex = -1;
		boolean sumEqual = false;
		int leftSum = 0;
		int rightSum = 0;
		int refIdx = -1;
		boolean changeOfDirection = false;
		
//		int[] num = { 10, 2, 4, 4, 5, 4, 1, 2, 3, 5 };
//		int[] num = { 25, 50, 80, 5, 80, 80 };
		int[] num = { 10, 10, 10 };
		
		if(num.length == 1){
			middleIndex = 0;
			sumEqual = true;
			leftSum = rightSum = num[0];
			refIdx = 0;
		}else{
			refIdx = (num.length)/2;
		}
		
		while((refIdx > -1) && (refIdx < num.length) && (!sumEqual)){
			leftSum = 0;
			rightSum = 0;
			
			for(int i=0; i<refIdx; i++){
				leftSum += num[i];
			}
			System.out.println("The middleIndex is " + middleIndex + " and leftSum = " + leftSum);
			for(int i=refIdx; i<num.length; i++){
				rightSum += num[i];
			}
			System.out.println("The middleIndex is " + middleIndex + " and rightSum = " + rightSum);
			
			if(leftSum == rightSum){
				sumEqual = true;
				middleIndex = refIdx;
			}else if(leftSum < rightSum){
				sumEqual = false;
				refIdx++;
				middleIndex = -1;
				if (!changeOfDirection) {
					System.out.println("BEFORE leftSum < rightSum changeOfDirection = " + changeOfDirection);
					changeOfDirection = true;
				} else {
					System.out.println("AFTER leftSum < rightSum changeOfDirection = " + changeOfDirection);
					break;
				}
			}else if(leftSum > rightSum){
				sumEqual = false;
				refIdx--;
				middleIndex = -1;
				if(!changeOfDirection){
					System.out.println("BEFORE leftSum > rightSum changeOfDirection = " + changeOfDirection);
					changeOfDirection = true;
				} else {
					System.out.println("AFTER leftSum > rightSum changeOfDirection = " + changeOfDirection);
					break;
				}
			}
		} // end while...
		
		if(middleIndex != -1){
			System.out.println("The middleIndex is " + middleIndex + " and the Left and Right Sum = " + leftSum);
		}else {
			System.out.println("The middleIndex is NOT possible for the given integer array!");
		}
			
	}
}
