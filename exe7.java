import java.util.Scanner;

public class exe7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int decimal, resto = 0, opcao;
		String binario = "", octal = "", hexadecimal = "";
		
		System.out.print("Digite um numero decimal: ");
		decimal = scan.nextInt();


			System.out.println("(1 - Binario | 2 - Octal | 3 - Hexadecimal)");
			System.out.print("Digite uma das opções: ");
			opcao = scan.nextInt();
			System.out.println("Opção escolhida foi \"" + opcao + "\"!");
			
			switch(opcao){
				case 1: 
					while(decimal != 0) {
						resto = decimal % 2;
						binario = resto + binario;
						decimal /= 2;
					}
					System.out.print("Binario: " + binario);
				break;
					
		
                case 2: 
					while(decimal != 0) {
						resto = decimal % 8;
						char charOc = 0;
						
						if(resto <= 8 && resto >= 0) {
							charOc = (char)(resto + '0');
						} 
						octal = charOc + octal;
						decimal = decimal / 8;
					}
				System.out.print("Octal: " + octal);
                break;
                
				case 3: 
					while(decimal != 0) {
						resto = decimal % 16;
						char hexChar;
						
						if(resto <= 9 && resto >= 0) {
							hexChar = (char)(resto + '0');
						} else {
							hexChar = (char)(resto - 10 + 'A');
						}
						hexadecimal = hexChar + hexadecimal;
						decimal = decimal / 16;
					}
					System.out.println("Hexadecimal: " + hexadecimal);
                break;
                	
			default: System.out.println("Opcao invalida");
			}

		scan.close();
	}
}
	
