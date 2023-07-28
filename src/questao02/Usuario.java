package questao02;

import java.time.LocalDate;

public abstract class Usuario {

	private String email;
	private String nomeCompleto;
	private LocalDate dataNascimento;


	protected Usuario(String email, String nome, LocalDate data) {
		this.email = email;
		this.nomeCompleto = nome;
		this.dataNascimento = data;
	}


	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNomeCompleto() {
		return nomeCompleto;
	}

	protected void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	protected LocalDate getDataNascimento() {
		return dataNascimento;
	}

	protected void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
