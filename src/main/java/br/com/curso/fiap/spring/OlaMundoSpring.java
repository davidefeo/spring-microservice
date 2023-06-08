package br.com.curso.fiap.spring;

public class OlaMundoSpring {
	
	private final Long id;
	private final String mensagem;
	
	public OlaMundoSpring(Long id, String mensagem) {
		this.id = id;
		this.mensagem = mensagem;
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

}
