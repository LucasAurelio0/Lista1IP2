package questao02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ControladorMidia youtube = ControladorMidia.getInstance();
		
		

		ArrayList<String> interessante = new ArrayList<>();
		interessante.add("Amor");
		interessante.add("Paixao");
		interessante.add("Musica");

		Produtor p1 = new Produtor("Swift@zzz.com", "Taylor Alison Swift", LocalDate.parse("1989-11-13"), "SwiftVevo", interessante);

		ArrayList<String> interessante2 = new ArrayList<>();
		interessante2.add("Matematica Discreta");
		interessante2.add("Calculo");
		interessante2.add("Rap de anime");

		Produtor p2 = new Produtor("Marcos@zzz.com", "Marcio Antonio", LocalDate.parse("2004-08-26"), "MarcioMonitorias",
				interessante2);

		ArrayList<String> interessante3 = new ArrayList<>();

		interessante3.add("Academia");
		interessante3.add("Compras Baratas");

		Produtor p3 = new Produtor("Arthurito@zzz.com", "Arthur Fillipe", LocalDate.parse("2004-02-12"), "GymFitAtHome",
				interessante3);

		youtube.cadastrarUsuario(p1);

		youtube.cadastrarUsuario(p2);

		youtube.cadastrarUsuario(p3);
		
		System.out.println("Produtores: ");

		for (Usuario usuario : youtube.ru.getUsuarios()) {
			System.out.println();
			System.out.println(usuario.getNomeCompleto());
		}
		
		System.out.println();

		ArrayList<String> interessante4 = new ArrayList<>();
		interessante4.add("Arte");

		Consumidor c1 = new Consumidor("art@zzz.com", "Artista Aleatorio", LocalDate.parse("2022-01-13"), interessante4);

		ArrayList<String> interessante5 = new ArrayList<>();
		interessante5.add("Musica");

		Consumidor c2 = new Consumidor("Aurelio@zzz.com", "Luquinhas Aurelio", LocalDate.parse("2004-01-15"), interessante5);

		ArrayList<String> interessante6 = new ArrayList<>();
		interessante6.add("Namoro");

		Consumidor c3 = new Consumidor("Gabriel@zzz.com", "Cisneiros, Gabriel", LocalDate.parse("2003-04-16"), interessante6);

		ArrayList<String> interessante7 = new ArrayList<>();
		interessante7.add("LouisTomzinho");

		Consumidor c4 = new Consumidor("Marcela@zzz.com", "Radassa, Marcela", LocalDate.parse("2004-05-20"), interessante7);

		ArrayList<String> interessante8 = new ArrayList<>();
		interessante8.add("Numeros");

		Consumidor c5 = new Consumidor("Probability@zzz.com", "Paulinho do Gera", LocalDate.parse("1980-01-25"), interessante8);

		ArrayList<String> interessante9 = new ArrayList<>();
		interessante9.add("Spotify");

		Consumidor c6 = new Consumidor("dumbo@zzz.com", "Elefante", LocalDate.parse("2000-01-25"), interessante9);

		ArrayList<String> interessante10 = new ArrayList<>();
		interessante10.add("Fumo");

		Consumidor c7 = new Consumidor("FrankOcean@zzz.com", "WhiteFerrari", LocalDate.parse("1980-01-25"),
				interessante10);

		youtube.cadastrarUsuario(c1);
		youtube.cadastrarUsuario(c2);
		youtube.cadastrarUsuario(c3);
		youtube.cadastrarUsuario(c4);
		youtube.cadastrarUsuario(c5);
		youtube.cadastrarUsuario(c6);
		youtube.cadastrarUsuario(c7);

		youtube.removerUsuario(c7);

		System.out.println("Usuarios maiores de idade:");

		ArrayList<Usuario> maioresDeIdade = youtube.ru.listarUsuariosComIdadeComIdadeAcimaDe(16);

		for (Usuario u : maioresDeIdade) {
			System.out.println();
			System.out.println(u.getNomeCompleto());
			System.out.println();
		}

		System.out.println("Consumidores:");

		for (Usuario u : youtube.ru.getUsuarios()) {

			if (u instanceof Consumidor) {
				System.out.println(u.getNomeCompleto());
				System.out.println();
			}

		}

		Midia m1 = new Midia(LocalDateTime.parse("2023-05-12T12:44"), "EnchantedMV", 0, "Musica", p1);

		Midia m2 = new Midia(LocalDateTime.parse("2022-02-11T12:30"), "Vida", 10, "Colagens", p2);

		Midia m3 = new Midia(LocalDateTime.parse("2021-03-23T12:10"), "RatosDeAcad", 14, "Academia", p3);

		Midia m4 = new Midia(LocalDateTime.parse("2023-01-15T12:44"), "Derivadas", 0, "Calculo", p2);

		Midia m5 = new Midia(LocalDateTime.parse("2023-05-12T10:22"), "EletricTouch", 17, "Musica", p1);

		Midia m6 = new Midia(LocalDateTime.parse("2023-05-13T12:00"), "ATW10TV", 17, "Musica", p1);

		Midia m7 = new Midia(LocalDateTime.parse("2023-05-10T12:00"), "IDWLF", 0, "Musica", p1);

		youtube.cadastrarMidia(m1);
		youtube.cadastrarMidia(m2);
		youtube.cadastrarMidia(m3);
		youtube.cadastrarMidia(m4);
		youtube.cadastrarMidia(m5);
		youtube.cadastrarMidia(m6);
		youtube.cadastrarMidia(m7);

		youtube.removerMidia(m7);

		ArrayList<Midia> midiasFaixaEtaria = youtube.rm.listarMidiasPorIdade(14);

		System.out.println("Midias Maiores de 14:");
		System.out.println();

		for (Midia m : midiasFaixaEtaria) {
			System.out.println();
			System.out.println(m.getArquivo());
			System.out.println();
		}

		ArrayList<Midia> midiasCategoria = youtube.rm.listarMidiasPorCategoria("Calculo");

		System.out.println("Midias por Categoria:");
		System.out.println();

		for (Midia m : midiasCategoria) {
			System.out.println();
			System.out.println(m.getArquivo());
		}

		youtube.reproduzirMidia(c2, m1);
		youtube.reproduzirMidia(c2, m5);
		youtube.reproduzirMidia(c2, m6);
		youtube.reproduzirMidia(c2, m7);
		youtube.reproduzirMidia(c4, m4);
		youtube.reproduzirMidia(c4, m3);
		youtube.reproduzirMidia(c3, m6);
		youtube.reproduzirMidia(c3, m2);
		youtube.reproduzirMidia(c2, m6);
		youtube.reproduzirMidia(c5, m1);
		youtube.reproduzirMidia(c6, m6);
		youtube.reproduzirMidia(c4, m7);
		youtube.reproduzirMidia(c1, m1);
		youtube.reproduzirMidia(c5, m6);
		youtube.reproduzirMidia(c1, m4);
		youtube.reproduzirMidia(c1, m3);
		youtube.reproduzirMidia(c1, m6);
		youtube.reproduzirMidia(c4, m2);
		youtube.reproduzirMidia(c1, m4);
		youtube.reproduzirMidia(c1, m5);

		ArrayList<ReproducaoMidia> reproducoesMidiaIntervalo = youtube.rrm.listarReproducoesDeMidiasNoIntervalo(
				LocalDateTime.now().minusMinutes(1), LocalDateTime.now().plusSeconds(1));

		System.out.println();
		System.out.println("Reproducoes de midias por Intervalo:");
		System.out.println();

		for (ReproducaoMidia rmi : reproducoesMidiaIntervalo) {
			System.out.println();
			System.out.println(rmi);
		}

		ArrayList<ReproducaoMidia> reproducoesPorConsumidor = youtube.rrm.listarReproducoesPorUsuario(c2);
		

		System.out.println();
		System.out.println("Reproducoes de midias por Usuario:");
		System.out.println();
		
		
		for (ReproducaoMidia rmi: reproducoesPorConsumidor) {
			System.out.println(rmi);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Reproducoes de midias por Intervalo:");
		System.out.println();

		for (ReproducaoMidia rmi : reproducoesMidiaIntervalo) {
			System.out.println();
			System.out.println(rmi);
		}
		
		System.out.println();
		System.out.println("Reproducoes de midias da categoria:");
		System.out.println();
		
		ArrayList<ReproducaoMidia> reproducoesPorCategoria = youtube.rrm.listarReproducoesPorCategoria("Musica");
		
		for (ReproducaoMidia rmi: reproducoesPorCategoria) {
			System.out.println();
			System.out.println(rmi);
		}
		
	}

}
