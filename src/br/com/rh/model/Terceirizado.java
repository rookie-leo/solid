package br.com.rh.model;

public class Terceirizado {

	private DadosPessoais dadosPessoais;
	private String empresa;
	
	public Terceirizado(DadosPessoais dados) {
		this.dadosPessoais = dados;
	}
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
