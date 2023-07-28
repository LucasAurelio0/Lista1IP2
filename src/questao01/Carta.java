package questao01;

public class Carta {

	private Naipe naipeDaCarta;
	private ValorCarta valorDaCarta;
	
	
	public Carta(Naipe naipeDaCarta, ValorCarta valorDaCarta) {
		this.naipeDaCarta = naipeDaCarta;
		this.valorDaCarta = valorDaCarta;
	}


	public Naipe getNaipeDaCarta() {
		return naipeDaCarta;
	}


	public ValorCarta getValorDaCarta() {
		return valorDaCarta;
	}


	@Override
	public String toString() {
		return valorDaCarta.toString() + " de " + naipeDaCarta.toString();
	}
	
	
	
}
