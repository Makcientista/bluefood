package br.com.softblue.bluefood.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softblue.bluefood.domain.cliente.Cliente;
import br.com.softblue.bluefood.domain.cliente.ClienteRepository;

@Service
public class ClienteService {

	@Autowired //to provide an instance when I use this class
	private ClienteRepository clienteRepository;

	public void saveCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}