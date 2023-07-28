package questao03;

import java.util.ArrayList;

public class ControladorRECnPlay {

	private static ControladorRECnPlay controlador;

	private IRepositorioPalestras repositorioPalestras;
	private IRepositorioPessoas repositorioPessoas;

	private ControladorRECnPlay() {
		this.repositorioPalestras = new RepositorioPalestras();
		this.repositorioPessoas = new RepositorioPessoas();
	}

	protected static synchronized ControladorRECnPlay getInstance() {

		if (controlador == null) {
			controlador = new ControladorRECnPlay();
		}
		return controlador;
	}
	
	

	public IRepositorioPalestras getRepositorioPalestras() {
		return repositorioPalestras;
	}

	public IRepositorioPessoas getRepositorioPessoas() {
		return repositorioPessoas;
	}

	public ArrayList<Palestra> listarPalestrasCadastradas() {
		return repositorioPalestras.listarPalestrasCadastradas();
	}

	public ArrayList<Palestra> listarPalestrasComMediaMaiorQue(double media) {
		return repositorioPalestras.listarPalestrasComMediaMaiorQue(media);
	}

	public ArrayList<Avaliacao> listarTodasAsAvaliacoes() {
		return repositorioPalestras.listarTodasAsAvaliacoes();
	}

	public ArrayList<Palestrante> listarPalestrantesPorEmpresa(String empresa) {
		return repositorioPessoas.listarPalestrantesPorEmpresa(empresa);
	}

	public ArrayList<Participante> listarParticipantesComInteresseEm(String trilha) {
		return repositorioPessoas.listarParticipantesComInteresseEm(trilha);
	}

	public ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade) {
		return repositorioPessoas.listarParticipantesComIdadeMaiorQue(idade);
	}

	public void realizarInscricao(Participante p) {
		if (p != null) {
			if (!p.getTrilhaDeInteresse().isBlank() && (p.getTrilhaDeInteresse() == "TECNOLOGIA" || p.getTrilhaDeInteresse() == "ECONOMIA_CRIATIVA" || p.getTrilhaDeInteresse() == "CIDADES")) {
				repositorioPessoas.inserirPessoa(p);
			}
		}
	}

	public void cadastrarPalestra(Palestra p) {
		if (p != null && !p.getPalestrante().getNome().isBlank() && !p.getPalestrante().getEmpresa().isBlank()) {
			if (p.getIdDaPalestra() != 0 && !p.getTitulo().isBlank() && !p.getDescricao().isBlank() && p.getDataHora() != null && !p.getLocal().isBlank() && !p.getTrilha().isBlank()){
				boolean existeIgual = false;

				for (Palestra pal : repositorioPalestras.getListaDePalestras()) {
					if (pal.getTitulo() == p.getTitulo()) {
						existeIgual = true;
					}
					if (pal.getLocal().equals(p.getLocal()) && pal.getDataHora().equals(p.getDataHora())) {
						existeIgual=true;
					}
				}

				if (existeIgual != true) {
					repositorioPessoas.inserirPessoa(p.getPalestrante());
					repositorioPalestras.inserirPalestra(p);
					;
				}
			}
		}
	}

	public void avaliarPalestra(Avaliacao ava) {
		boolean verificacao1 = false;
		boolean verificacao2 = false;

		if (ava != null) {
			for (Pessoa person : repositorioPessoas.getListaPessoas()) {
				if (person instanceof Participante) {
					if (ava.getAvaliador().getNome().equals(((Participante) person).getNome())) {
						verificacao1 = true;
					}
				}
			}
			if (verificacao1) {
				for (Palestra pal : repositorioPalestras.getListaDePalestras()) {
					if (ava.getPalestra().equals(pal)) {
						verificacao2 = true;
					}
				}
			}
			if (verificacao2 == true) {
				if (ava.getNota() >= 0 && 5 >= ava.getNota()) {
					ava.getPalestra().getAvaliacoes().add(ava);
				}
			}
		}

	}

	public ArrayList<Palestra> listarPalestrasMaisBemAvaliadas(double mediaDesejada) {

		ArrayList<Palestra> listaPalestrasMediaMaiorQue = new ArrayList<>();

		for (Palestra pal : repositorioPalestras.getListaDePalestras()) {
			if (pal.getMediaPalestra() >= mediaDesejada) {
				listaPalestrasMediaMaiorQue.add(pal);
			}
		}

		return listaPalestrasMediaMaiorQue;
	}

	public int listarTotalPalestrasComMediaAvaliacaoMaiorQue(double mediaDesejada) {

		int qtd = 0;

		for (Palestra pal : repositorioPalestras.getListaDePalestras()) {
			if (pal.getMediaPalestra() >= mediaDesejada) {
				qtd+=1;
			}
		}

		return qtd;
	}

}
