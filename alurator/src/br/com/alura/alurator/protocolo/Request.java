package br.com.alura.alurator.protocolo;

public class Request {

	private String nomeControle;

	public Request(String url) {
		String[] split = url.replaceFirst("/", "").split("/");

		nomeControle = Character.toUpperCase(split[0].charAt(0)) + split[0].substring(1) + "Controller";
	}

	public String getNomeControle() {
		return nomeControle;
	}
}
