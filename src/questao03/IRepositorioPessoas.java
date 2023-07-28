package questao03;

import java.util.ArrayList;

public interface IRepositorioPessoas {

	ArrayList<Pessoa> getListaPessoas();

	void inserirPessoa(Pessoa p);

	void removerPessoa(Pessoa p);

	Pessoa buscarPessoaPorEmail(String email);

	ArrayList<Palestrante> listarPalestrantesPorEmpresa(String empresa);

	ArrayList<Participante> listarParticipantesComInteresseEm(String trilha);

	ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade);

}