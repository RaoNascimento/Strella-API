package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
	public List<ClienteDto> lista(String nome) {

		List<Cliente> clientes = service.listarCliente(nome);

		ModelMapper mapper = new ModelMapper();
		Type profisionaisType = new TypeToken<List<Cliente>>() {}.getType();
		List<ClienteDto> clientesDto = mapper.map(clientes, profisionaisType);
		return clientesDto;

	}

}
