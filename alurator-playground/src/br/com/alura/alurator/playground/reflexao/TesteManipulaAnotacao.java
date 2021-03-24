package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.anotacao.NomeTagXml;
import br.com.alura.alurator.playground.modelo.Produto;

public class TesteManipulaAnotacao {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Produto 1", 20.00, "Marca 1");
		Class<?> classe = produto.getClass();
		
		System.out.println(classe.getDeclaredAnnotation(NomeTagXml.class).value());
	}

}