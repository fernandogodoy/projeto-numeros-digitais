package aula.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula.numeros.ListNumeros;
import aula.numeros.Numero;
import aula.util.Constants;

/**
 * Classe que responsável pela impressão do número no formato dígital
 */
public class Monitor {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Monitor monitor = new Monitor();

		for (int x = 0; x < 10; x++) {
			List<Numero> numeros = new ArrayList<>();
			char[] numerosDigitados = monitor.getNumerosDigitados();
			for (char c : numerosDigitados) {
				Integer numero = monitor.converteCharEmInteiro(c);
				if (numero != null)
					numeros.add(ListNumeros.getNumero(numero));
			}
			monitor.escreverNumerosDigitais(numeros);
		}
	}

	/**
	 * Método responsável por executar a escrita dos número no formato dígital
	 */
	private void escreverNumerosDigitais(List<Numero> numeros) {
		StringBuilder sb = new StringBuilder();
		for (int numeroLinha = 1; numeroLinha <= 5; numeroLinha++) {
			for (Numero num : numeros) {
				sb.append(printLine(num, numeroLinha));
				sb.append(Constants.STRING_VAZIA);
			}
			sb.append(Constants.QUEBRA_LINHA);
		}
		System.out.println(sb.toString());
	}

	/**
	 * Método responsável por recuperar o texto de cada linha
	 * 
	 * @return Texto existente em cada linha a ser impressa
	 */
	private String printLine(Numero numero, Integer linha) {
		switch (linha) {
		case 1:
			return numero.getPrimeira();
		case 2:
			return numero.getSegundaLinha();
		case 3:
			return numero.getTerceira();
		case 4:
			return numero.getQuartaLinha();
		case 5:
			return numero.getQuintaLinha();
		}
		return "Não existe uma linha a ser impressa para este numero";

	}

	/**
	 * Método que converte um char em um número inteiro
	 * 
	 * @return Numero inteiro
	 */
	private Integer converteCharEmInteiro(char c) {
		Integer numero = null;
		try {
			numero = Integer.valueOf(String.valueOf(c));
		} catch (NumberFormatException e) {
			System.out.println("Valor não numérico");
		}
		return numero;
	}

	/**
	 * Metodo responsável por capturar o valor digitado pelo usuário
	 * 
	 * @return Array contendo um char para cada número digitado
	 */
	private char[] getNumerosDigitados() {
		System.out.println("Digite um número: ");
		String valor = sc.next();
		return valor.toCharArray();
	}

}
