class Exercicio6 {
	 
	public static void main(String[] args) {
		
		int numero = 1000, soma = 0;

		while(numero > 0) {
			numero--;
			if(numero % 3 == 0 || numero % 5 == 0) {
				soma+=numero;
			}
		}
		
		System.out.println(" A Soma dos multiplos de 3 e 5 abaixo de 1000 = " + soma);
	}

}
