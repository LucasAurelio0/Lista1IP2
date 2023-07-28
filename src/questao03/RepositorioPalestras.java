package questao03;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RepositorioPalestras implements IRepositorioPalestras {

	private ArrayList<Palestra> listaDePalestras = new ArrayList<>();
	
	

	@Override
	public ArrayList<Palestra> getListaDePalestras() {
		return listaDePalestras;
	}

	@Override
	public void inserirPalestra(Palestra p) {
		boolean existeIdIgual = false;

		for (Palestra palestra : listaDePalestras) {
			if (palestra.getIdDaPalestra() == p.getIdDaPalestra()) {
				existeIdIgual = true;
			}
		}

		if (existeIdIgual != true) {
			listaDePalestras.add(p);
		}
	}

	@Override
	public Palestra buscarPalestraPorId(long id) {

		for (Palestra palestra : listaDePalestras) {

			if (palestra.getIdDaPalestra() == id) {
				return palestra;
			}

		}

		return null;

	}

	@Override
	public ArrayList<Palestra> listarPalestrasCadastradas() {
		ArrayList<Palestra> palestrasListadas = new ArrayList<>();
		
		for(Palestra p: listaDePalestras) {
			palestrasListadas.add(p);
		}
		
		return palestrasListadas;

	}
	
	@Override
	public Palestra buscarPalestrasPorLocalEHorario(String local, LocalDateTime horario) {
		
		for(Palestra p: listaDePalestras) {
			if(p.getLocal().equals(local) && p.getDataHora()==horario) {
				return p;
			}
		}
		
		return null;
	}
	
	@Override
	public ArrayList<Palestra> listarPalestrasComMediaMaiorQue (double media){

        ArrayList<Palestra> palestrasComMediaMaior = new ArrayList<>();
		
		for(Palestra p: listaDePalestras) {
			if(p.getMediaPalestra() >= media) { 
			palestrasComMediaMaior.add(p);
			}
		}
		return palestrasComMediaMaior;
		}
	
	@Override
	public ArrayList<Avaliacao> listarTodasAsAvaliacoes (){
		
		 ArrayList<Avaliacao> avaliacoesAll = new ArrayList<>();
		 
		 for(Palestra p: listaDePalestras) {
			 avaliacoesAll.addAll(p.getAvaliacoes());
		 }
		 
		 return avaliacoesAll;
	}
	
}
