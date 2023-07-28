package questao03;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioPessoas implements IRepositorioPessoas {

	private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

	public RepositorioPessoas() {
		this.listaPessoas = listaPessoas;
	}
	
	

	@Override
	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}



	@Override
	public void inserirPessoa(Pessoa p) {
		boolean existeEmailIgual = false;

		for (Pessoa persona : listaPessoas) {
			if (p.getEmail().equals(persona.getEmail())) {
				existeEmailIgual = true;
			}
		}

		if (existeEmailIgual != true) {
			listaPessoas.add(p);
		}

	}

	@Override
	public void removerPessoa(Pessoa p) {
		for (Pessoa persona : listaPessoas) {
			if (persona.getEmail().equals(p.getEmail())) {
				listaPessoas.remove(p);
			}
		}
	}

	@Override
	public Pessoa buscarPessoaPorEmail(String email) {

		for (Pessoa persona : listaPessoas) {
			if (persona.getEmail().equals(email)) {
				return persona;
			}
		}

		return null;
	}

	@Override
	public ArrayList<Palestrante> listarPalestrantesPorEmpresa(String empresa) {

		ArrayList<Palestrante> palestrantesDaEmpresa = new ArrayList<>();

		for (Pessoa persona : listaPessoas) {
			if (persona instanceof Palestrante) {
				if(((Palestrante) persona).getEmpresa().equals(empresa)) {
					palestrantesDaEmpresa.add((Palestrante) persona);
				}				
			}
		}

		return palestrantesDaEmpresa;
	}

	@Override
	public ArrayList<Participante> listarParticipantesComInteresseEm(String trilha) {

		ArrayList<Participante> participantesComInteresseNaTrilha = new ArrayList<>();

		for (Pessoa persona : listaPessoas) {
			if (persona instanceof Participante) {
				if(((Participante) persona).getTrilhaDeInteresse().equals(trilha)) {
					participantesComInteresseNaTrilha.add((Participante) persona);
				}
			}
		}

		return participantesComInteresseNaTrilha;
	}

	@Override
	public ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade) {

		ArrayList<Participante> participantesMaioresDe = new ArrayList<>();

		for (Pessoa persona : listaPessoas) {
			if (persona instanceof Participante) {
				if (LocalDate.now().getYear() - ((Participante) persona).getDataDeNascimento().getYear() >= idade) {
					participantesMaioresDe.add((Participante) persona);
				}
			}
		}

		return participantesMaioresDe;
	}
	
	

}
