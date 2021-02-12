import java.util.Scanner;

class Exe2{
	public static void main(String[] args) {
	 
		int fat = 1, tempo, numero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite um numero para saber seu fatorial: ");
		numero = scan.nextInt();
		tempo = numero;
		do{
			fat = fat * numero;
			numero--;
	       }while(numero > 1);
		
		System.out.println("O fatorial de " + tempo + " = " + fat);
	    
		scan.close();
	}
}