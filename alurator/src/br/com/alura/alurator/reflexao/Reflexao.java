package br.com.alura.alurator.reflexao;

public class Reflexao {

	public ManipuladorDeClasse refleteClasse(String fqn) {

		Class<?> classe = getClasse(fqn);

		return new ManipuladorDeClasse(classe);

	}

	public Class<?> getClasse(String fqn) {

		try {
			Class<?> classe = Class.forName(fqn);

			return classe;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
