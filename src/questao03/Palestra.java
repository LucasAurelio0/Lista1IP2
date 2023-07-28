package questao03;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Palestra {

	public long idDaPalestra;
	public String titulo;
	public Palestrante palestrante;
	public String descricao;
	public ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
	public LocalDateTime dataHora;
	public String local;
	public String trilha;
	// TECNOLOGIA OU ECONOMIA_CRIATIVA OU CIDADES

	public Palestra() {

	}

	public Palestra(long idDaPalestra, String titulo, Palestrante palestrante, String descricao, LocalDateTime dataHora, String local, String trilha) {
		this.idDaPalestra = idDaPalestra;
		this.titulo = titulo;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.avaliacoes = avaliacoes;
		this.dataHora = dataHora;
		this.local = local;
		this.trilha = trilha;
	}
	
	

	@Override
	public String toString() {
		return "Palestra [idDaPalestra=" + idDaPalestra + ", titulo=" + titulo + ", palestrante=" + palestrante
				+ ", descricao=" + descricao + ", avaliacoes=" + avaliacoes + ", dataHora=" + dataHora + ", local="
				+ local + ", trilha=" + trilha + "]";
	}

	public long getIdDaPalestra() {
		return idDaPalestra;
	}

	public void setIdDaPalestra(long idDaPalestra) {
		this.idDaPalestra = idDaPalestra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTrilha() {
		return trilha;
	}

	public void setTrilha(String trilha) {
		this.trilha = trilha;
	}
	
	
	public double getMediaPalestra () {
		int totalNotas = 0, quantidade=0;
		for(Avaliacao a: avaliacoes) {
			totalNotas = totalNotas + a.getNota();
			quantidade = quantidade + 1;
		}
		
		
		if(quantidade==0) {
			return 0.0;
		}
		else { 
			return totalNotas/quantidade; 
		}
	}

}
