package questao02;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRepositorioReproducaoMidia {

	void cadastrarReproducaoDeMidia(ReproducaoMidia rm);

	ArrayList<ReproducaoMidia> listarReproducoesDeMidiasNoIntervalo(LocalDateTime inicio, LocalDateTime fim);

	ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor c);

	ArrayList<ReproducaoMidia> listarReproducoesPorCategoria(String categorias);

}