package controller;

public class ThreadVetor extends Thread{
	
	private int tipo;
	private int[] vetor;
	
	public ThreadVetor(int tipo, int[] vetor) {
		this.tipo = tipo;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		rodaVetor();
	}
	
	public void rodaVetor() {
		
		double inicio = System.nanoTime();
		
		if(tipo % 2 == 0) {
			for (int i = 0; i < vetor.length; i++) {}
		}else {
			for (int i : vetor) {}
		}
		
		double fim = System.nanoTime();

		double total = (fim-inicio) / Math.pow(10, 9);
		
		System.out.println("Tempo do vetor usando "+(tipo % 2 == 0 ? "for e vetor.length" : "foreach")+" em segundos: "+total+"s.");
	}

}
