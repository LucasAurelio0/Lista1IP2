package questao03;

import java.time.LocalDate;

public abstract class Pessoa {

	private long codigo; 
	private String email;
	private String nome;
	private LocalDate dataDeNascimento;
	private String cidade;
	
	public Pessoa(long codigo, String email, String nome, LocalDate dataDeNascimento, String cidade) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cidade = cidade;
	}

	
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", email=" + email + ", nome=" + nome + ", dataDeNascimento="
				+ dataDeNascimento + ", cidade=" + cidade + "]";
	}


	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
