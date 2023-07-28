package questao02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produtor extends Usuario {

	private String nomeCanal;
	private ArrayList<String> categorias;

	protected Produtor(String email, String nome, LocalDate dataNascimento, String canal, ArrayList<String> topicos) {
		super(email, nome, dataNascimento);
		this.nomeCanal = canal;
		this.categorias = topicos;
	}

	
	@Override
	public String toString() {
		return "Produtor [nomeCanal=" + nomeCanal + ", categorias=" + categorias + "]";
	}


	protected String getNomeCanal() {
		return nomeCanal;
	}

	protected void setNomeCanal(String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}

	protected List<String> getCategorias() {
		return categorias;
	}

	protected void setCategorias(ArrayList<String> categorias) {
		this.categorias = categorias;
	}

}
