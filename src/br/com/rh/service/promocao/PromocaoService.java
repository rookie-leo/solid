package br.com.rh.service.promocao;

import br.com.rh.ValidacaoException;
import br.com.rh.model.Cargo;
import br.com.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		
		if (Cargo.GERENTE == funcionario.getDadosPessoais().getCargo()) {
			throw new ValidacaoException("Gerente não pode ser promovido!");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta!");
		}
	}
	
}
