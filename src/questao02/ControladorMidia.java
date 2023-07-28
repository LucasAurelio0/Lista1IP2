package questao02;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ControladorMidia {

	private static ControladorMidia controlador;

	protected IRepositorioUsuario ru;
	protected IRepositorioMidia rm;
	protected IRepositorioReproducaoMidia rrm;

	private ControladorMidia() {
		this.ru = new RepositorioUsuario();
		this.rm = new RepositorioMidia();
		this.rrm = new RepositorioReproducaoMidia();
	}

	public ArrayList<Usuario> listarUsuariosComIdadeComIdadeAcimaDe(int idade) {
		return ru.listarUsuariosComIdadeComIdadeAcimaDe(idade);
	}

	public ArrayList<Usuario> listarUsuariosDoTipo(Class tipo) {
		return ru.listarUsuariosDoTipo(tipo);
	}

	public ArrayList<Midia> listarMidiasPorIdade(int idade) {
		return rm.listarMidiasPorIdade(idade);
	}

	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		return rm.listarMidiasPorCategoria(categoria);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesDeMidiasNoIntervalo(LocalDateTime inicio, LocalDateTime fim) {
		return rrm.listarReproducoesDeMidiasNoIntervalo(inicio, fim);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor c) {
		return rrm.listarReproducoesPorUsuario(c);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorCategoria(String categorias) {
		return rrm.listarReproducoesPorCategoria(categorias);
	}

	public static synchronized ControladorMidia getInstance() {
		if (controlador == null) {
			controlador = new ControladorMidia();
		}
		return controlador;
	}

	protected void cadastrarUsuario(Usuario u) {
		if (u != null) {

			if (u instanceof Produtor) {
				if (((Produtor) u).getCategorias() != null) {
					ru.cadastrarUsuario(u);
					;
				}
			} else {
				ru.cadastrarUsuario(u);
			}

		}

	}

	protected void removerUsuario(Usuario u) {
		if (u != null) {
			ru.removerUsuario(u);
		}
	}

	protected void cadastrarMidia(Midia m) {
		if (m != null && m.getProdutor().getCategorias().contains(m.getCategoria())) {

			rm.cadastrarMidia(m);
		}
	}

	protected void removerMidia(Midia m) {
		if (m != null) {
			rm.removerMidia(m);
		}
	}

	protected void reproduzirMidia(Consumidor c, Midia m) {
		if (c != null && m != null) {
			if (LocalDateTime.now().getYear() - c.getDataNascimento().getYear() >= m.getFaixaEtariaMinima()) {
				ReproducaoMidia rm = new ReproducaoMidia(m, c, LocalDateTime.now());
				rrm.cadastrarReproducaoDeMidia(rm);
			}
		}
	}

}
