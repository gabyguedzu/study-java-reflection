package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<Controle> controleClass1 = Controle.class;
		
		Controle controle = new Controle();
		
		Class<? extends Controle> controleClass2 = controle.getClass();
		
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
	}

}
