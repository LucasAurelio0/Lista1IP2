package questao02;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RepositorioReproducaoMidia implements IRepositorioReproducaoMidia {

	private ArrayList<ReproducaoMidia> reproducoesDeMidia= new ArrayList<>();


	@Override
	public void cadastrarReproducaoDeMidia(ReproducaoMidia rm) {

		if (rm != null) {
			reproducoesDeMidia.add(rm);
		}
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesDeMidiasNoIntervalo(LocalDateTime inicio, LocalDateTime fim) {

		ArrayList<ReproducaoMidia> midiasReproduzidas = new ArrayList<>();

		for (ReproducaoMidia rep : reproducoesDeMidia) {
			if (rep.getDataHoraReproducao().isAfter(inicio) && rep.getDataHoraReproducao().isBefore(fim)) {
				midiasReproduzidas.add(rep);
			}
		}

		return midiasReproduzidas;
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor c) {

		ArrayList<ReproducaoMidia> reproducoesDoUsuario = new ArrayList<>();

		for (ReproducaoMidia reproducao : reproducoesDeMidia) {
			if (reproducao.getConsumidor().equals(c)) {
				reproducoesDoUsuario.add(reproducao);
			}
		}

		return reproducoesDoUsuario;
	}

	  @Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorCategoria (String categorias){
		
		ArrayList<ReproducaoMidia> listaCategoria= new ArrayList<>();
		
		for(ReproducaoMidia rep: reproducoesDeMidia) {
			if(rep.getConsumidor().getInteresse().contains(categorias)) {
				listaCategoria.add(rep);
			}
		}
		
		return listaCategoria;
	}
	
}
