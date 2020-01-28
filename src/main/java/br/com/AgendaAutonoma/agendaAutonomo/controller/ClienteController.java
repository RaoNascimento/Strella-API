package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ClienteDto;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;
import br.com.AgendaAutonoma.agendaAutonomo.repository.ClienteRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteService service;
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping
	public List<ClienteDto>lista(String nome){
		
			List<Cliente> clientes = service.listarCliente(nome);
			
			return ClienteDto.converter(clientes);
				
		
	}
	
	
}
