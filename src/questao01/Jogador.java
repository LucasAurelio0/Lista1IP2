package questao01;

import java.util.ArrayList;

public  class Jogador {

	private String nomeDoJogador;
	
	private ArrayList <Carta> maoDoJogador = new ArrayList<>();

	public Jogador(String nomeDoJogador) {
		
		this.nomeDoJogador = nomeDoJogador;
		
	}



	public String getNomeDoJogador() {
		return nomeDoJogador;
	}


	public ArrayList<Carta> getMaoDoJogador() {
		return maoDoJogador;
	}


	public void resetarMao () {
		maoDoJogador.removeAll(maoDoJogador);
	}
	
	
	public void puxarCarta (Carta cartaQualquer) {
		maoDoJogador.add(cartaQualquer);
	}
	
	public int somaDaMao () {
		
		int soma = 0;
		
		for(Carta c: this.getMaoDoJogador()) {
			soma += c.getValorDaCarta().valor;
		}
		
		return soma;
	}
	
	public void printarMao () {
		System.out.printf("\nCartas de %s: \n", this.getNomeDoJogador());
		for(Carta c: this.getMaoDoJogador()) {
			System.out.print(c + " | ");
		}
	}
}
