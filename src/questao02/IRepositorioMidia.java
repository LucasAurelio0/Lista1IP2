package questao02;

import java.util.ArrayList;

public interface IRepositorioMidia {

	void cadastrarMidia(Midia m);

	void removerMidia(Midia m);

	ArrayList<Midia> listarMidiasPorIdade(int idade);

	ArrayList<Midia> listarMidiasPorCategoria(String categoria);

}