package view;

import controller.ThreadVetor;

public class Main 
{
	public static void main(String[] args)
	{
		ThreadVetor thread1 = new ThreadVetor(1, 1000);
		ThreadVetor thread2 = new ThreadVetor(2, 1000);
		
		thread1.percVetor();
		thread2.percVetor();
		
		
		
	}
}
