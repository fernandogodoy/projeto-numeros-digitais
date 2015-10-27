package aula.numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Repositório contendo os números necesários para impressão
 * 
 */
public class ListNumeros {

	private static final List<Numero> LISTA = new ArrayList<Numero>(Arrays.asList(arrayNum()));

	/**
	 * Responsável por pegar a instância do numero desejado
	 * 
	 * @return Instância do numero existente na posição desejada
	 */
	public static Numero getNumero(Integer numero) {
		return LISTA.get(numero);
	}

	/**
	 * Array contendo cada instância do número ordenada pela posição
	 * 
	 * @return Instância do numero desejado que se encontra na posição de ordem
	 */
	private static final Numero[] arrayNum() {
		return new Numero[] { new Numero0(), new Numero1(), new Numero2(), new Numero3(), new Numero4(), new Numero5(),
				new Numero6(), new Numero7(), new Numero8(), new Numero9() };
	}
}
