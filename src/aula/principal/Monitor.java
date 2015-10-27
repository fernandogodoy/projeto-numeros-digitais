package aula.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula.numeros.ListNumeros;
import aula.numeros.Numero;
import aula.util.Constants;

/**
 * Classe que respons�vel pela impress�o do n�mero no formato d�gital
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
	 * M�todo respons�vel por executar a escrita dos n�mero no formato d�gital
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
	 * M�todo respons�vel por recuperar o texto de cada linha
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
		return "N�o existe uma linha a ser impressa para este numero";

	}

	/**
	 * M�todo que converte um char em um n�mero inteiro
	 * 
	 * @return Numero inteiro
	 */
	private Integer converteCharEmInteiro(char c) {
		Integer numero = null;
		try {
			numero = Integer.valueOf(String.valueOf(c));
		} catch (NumberFormatException e) {
			System.out.println("Valor n�o num�rico");
		}
		return numero;
	}

	/**
	 * Metodo respons�vel por capturar o valor digitado pelo usu�rio
	 * 
	 * @return Array contendo um char para cada n�mero digitado
	 */
	private char[] getNumerosDigitados() {
		System.out.println("Digite um n�mero: ");
		String valor = sc.next();
		return valor.toCharArray();
	}

}
