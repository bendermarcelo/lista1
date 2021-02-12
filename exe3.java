import java.util.Scanner;

class Exe3{

	public static void main(String[] args){

		int soma = 0, N ;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		N = scan.nextInt();

		for(int i = N; i >= 0; i--){
			if (i !=N && i % 2 == 0){
				soma+= i;
			}
		}

		System.out.println("A soma dos numeros pares menores que " + N + " e " + soma);

		scan.close();
	}
}