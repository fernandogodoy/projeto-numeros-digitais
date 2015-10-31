package aula.numeros;

import aula.util.Constants;

public class Numero0 extends Constants implements Numero {

	@Override
	public StringBuilder getPrimeira() {
		return espacoTracoTracoEspaco();
	}

	@Override
	public StringBuilder getSegundaLinha() {
		return pipeEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getTerceira() {
		return pipeEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getQuartaLinha() {
		return pipeEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getQuintaLinha() {
		return espacoTracoTracoEspaco();
	}
}
