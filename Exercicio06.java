package senaiprojetos;

import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Crie um array de inteiros com 5 elementos e verifique se um determinado valor
		 * fornecido pelo usuário está presente no array. Imprima "Encontrado" ou
		 * "Não encontrado" com base na verificação.
		 */

		int valorDigitado = 0;

		int[] numeros = new int[5];
		numeros[0] = 20;
		numeros[1] = 30;
		numeros[2] = 40;
		numeros[3] = 90;
		numeros[4] = 200;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para obter a verificação : ");

		try {
			
		valorDigitado = sc.nextInt();
		
		} catch(Exception e) {
			
			if(valorDigitado == 0 ) {
				System.out.println("Você inseriu um valor inválido");
			}
			
		}
		
		for (int i = 0; i < numeros.length; i++) {

			if(valorDigitado == numeros[i]) {
				System.out.println("O valor foi encontrado!!");
			} else {
				System.out.println("O valor não foi encontrado!!");

			}

		}
		sc.close();
	}

}
