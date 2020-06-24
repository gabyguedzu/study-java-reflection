package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<SubControle> subControleClass = SubControle.class;
		
		Constructor<SubControle> constructorSubControle = subControleClass.getDeclaredConstructor();
		
		constructorSubControle.newInstance();
	}

}
