package aula.util;

/**
 * 
 * Constants representando Strings comuns utiliza pela aplicação
 */
public abstract class Constants {

	protected static final StringBuilder SB = new StringBuilder();

	public static final String ZERO = "0";
	public static final String UM = "1";
	public static final String DOIS = "2";
	public static final String TRES = "3";
	public static final String QUATRO = "4";
	public static final String CINCO = "5";
	public static final String SEIS = "6";
	public static final String SETE = "7";
	public static final String OITO = "8";
	public static final String NOVE = "9";
	public static final String QUEBRA_LINHA = "\n";
	public static final String ESPACO = " ";
	public static final String TRACO = "-";
	public static final String PIPE = "|";

	/**
	 * String formatada
	 * 
	 * @return " -- "
	 */
	protected static StringBuilder espacoTracoTracoEspaco() {
		return SB.append(ESPACO).append(TRACO).append(TRACO).append(ESPACO);
	}

	/**
	 * String formatada
	 * 
	 * @return "|  |"
	 */
	protected static StringBuilder pipeEspacoEspacoPipe() {
		return SB.append(PIPE).append(ESPACO).append(ESPACO).append(PIPE);
	}

	/**
	 * String formatada
	 * 
	 * @return "   |"
	 */
	protected static StringBuilder espacoEspacoEspacoPipe() {
		return SB.append(ESPACO).append(ESPACO).append(ESPACO).append(PIPE);
	}

	/**
	 * String formatada
	 * 
	 * @return "|   "
	 */
	protected static StringBuilder pipeEspacoEspacoEspaco() {
		return SB.append(PIPE).append(ESPACO).append(ESPACO).append(ESPACO);
	}

	/**
	 * String formatada
	 * 
	 * @return "--- "
	 */
	protected static StringBuilder tracoTracoTracoEspaco() {
		return SB.append(TRACO).append(TRACO).append(TRACO).append(ESPACO);
	}

	/**
	 * String formatada
	 * 
	 * @return " -  "
	 */
	protected static StringBuilder espacoTracoEspacoEspaco() {
		return SB.append(ESPACO).append(TRACO).append(ESPACO).append(ESPACO);
	}

	/**
	 * String formatada
	 * 
	 * @return "  | "
	 */
	protected static StringBuilder espacoEspacoPipeEspaco() {
		return SB.append(ESPACO).append(ESPACO).append(PIPE).append(ESPACO);
	}

}
