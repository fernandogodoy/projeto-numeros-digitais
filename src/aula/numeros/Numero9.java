package aula.numeros;

import aula.util.Constants;

public class Numero9 extends Constants implements Numero {

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
		return espacoTracoTracoEspaco();
	}

	@Override
	public StringBuilder getQuartaLinha() {
		return espacoEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getQuintaLinha() {
		return espacoTracoTracoEspaco();
	}
}
