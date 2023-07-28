package questao03;

import java.time.LocalDate;

public class Palestrante extends Pessoa{

	private String empresa;

	public Palestrante(long codigo, String email, String nome, LocalDate dataDeNascimento, String cidade, String empresa) {
		super(codigo, email, nome, dataDeNascimento, cidade);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Palestrante [empresa=" + empresa + "]";
	}
	
	
}
