package br.com.alura.alurator;

import br.com.alura.alurator.conversor.ConversorXML;
import br.com.alura.alurator.ioc.ContainerIoc;
import br.com.alura.alurator.protocolo.Request;
import br.com.alura.alurator.reflexao.ManipuladorObjeto;
import br.com.alura.alurator.reflexao.Reflexao;
import br.com.alura.estoque.dao.ProdutoDao;
import br.com.alura.estoque.dao.ProdutoDaoMock;

public class Alurator {

	private String pacoteBase;
	private ContainerIoc container;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
		this.container = new ContainerIoc();
	}

	public Object executa(String url) throws NoSuchMethodException, SecurityException {

		Request request = new Request(url);

		String nomeControle = request.getNomeControle();
		String nomeMetodo = request.getNomeMetodo();

//		Object instanciaControle = new Reflexao()
//				.refleteClasse(pacoteBase + nomeControle)
//				.getConstrutorPadrao()
//				.invoca();
		
		Class<?> classeControle = new Reflexao().getClasse( pacoteBase + nomeControle );
		Object instanciaControle = container.getInstancia(classeControle);
		
		Object retorno = new ManipuladorObjeto(instanciaControle)
				.getMetodo(nomeMetodo)
				.invoca();
		
		System.out.println(retorno);
		
		retorno = new ConversorXML().converte(retorno);
		
		return retorno;
	}

	public void registra(Class<?> tipoFonte, Class<?> tipoDestino) {
		container.registra(tipoFonte, tipoDestino); 	
	}
}