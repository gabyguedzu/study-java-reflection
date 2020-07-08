package br.com.alura.alurator.reflexao;

import java.lang.reflect.Constructor;

public class ManipuladorDeClasse {

	private Class<?> classe;

	public ManipuladorDeClasse(Class<?> classe) {
		this.classe = classe;
	}

	public ManipuladorConstrutor getConstrutorPadrao() {
		
		try {
			Constructor<?> construtorPadrao = classe.getDeclaredConstructor();
			
			return new ManipuladorConstrutor(construtorPadrao);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
