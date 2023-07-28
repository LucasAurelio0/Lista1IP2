package questao03;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRepositorioPalestras {

	ArrayList<Palestra> getListaDePalestras();

	void inserirPalestra(Palestra p);

	Palestra buscarPalestraPorId(long id);

	ArrayList<Palestra> listarPalestrasCadastradas();

	Palestra buscarPalestrasPorLocalEHorario(String local, LocalDateTime horario);

	ArrayList<Palestra> listarPalestrasComMediaMaiorQue(double media);

	ArrayList<Avaliacao> listarTodasAsAvaliacoes();

}