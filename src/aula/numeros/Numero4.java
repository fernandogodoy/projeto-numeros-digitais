package aula.numeros;

import aula.util.Constants;

public class Numero4 extends Constants implements Numero {

	@Override
	public StringBuilder getPrimeira() {
		return pipeEspacoEspacoPipe();
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
		return espacoEspacoEspacoPipe();
	}

	@Override
	public StringBuilder getQuintaLinha() {
		return espacoEspacoEspacoPipe();
	}
}
