package aula.numeros;

/**
 * 
 * Define os métodos necesários para a impressão dos números no formato digital
 * Cada numero será representado por 4 linhas e 5 colunas
 */
public interface Numero {
	
	StringBuilder SB = new StringBuilder();

	/**
	 * Texto da primeira linha
	 * 
	 * @return Texto a ser impresso
	 */
	StringBuilder getPrimeira();

	/**
	 * Texto da segunda linha
	 * 
	 * @return Texto a ser impresso
	 */
	StringBuilder getSegundaLinha();

	/**
	 * Texto da terceira linha
	 * 
	 * @return Texto a ser impresso
	 */
	StringBuilder getTerceira();

	/**
	 * Texto da quarta linha
	 * 
	 * @return Texto a ser impresso
	 */
	StringBuilder getQuartaLinha();

	/**
	 * Texto da quinta linha
	 * 
	 * @return Texto a ser impresso
	 */
	StringBuilder getQuintaLinha();

}
