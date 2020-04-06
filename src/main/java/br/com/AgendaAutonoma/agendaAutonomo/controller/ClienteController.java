package br.com.AgendaAutonoma.agendaAutonomo.controller;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.AgendaAutonoma.agendaAutonomo.controller.dto.ClienteDto;
import br.com.AgendaAutonoma.agendaAutonomo.controller.form.ClienteForm;
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
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteForm  form, UriComponentsBuilder UriBuilder) {	
		Cliente cliente = service.salvarCliente(form);	
		 URI uri = UriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri(); 
		 
		return (ResponseEntity.created(uri).body(cliente));

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		clienteRepository.deleteById(id);
		
		return ResponseEntity.ok().build();		
	}
}
