package questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ControladorRECnPlay deusExMachina = ControladorRECnPlay.getInstance();
		
		Palestrante GustavoRocha = new Palestrante(111111111,"GugaGustavinho@***.com" , "GUSTAVO ROCHA", LocalDate.parse("1989-11-13"), "Pindamonhagaba", "Empresa x");
		Palestra palestra1 = new Palestra(111111111,  "A inovacao financeira e o sistema financeiro do futuro", GustavoRocha, "Palestra sobre como as inovacoes tecnologicas financeiras podem influenciar o sistema financeiro", LocalDateTime.parse("2023-10-02T10:00"), "Teatro Apolo", "TECNOLOGIA");
		
		Palestrante SimoneZelaquett = new Palestrante(222222222,"SimoneZ@***.com" , "Simone Zelaquett", LocalDate.parse("2004-01-15"), "New York", "Accenture");
		Palestra palestra2 = new Palestra(222222222,  "Apresentacao do Humanoide NAO", SimoneZelaquett, "Nessa atividade os participantes assistirao a performance do NAO humanoide programado por estudantes da rede municipal do Recife, as" + "apresentacoes de Yoga e Dança que serao contagiantes e motivarao a interacao dos presentes.", LocalDateTime.parse("2023-10-02T11:15"), "Accenture Innovation Cente", "TECNOLOGIA");
		
		Palestrante AndreaPinho = new Palestrante(333333333, "AndreaP@***.com" , "Andrea Pinho", LocalDate.parse("1999-02-12"), "Rondonia", "Prefeitura do Recife");
		Palestra palestra3 = new Palestra(333333333,  "Imprensa Mirim", AndreaPinho, "Durante o evento os palestrantes serao entrevistados  como pauta da  Cobertura jornalistica das acoes do RecnPlay , realizadas por estudantes da Prefeitura de Recife. Muitos participantes podero compor com os palestrantes as entrevistas prestando depoimentos sobre o evento e suas impressoes e novas aprendizagens.", LocalDateTime.parse("2023-10-02T10:00"), "Teatro Apolo", " ECONOMIA_CRIATIVA");
		
		Palestrante MarianaMoura = new Palestrante(444444444,"MarianaMoura@***.com" , "Mariana Moura", LocalDate.parse("2000-01-18"), "Paulista", "Grupo Moura");
		Palestra palestra4 = new Palestra(444444444,  "Educacao experimental para familias empresarias", MarianaMoura, "Uma conversa com os socios e membros da Escola F para debater um novo modelo educacional voltado para familias empresarias. Um modelo de negocio colaborativo que valoriza a aprendizagem a partir da troca de experiencias, investe na facilitacao de grupos para gerar conhecimento e desenvolvimento, por meio da construcao de entendimentos e nao apenas a partir de conteudos externos", LocalDateTime.parse("2023-10-04T10:00"), "CESAR Bom Jesus - Sala Garagem (andar - 5)", "CIDADES");
		
		Palestrante SilvioMeira = new Palestrante(555555555,"Silvao@***.com" , "SILVIO MEIRA", LocalDate.parse("1967-02-22"), "Petrolina", "UFPE");
		Palestra palestra5 = new Palestra(555555555,  "Como voce e a sua empresa irao sobreviver ao apocalipse digital?", SilvioMeira, "Talk Show com o renomado lider do setor de inovacao que conversara sobre o tema de transformacao digital.", LocalDateTime.parse("2023-10-05T10:00"), "Cais do Sertão - Auditorio", "CIDADES");

		
		deusExMachina.cadastrarPalestra(palestra1);
		deusExMachina.cadastrarPalestra(palestra2);
		deusExMachina.cadastrarPalestra(palestra3);
		deusExMachina.cadastrarPalestra(palestra4);
		deusExMachina.cadastrarPalestra(palestra5);
		
		System.out.println("\nPalestras adicionadas:");
		
		for(Palestra pal: deusExMachina.getRepositorioPalestras().getListaDePalestras()) {
			System.out.println(pal);
			System.out.println();
		}
		
		palestra3 = new Palestra(333333333,  "Imprensa Mirim", AndreaPinho, "Durante o evento os palestrantes serao entrevistados  como pauta da  Cobertura jornalistica das acoes do RecnPlay , realizadas por estudantes da Prefeitura de Recife. Muitos participantes podero compor com os palestrantes as entrevistas prestando depoimentos sobre o evento e suas impressoes e novas aprendizagens.", LocalDateTime.parse("2023-10-02T10:00"), "UFRPE", " ECONOMIA_CRIATIVA");
		System.out.println(palestra3);
		
		Participante participante1 = new Participante(666666666, "ChineseSatellite@***.com", "Phoebe Bridgers", LocalDate.parse("1994-06-17"), "Kyoto", "CIDADES");
		Participante participante2 = new Participante(777777777, "AntiHeroi@***.com", "Joao victor", LocalDate.parse("1999-05-14"), "Sao Paulo", "TECNOLOGIA");
		Participante participante3 = new Participante(888888888, "Liability@***.com", "Ella", LocalDate.parse("2000-12-15"), "Melbourne", "TECNOLOGIA");
		Participante participante4 = new Participante(999999999, "Evermore@***.com", "Taylor Allison Swift", LocalDate.parse("1989-11-13"), "Coney Island", "ECONOMIA_CRIATIVA");
		Participante participante5 = new Participante(101010101, "Pillowtalk@***.com", "Zayn", LocalDate.parse("2001-07-10"), "Kansas", "CIDADES");
		Participante participante6 = new Participante(111111111, "MarinersApartmentComplex@***.com", "Lana", LocalDate.parse("1980-06-02"), "Rio deJaneiro", "CIDADES");
		Participante participante7 = new Participante(121212121, "Holocene@***.com", "Bon Iver", LocalDate.parse("1970-12-12"), "Floresta", "TECNOLOGIA");
		Participante participante8 = new Participante(131313131, "Epiphany@***.com", "Augustine", LocalDate.parse("1994-04-17"), "Recife", "ECONOMIA_CRIATIVA");
		
		deusExMachina.realizarInscricao(participante1);
		deusExMachina.realizarInscricao(participante2);
		deusExMachina.realizarInscricao(participante3);
		deusExMachina.realizarInscricao(participante4);
		deusExMachina.realizarInscricao(participante5);
		deusExMachina.realizarInscricao(participante6);
		deusExMachina.realizarInscricao(participante7);
		deusExMachina.realizarInscricao(participante8);
		
		ArrayList<Participante> partComIdadeMaior = deusExMachina.listarParticipantesComIdadeMaiorQue(39);
		
		
		System.out.println("Participantes com Idade Maior de 39:\n");
		
		for (Participante participante: partComIdadeMaior) {
			System.out.println(participante.getNome());
		}
		
		Avaliacao avaliacao1 = new Avaliacao(palestra1, 2, "Muito longa", participante1);
		Avaliacao avaliacao2 = new Avaliacao(palestra1, 3, "Subjetiva Demais", participante2);
		Avaliacao avaliacao3 = new Avaliacao(palestra1, 5, "Muito informativa", participante3);
		Avaliacao avaliacao4 = new Avaliacao(palestra2, 4, "Muito boa", participante1);
		Avaliacao avaliacao5 = new Avaliacao(palestra2, 0, "Entediante", participante2);
		Avaliacao avaliacao6 = new Avaliacao(palestra2, 3, "Local ruim", participante4);
		Avaliacao avaliacao7 = new Avaliacao(palestra3, 2, "Atraso", participante5);
		Avaliacao avaliacao8 = new Avaliacao(palestra3, 1, "Ruim", participante6);
		Avaliacao avaliacao9 = new Avaliacao(palestra3, 5, "Otima", participante7);
		Avaliacao avaliacao10 = new Avaliacao(palestra4, 4, "Produtiva", participante8);
		Avaliacao avaliacao11 = new Avaliacao(palestra4, 4, "Quase Perfeita", participante3);
		Avaliacao avaliacao12 = new Avaliacao(palestra4, 4, "Poderia ser mais longa", participante4);
		Avaliacao avaliacao13 = new Avaliacao(palestra5, 5, "Interessante", participante1);
		Avaliacao avaliacao14 = new Avaliacao(palestra5, 5, "Muito importante", participante5);
		Avaliacao avaliacao15 = new Avaliacao(palestra5, 5, "Cativante", participante7);
		
		deusExMachina.avaliarPalestra(avaliacao1);
		deusExMachina.avaliarPalestra(avaliacao2);
		deusExMachina.avaliarPalestra(avaliacao3);
		deusExMachina.avaliarPalestra(avaliacao4);
		deusExMachina.avaliarPalestra(avaliacao5);
		deusExMachina.avaliarPalestra(avaliacao6);
		deusExMachina.avaliarPalestra(avaliacao7);
		deusExMachina.avaliarPalestra(avaliacao8);
		deusExMachina.avaliarPalestra(avaliacao9);
		deusExMachina.avaliarPalestra(avaliacao10);
		deusExMachina.avaliarPalestra(avaliacao11);
		deusExMachina.avaliarPalestra(avaliacao12);
		deusExMachina.avaliarPalestra(avaliacao13);
		deusExMachina.avaliarPalestra(avaliacao14);
		deusExMachina.avaliarPalestra(avaliacao15);
		
		
		ArrayList<Palestra> palestrasComMediaMaior = deusExMachina.listarPalestrasComMediaMaiorQue(3);
		
		
		System.out.println();
		System.out.println("\nPalestras mais bem avaliadas (media maior que 3):");
		
		for(Palestra pal: palestrasComMediaMaior) {
			System.out.println(pal.getTitulo());
			System.out.println();
		}
		
		System.out.println("\nQuantidade de palestras com bom indice de avaliacao:");
		System.out.println(deusExMachina.listarTotalPalestrasComMediaAvaliacaoMaiorQue(4));
	}

}
