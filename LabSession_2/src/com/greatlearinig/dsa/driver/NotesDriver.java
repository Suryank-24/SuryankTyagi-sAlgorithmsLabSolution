package com.greatlearinig.dsa.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplemenatation;
import com.greatlearning.service.NotesCount;

public class NotesDriver {

	public static void main(String[] args) {
		MergeSortImplemenatation msi = new MergeSortImplemenatation();
		NotesCount notesCount = new NotesCount();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currrency denomination :");

		size  = sc.nextInt();
		System.out.println("Enter the Currency denomination Values : ");
		
		int noteDenomination[] = new int[size];
		
		for(int i = 0; i < size ; i++) {
			noteDenomination[i] = sc.nextInt();;
		}
		
		System.out.println("Please enter the amount you want to pay : ");
		int amt = sc.nextInt();
		System.out.println();
		msi.mergeSort(noteDenomination, 0, noteDenomination.length - 1);
		
		for(int i = 0; i < noteDenomination.length; i++) {
			System.out.println(noteDenomination[i]+" ");
		}
		notesCount.implementNotesCount(noteDenomination, amt);
	}
}