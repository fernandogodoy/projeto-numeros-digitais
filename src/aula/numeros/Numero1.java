package aula.numeros;

import aula.util.Constants;

public class Numero1 extends Constants implements Numero {

	@Override
	public StringBuilder getPrimeira() {
		return espacoTracoEspacoEspaco();
	}

	@Override
	public StringBuilder getSegundaLinha() {
		return espacoEspacoPipeEspaco();
	}

	@Override
	public StringBuilder getTerceira() {
		return espacoEspacoPipeEspaco();
	}

	@Override
	public StringBuilder getQuartaLinha() {
		return espacoEspacoPipeEspaco();
	}

	@Override
	public StringBuilder getQuintaLinha() {
		return espacoTracoTracoEspaco();
	}
}
