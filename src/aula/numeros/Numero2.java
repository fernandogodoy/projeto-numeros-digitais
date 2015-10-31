package aula.numeros;

import aula.util.Constants;

public class Numero2 extends Constants implements Numero {

	@Override
	public StringBuilder getPrimeira() {
		return espacoTracoTracoEspaco();
	}

	@Override
	public StringBuilder getSegundaLinha() {
		return espacoEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getTerceira() {
		return espacoTracoTracoEspaco();
	}

	@Override
	public StringBuilder getQuartaLinha() {
		return pipeEspacoEspacoEspaco();
	}

	@Override
	public StringBuilder getQuintaLinha() {
		return espacoTracoTracoEspaco();
	}
}
