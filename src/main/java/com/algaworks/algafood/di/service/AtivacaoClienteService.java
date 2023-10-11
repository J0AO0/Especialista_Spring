package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

import java.util.List;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
