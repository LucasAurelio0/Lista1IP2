package questao01;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {

	private ArrayList<Carta> deck = new ArrayList<>();

	public Baralho() {
	}

	public ArrayList<Carta> getBaralho() {
		return deck;
	}

	public void embaralhar() {

		Random aleatorio = new Random();
		ArrayList<Carta> deckEmbaralhado = new ArrayList<>();
		
		int tamanhoDoBaralho = deck.size();
		int indiceRandomizado = 0;
		
		for(int i=0; i < tamanhoDoBaralho; i++) {
			indiceRandomizado = aleatorio.nextInt((deck.size()));
			deckEmbaralhado.add(deck.get(indiceRandomizado));
			deck.remove(indiceRandomizado);
		}
		
		deck = deckEmbaralhado;
		
	}
	
	public void gerarBaralho(int qtdBaralhos) {

		 
		for (int inicio = 0; inicio < qtdBaralhos; inicio++) {

			
			for (Naipe naipe : Naipe.values()) {

				
				for (ValorCarta valor : ValorCarta.values()) {
					deck.add(new Carta(naipe, valor));
				}
			}
								
		}
		
	}
	
	public void removerCarta(int posicao) {
		deck.remove(posicao);
	}

	public Carta entregarCarta() {
	
		Carta cartaDoTopo = deck.get(0);
		removerCarta(0);
		return cartaDoTopo;
		
		
		
	}
}
