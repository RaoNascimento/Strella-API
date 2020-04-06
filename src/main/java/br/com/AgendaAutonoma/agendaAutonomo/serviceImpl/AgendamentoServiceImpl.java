package br.com.AgendaAutonoma.agendaAutonomo.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AgendaAutonoma.agendaAutonomo.controller.form.AgendamentoForm;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agenda;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Agendamento;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Cliente;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.Profissional;
import br.com.AgendaAutonoma.agendaAutonomo.modelo.ServicoOferecido;
import br.com.AgendaAutonoma.agendaAutonomo.repository.AgendamentoRepository;
import br.com.AgendaAutonoma.agendaAutonomo.service.AgendamentoService;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

	Agendamento agendamento = new Agendamento();

	@Autowired
	AgendamentoService service;
	@Autowired
	AgendamentoRepository agendamentoRepository;

	private static List<ServicoOferecido> servicosOferecidos = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static List<Profissional> profissionais = new ArrayList<>();
	private static ServicoOferecido so;
	private static Profissional pr;
	private static Cliente cl;
	private static Agenda ag;

	@Override
	public Agendamento salvarAgendamento(AgendamentoForm form) {

		zeraListas();
		instanciador();

		incluirServicos(form);
		incluirProfissionais(form);
		incluirClientes(form);
		
		agendamento.setDataConfirmacaoProfissional(form.getDataConfirmacaoProfissional());
		agendamento.setHorarioAtendimento(form.getHorarioAtendimento());
		agendamento.setHorarioFimAtendimento(form.getHorarioFimAtendimento());
		agendamento.setDataAgendamento(form.getDataAgendamento());

		Long idAgenda = form.getAgenda().getId();
		ag.setId(idAgenda);
		agendamento.setAgenda(ag);

		agendamento = agendamentoRepository.save(agendamento);

		return agendamento;

	}

	private void incluirClientes(AgendamentoForm form) {
		for (int i = 0; i < form.getClientes().size(); i++) {

			if (form.getClientes().get(i).getId() != 0) {

				Long id = form.getClientes().get(i).getId();
				cl.setId(id);
				clientes.add(cl);
				agendamento.setClientes(clientes);
				cl = new Cliente();
			}
		}		
	}

	private void incluirProfissionais(AgendamentoForm form) {
		
		for (int i = 0; i < form.getProfissionais().size(); i++) {

			if (form.getProfissionais().get(i).getId() != 0) {

				Long id = form.getProfissionais().get(i).getId();
				pr.setId(id);
				profissionais.add(pr);
				agendamento.setProfissionais(profissionais);
				pr = new Profissional();
			}
		}	
	}

	private void incluirServicos(AgendamentoForm form) {
		
		for (int i = 0; i < form.getServicosOferecidos().size(); i++) {		
			
			if (form.getServicosOferecidos().get(i).getId() != 0) {
				
				Long id = form.getServicosOferecidos().get(i).getId();
				so.setId(id);
				servicosOferecidos.add(so);
				agendamento.setServicosOferecidos(servicosOferecidos);
				 so = new ServicoOferecido();
			}		
		}
	}

	@Override
	public List<Agendamento> listarAgendamentoDia(LocalDate nome) {

		if (nome == null) {
			List<Agendamento> agendamentos = agendamentoRepository.findAll();
			return agendamentos;
		}

		List<Agendamento> agendamentos = agendamentoRepository.findByDataAgendamento(nome);
		return agendamentos;
	}

	public void zeraListas() {

		clientes.clear();
		profissionais.clear();
		servicosOferecidos.clear();

	}

	public void instanciador() {
		so = new ServicoOferecido();
		pr = new Profissional();
		cl = new Cliente();
		ag = new Agenda();
	}

}
