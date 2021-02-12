import java.util.Scanner;


class Exe1{
 
	public static void main(String[] args){

		int a, b;
		int resultado;
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o numero a: ");
		a = scan.nextInt();
		System.out.print("Informe o numero b: ");
		b = scan.nextInt();

		resultado = (int)(Math.pow(a, b));

		System.out.printf("Base = %d \nExpoente = %d \nPotencia = %d ", a, b, resultado);

		scan.close();
	}
}