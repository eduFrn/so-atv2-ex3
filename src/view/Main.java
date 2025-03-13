package view;

import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000;i++) {
			vetor[i] = (int)(Math.random()*101);
		}
		
		ThreadVetor tv1 = new ThreadVetor(1, vetor);
		tv1.start();
		ThreadVetor tv2 = new ThreadVetor(2, vetor);
		tv2.start();

	}
}
