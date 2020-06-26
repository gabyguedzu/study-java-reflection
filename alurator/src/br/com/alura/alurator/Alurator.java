package br.com.alura.alurator;

import java.lang.reflect.InvocationTargetException;

public class Alurator {
	
	private String pacoteBase;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}

	public Object executa(String url) {

		String[] split = url.replaceFirst("/", "").split("/");

		String nomeController = Character.toUpperCase(split[0].charAt(0)) + split[0].substring(1) + "Controller";

		try {
			Class<?> classController = Class.forName(pacoteBase + nomeController);
			
			Object instanciaController = classController.getDeclaredConstructor().newInstance();			
			System.out.println(instanciaController);
			return null;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | 
				  NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		    throw new RuntimeException("Erro no construtor!", e.getTargetException());
		}
	}
}