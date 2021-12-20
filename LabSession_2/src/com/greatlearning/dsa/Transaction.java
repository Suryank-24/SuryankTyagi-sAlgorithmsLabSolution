package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of Transaction array : ");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		System.out.println("Enter the values of Transaction : ");
		/*
		 * transactions[0]..transactions[1]..transactions[2]..transactions[3]....transactions[size]
		 */
		for(int i =  0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no. of targets which are supposed to be achieved :");
		int targetNo = sc.nextInt();
		
		while(targetNo > 0) {
			int flag = 0;
			int target;
			System.out.println("Enter the target value : ");
			target = sc.nextInt();
			long sumOfTransactions = 0;
			
			for(int i = 0; i < size; i++) {
				sumOfTransactions = sumOfTransactions + transactions[i];
				
				if(sumOfTransactions >= target) 
				{
				System.out.println("Target achieved after "+(i+1)+" Transactions...");	
				flag = 1;
				break;
				}
			}
			if(flag == 0) 
			{
				System.out.println("Given target is not achieved.");
			}
			targetNo--;
		}		
		System.out.println("You have finished your target check...");
	}
}