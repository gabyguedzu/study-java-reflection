package br.com.alura.alurator;

public class Alurator {
	
	private String pacoteBase;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}

	public Object executa(String url) {

		String[] split = url.replaceFirst("/", "").split("/");

		String nomeController = Character.toUpperCase(split[0].charAt(0)) +  split[0].substring(1) + "Controller";

		try {
			Class<?> classController = Class.forName(pacoteBase + nomeController);
			Object instanciaController =  classController.newInstance();
			
			System.out.println(instanciaController);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
