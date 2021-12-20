package com.greatlearning.service;

public class NotesCount {
	public void implementNotesCount(int[] notes, int amount) {
		int[] noteCounter = new int[notes.length];
		try
		{
			for(int i = 0; i < notes.length; i++) {
				if(amount > notes[i])
				{
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if(amount > 0)
			{
				System.out.println("Exact amount cannot be given with the highest denomination.");
			}
			else
			{
				System.out.println("Your payment in order to give minimum no. of notes will be : ");
					for(int i = 0; i < notes.length; i++) {
						if(noteCounter[i] != 0) 
						{
							System.out.println(notes[i]+ ":"+ noteCounter[i]);
						}
					}
				}
			}	
		catch(ArithmeticException ae)
		{
			System.out.println(ae +" Notes of denomination 0 is invalid...");
		}
	}
}