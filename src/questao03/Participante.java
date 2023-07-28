package questao03;

import java.time.LocalDate;

public class Participante extends Pessoa {

	private String trilhaDeInteresse;

	public Participante(long codigo, String email, String nome, LocalDate dataDeNascimento, String cidade, String trilhaDeInteresse) {
		super(codigo, email, nome, dataDeNascimento, cidade);
		this.trilhaDeInteresse=trilhaDeInteresse;
	}

	public String getTrilhaDeInteresse() {
		return trilhaDeInteresse;
	}

	public void setTrilhaDeInteresse(String trilhaDeInteresse) {
		this.trilhaDeInteresse = trilhaDeInteresse;
	}

	@Override
	public String toString() {
		return "Participante [trilhaDeInteresse=" + trilhaDeInteresse + "]";
	}
	
	
}
