package controller;

public class ThreadVetor extends Thread
{
	private int n;
	private int num;
	private int vet[] = new int[n];
	
	public ThreadVetor(int num, int n)
	{
		this.num = num;
		this.n = n;;
	}
	
	public void percVetor()
	{
		
		this.vet = new int[n];
		double tempoIni = System.nanoTime();
		
		if(this.num == 1)
		{
			for(int i = 0; i < this.vet.length ; i++)
			{
				this.vet[i] = i;
			}
			double tempoFim = (System.nanoTime() - tempoIni) / Math.pow(10, 9);
			System.out.println("Segundos percorrido para o num 1 = " + tempoFim);
		}
		else if(this.num == 2)
		{
			for(int array : this.vet)
			{
				this.vet[array] = array;
			}
			double tempoFim = (System.nanoTime() - tempoIni) / Math.pow(10, 9);
			System.out.println("Segundos percorrido para o num 2 = " + tempoFim);
		}
		
		
		
	}
	
	
	
	

}
