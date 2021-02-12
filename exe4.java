import java.util.Scanner;

class Ex4{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe o valor do A: ");
		double a = entrada.nextDouble();

		System.out.print("informe o valor do B: ");
		double b = entrada.nextDouble();
		
		System.out.print("informe o valor do C: ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("\nO valor do delta é " + delta);
		System.out.println("");
		
		if(delta<0) {
			System.out.println("A equação não possui raízes reais");
		} else if(delta == 0) {
			System.out.println("A equação de segundo grau possui uma raíz real");
			System.out.println("\nO valor do X1 é "  + x1);
			System.out.println("O valor do X2 é " + x2);
		} else {
			System.out.println("A equação de segundo grau possui duas raízes reais");
			System.out.println("\nO valor do X1 é "  + x1);
			System.out.println("O valor do X2 é " + x2);
		}
		
		entrada.close();
	}
}