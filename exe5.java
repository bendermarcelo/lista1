import java.util.Scanner;

class Exe5{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mdc, temp, numero1, numero2;
		
		System.out.print("Informe o primeiro numero: ");
		numero1 = scan.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		numero2 = scan.nextInt();

		if(numero2 > numero1) {
			temp = numero1;
		} else {
			temp = numero2;
		}
		
		while(numero1 % temp != 0 || numero2 % temp != 0){
			temp--;
		}
		mdc = temp;
		System.out.print("MAXIMO DIVISOR COMUM É = " + mdc);
		
		scan.close();
	}
}
