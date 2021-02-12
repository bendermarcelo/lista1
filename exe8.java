import java.util.Scanner;

public class exe8 {
	
	public static void main(String[] args) {
		
		int numeros;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Quantos elementos quer armazenar em um vetor ? ");
		numeros = scan.nextInt();
		
		int[] vetor = new int[numeros];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor [%d] = ", i);
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Os elementos inversos do vetor são:");
		for (int i = vetor.length-1; i >= 0; i--) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
		
		
		scan.close();
		

	}

}
