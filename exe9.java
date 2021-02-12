import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exe9 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int M = 0, N = 0;
		
		System.out.print("Informe a quantidade de linhas: ");
		M = scan.nextInt();
		System.out.print("Informe a quantidade de colunas: ");
		N = scan.nextInt();
		System.out.println("");
		
		int[][] matrizA = new int[M][N];
		int[][] matrizB = new int[M][N];
		int[][] matrizC = new int[M][N];
		int[][] matrizR = new int[M][N];
		
		
		Random valorRandom = new Random();
		
		System.out.println(" Matriz A ");
		for (int l = 0; l < matrizA.length; l++) {
			for (int c = 0; c < matrizA[l].length; c++) {
				matrizA[l][c] = valorRandom.nextInt(10);
				System.out.print(matrizA[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();

		
		System.out.println(" Matriz B ");
		for (int l = 0; l < matrizB.length; l++) {
			for (int c = 0; c < matrizB[l].length; c++) {
				matrizB[l][c] = valorRandom.nextInt(10);
				System.out.print(matrizB[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println(" Matriz C ");
		for (int l = 0; l < matrizC.length; l++) {
			for (int c = 0; c < matrizC[l].length; c++) {
				matrizC[l][c] = valorRandom.nextInt(10);
				System.out.print(matrizC[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(" Matriz Resultante ");
		for (int l = 0; l < matrizR.length; l++) {
			for (int c = 0; c < matrizR[l].length; c++) {
				matrizR[l][c] = matrizA[l][c] + matrizB[l][c] + matrizC[l][c];
				System.out.print(matrizR[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println();		
		
		scan.close();
	}

}
