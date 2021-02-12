import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class exe10 {
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	int quantLinhasA, quantColunasA, quantLinhasB, quantColunasB, linhaA, colunaA, linhaB, colunaB, aux = 0;

	quantLinhasA = Integer.parseInt(JOptionPane("[Matriz A] Digite a quantidade de Linhas:"));
	quantColunasA = Integer.parseInt(JOptionPane("[Matriz A] Digite a quantidade de Colunas:"));

	quantLinhasB = Integer.parseInt(JOptionPane("[Matriz B] Digite a quantidade de Linhas:"));
	quantColunasB = Integer.parseInt(JOptionPane("[Matriz B] Digite a quantidade de Colunas:"));

	int matrizA[][] = new int[quantLinhasA][quantColunasA];
	int matrizB[][] = new int[quantLinhasB][quantColunasB];
	int resultante[][] = new int[quantLinhasA][quantColunasB];

	for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {
		for (colunaA = 0; colunaA < quantColunasA; colunaA++) {
			matrizA[linhaA][colunaA] = Integer.parseInt(JOptionPane("[Matriz A] Informe o valor da  "+ linhaA + " coluna " + colunaA + " :"));
		}
	}

	for (linhaB = 0; linhaB < quantLinhasB; linhaB++) {
		for (colunaB = 0; colunaB < quantColunasB; colunaB++) {
			matrizB[linhaB][colunaB] = Integer.parseInt(JOptionPane("[Matriz B] Informe o valor da  "+ linhaB + " coluna " + colunaB + " :"));

			for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {
				for (colunaA = 0; colunaA < quantColunasB; colunaA++) {
					for (int k = 0; k < quantLinhasB; k++) {
						aux = aux + matrizA[linhaA][k]* matrizB[k][colunaA];
					}

					resultante[linhaA][colunaA] = aux;
					aux = 0;
				}
			}
		}
	}

	System.out.println("Resultante:-");

	for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {
		for (colunaA = 0; colunaA < quantColunasB; colunaA++)
			System.out.print(resultante[linhaA][colunaA] + "\t");

		System.out.print("\n");
	}
}

private static String JOptionPane(String string) {
	return null;
}
}