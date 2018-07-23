package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um cnpj.
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na busca de dados.
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

}
