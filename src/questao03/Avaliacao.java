package questao03;

public class Avaliacao {

	private Palestra palestra;
	private int nota;
	private String comentarios;
	private Participante avaliador;
	
	protected Avaliacao(Palestra palestra, int nota, String comentarios, Participante avaliador) {
		super();
		this.palestra = palestra;
		this.nota = nota;
		this.comentarios = comentarios;
		this.avaliador = avaliador;
	}

	public Palestra getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Participante getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Participante avaliador) {
		this.avaliador = avaliador;
	}

	@Override
	public String toString() {
		return "Avaliacao [palestra=" + palestra + ", nota=" + nota + ", comentarios=" + comentarios + ", avaliador="
				+ avaliador + "]";
	}
	
	
	
}
