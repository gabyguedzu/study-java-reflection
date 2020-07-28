package br.com.alura.alurator.protocolo;

public class Request {

	private String nomeControle;
	private String nomeMetodo;

	public Request(String url) {
		String[] split = url.replaceFirst("/", "").split("/");
		
		nomeControle = Character.toUpperCase(split[0].charAt(0)) + split[0].substring(1) + "Controller";
		
		nomeMetodo = split[1];
	}

	public String getNomeControle() {
		return nomeControle;
	}
	
	public String getNomeMetodo() {
		return nomeMetodo;
	}
}
