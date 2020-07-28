package br.com.alura.alurator.reflexao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ManipuladorMetodo {

	private Object instancia;
	private Method metodo;

	public ManipuladorMetodo(Object instancia, Method metodo) {
		this.instancia = instancia;
		this.metodo = metodo;
	}
	
	public Object invoca() {
		
		try {
			return metodo.invoke(instancia);
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro dentro do método " + e);
		}
	}
}
