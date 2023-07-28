package questao02;

import java.time.LocalDateTime;

public class ReproducaoMidia {


	private Midia midia;
	private Consumidor consumidor;
	private LocalDateTime dataHoraReproducao;
	
	protected ReproducaoMidia(Midia midia, Consumidor consumidor, LocalDateTime dataHoraReproducao) {
		this.midia = midia;
		this.consumidor = consumidor;
		this.dataHoraReproducao = dataHoraReproducao;
	}

	@Override
	public String toString() {
		return "ReproducaoMidia [midia=" + midia + ", consumidor=" + consumidor + ", dataHoraReproducao="
				+ dataHoraReproducao + "]";
	}
	
	protected Midia getMidia() {
		return midia;
	}

	protected void setMidia(Midia midia) {
		this.midia = midia;
	}

	protected Consumidor getConsumidor() {
		return consumidor;
	}

	protected void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}

	protected LocalDateTime getDataHoraReproducao() {
		return dataHoraReproducao;
	}

	protected void setDataHoraReproducao(LocalDateTime dataHoraReproducao) {
		this.dataHoraReproducao = dataHoraReproducao;
	}
	
	
	
}
