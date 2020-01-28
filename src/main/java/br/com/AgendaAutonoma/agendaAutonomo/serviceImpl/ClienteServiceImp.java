package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ClienteRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ClienteService;
@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	ClienteService clienteService;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	Cliente cliente;
	
	@Override
	public List<Cliente> listarCliente(String nome) {
		
		if (nome == null) {		
			List<Cliente> clientes = clienteRepository.findAll();
			return clientes;
		} else {			
			List<Cliente> clientes = clienteRepository.findByNome(nome);
			return clientes;	
	}
	}

}
