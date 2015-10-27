package aula.numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reposit�rio contendo os n�meros neces�rios para impress�o
 * 
 */
public class ListNumeros {

	private static final List<Numero> LISTA = new ArrayList<Numero>(Arrays.asList(arrayNum()));

	/**
	 * Respons�vel por pegar a inst�ncia do numero desejado
	 * 
	 * @return Inst�ncia do numero existente na posi��o desejada
	 */
	public static Numero getNumero(Integer numero) {
		return LISTA.get(numero);
	}

	/**
	 * Array contendo cada inst�ncia do n�mero ordenada pela posi��o
	 * 
	 * @return Inst�ncia do numero desejado que se encontra na posi��o de ordem
	 */
	private static final Numero[] arrayNum() {
		return new Numero[] { new Numero0(), new Numero1(), new Numero2(), new Numero3(), new Numero4(), new Numero5(),
				new Numero6(), new Numero7(), new Numero8(), new Numero9() };
	}
}
