package aula.numeros;

import aula.util.Constants;

public class Numero6 extends Constants implements Numero {

	@Override
	public StringBuilder getPrimeira() {
		return espacoTracoTracoEspaco();
	}

	@Override
	public StringBuilder getSegundaLinha() {
		return pipeEspacoEspacoEspaco();
	}

	@Override
	public StringBuilder getTerceira() {
		return espacoTracoTracoEspaco();
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
