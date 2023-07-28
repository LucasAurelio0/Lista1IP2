package questao01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao BlackJack online\n");
		
		System.out.println("Digite a quantidade de baralhos no deck: ");
		Scanner sc = new Scanner(System.in);
		int numeroDeBaralhos = sc.nextInt();
		
		while(numeroDeBaralhos < 2 || numeroDeBaralhos > 10){
			System.out.println("Digite um valor entre 2 e 10: ");
			numeroDeBaralhos = sc.nextInt();}
		
		System.out.println("\nGerando e embaralhando o deck...\n");
		Baralho baralho = new Baralho();
		baralho.gerarBaralho(numeroDeBaralhos);
		baralho.embaralhar();
		
		Jogador humano = new Jogador("Lucas");
		Jogador dealer = new Jogador("Dealer");
		
		int partida = 0, fichasDoJogador = 100;
		
		
		boolean pessoaDecideParar = false;
		boolean dealerDecideParar = false;
		System.out.println("================================");
		
		
		while(fichasDoJogador >= 2) {
			
			if(baralho.getBaralho().size()<5) {
				baralho.gerarBaralho(numeroDeBaralhos);
				baralho.embaralhar();
			}
			
			pessoaDecideParar = false;
			dealerDecideParar = false;
			
			if(humano.getMaoDoJogador().size()>0) {
				humano.resetarMao();
				dealer.resetarMao();
			}
			
			partida++;
			System.out.printf("\nRodada %d\n", partida);
			System.out.printf("Cartas no deck: %d\n", baralho.getBaralho().size());
			System.out.printf("Quantidade de fichas: %d\n", fichasDoJogador);
			
			System.out.println("Digite X para sair ou outra tecla para continuar: ");
			String resposta = sc.next();
			
			if(resposta.equals("X") || resposta.equals("x")) {
				System.out.println("Exiting game...");
				break;
			}
			
			System.out.println("\nDigite o valor da aposta | Aposta minima = 2");
			int apostaJogador = sc.nextInt();
			
			while(apostaJogador < 2 || apostaJogador > fichasDoJogador ) {
				System.out.println("Valor invalido, tente outro: ");
				apostaJogador = sc.nextInt();
			}
			
			fichasDoJogador -= apostaJogador;
			
			dealer.getMaoDoJogador().add(baralho.entregarCarta());
			
			dealer.printarMao();
			System.out.println("\nTotal de pontos (Dealer): " + dealer.somaDaMao());
			System.out.println("----X----");
			
			humano.getMaoDoJogador().add(baralho.entregarCarta());
			humano.getMaoDoJogador().add(baralho.entregarCarta());
			humano.printarMao();
			System.out.println("\nTotal de pontos (Jogador): " + humano.somaDaMao()); 
			
			
			
			while(!pessoaDecideParar || !dealerDecideParar) {
				
				//turno do Jogador
				if(!pessoaDecideParar) {
					System.out.println("\n[H] = Hit - Puxa outra carta");
					System.out.println("[S] = Stay - Vez da Banca jogar");
					System.out.println("\nDigite a sua escolha " + humano.getNomeDoJogador() + ":");
					String acao = sc.next();
					
					while(!acao.equals("S") && !acao.equals("s") && !acao.equals("H") && !acao.equals("h")) {
						System.out.println("Acao invalida, digite H ou S: ");
						acao = sc.next();
					}
					
					if(acao.compareToIgnoreCase("H")==0) {
						
						humano.getMaoDoJogador().add(baralho.entregarCarta());
						
						if(humano.somaDaMao() > 21) {
							humano.printarMao();
							System.out.println("\nTotal de pontos (Jogador): " + humano.somaDaMao()); 
							pessoaDecideParar = true;
							dealerDecideParar = true;
						}
						else {
							humano.printarMao();
							System.out.println("\nTotal de pontos (Jogador): " + humano.somaDaMao()); 
						}
					}
					if(acao.compareToIgnoreCase("S")==0) {
						pessoaDecideParar = true;
					}
				}
					
				
				if(!dealerDecideParar) {
					
					if(dealer.somaDaMao() < 17) {
						
						System.out.println("A banca arrisca mais uma carta!\n");
						dealer.getMaoDoJogador().add(baralho.entregarCarta());
						
						if(dealer.somaDaMao() > 21) {
							dealer.printarMao();
							System.out.println("\nTotal de pontos (Dealer): " + dealer.somaDaMao()); 
							pessoaDecideParar = true;
							dealerDecideParar=true;
						}
						else {
							dealer.printarMao();
							System.out.println("\nTotal de pontos (Jogador): " + dealer.somaDaMao()); 
						}
						
					}
					else {
						dealerDecideParar = true;
					}
				}
			}
			
			if(humano.somaDaMao() > 21 && dealer.somaDaMao() > 21) {
				System.out.println("Empate, sua aposta foi ressarcida");
				fichasDoJogador += apostaJogador;
			}
			else if(humano.somaDaMao() > 21) {
				System.out.println(humano.getNomeDoJogador() + " estourou 21 pontos e perdeu ");
			}
			
			else if(dealer.somaDaMao() > 21) {
				System.out.println(dealer.getNomeDoJogador() + " estourou 21 pontos, parabens voce ganhou!! ");
				fichasDoJogador = fichasDoJogador + (2*apostaJogador);
			}
			else if(humano.somaDaMao() > dealer.somaDaMao()) {
				System.out.println(humano.getNomeDoJogador() + " chegou mais perto de 21 pontos");
				fichasDoJogador = fichasDoJogador + (2*apostaJogador);
			}
			else {
				System.out.println("A banca teve mais pontos e venceu, tente desafiar novamente");
			}
		}
			

	}
	
	

}
