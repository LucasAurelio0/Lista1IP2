package questao02;

import java.util.ArrayList;

public class RepositorioMidia implements IRepositorioMidia {

	private ArrayList<Midia> midias = new ArrayList<>();
	
	


	
	@Override
	public void cadastrarMidia(Midia m) {
		boolean existeNomeIgual = false;
		if (m != null) {
			String arquivoTeste = m.getArquivo();
			for (Midia midiaInterna : midias) {
				if (midiaInterna.getArquivo().equals(arquivoTeste)) {
					existeNomeIgual = true;
				}
			}

			if (existeNomeIgual != true) {
				this.midias.add(m);
			} else {
				System.out.printf("Nome ja esta vinculado a outro arquivo e nao pode ser adicionado\n");
			}
		}
	}

	
	@Override
	public void removerMidia(Midia m) {

		midias.remove(m);
	}

	
	@Override
	public ArrayList<Midia> listarMidiasPorIdade(int idade) {
		ArrayList<Midia> midiasDaFaixa = new ArrayList<>();

		for (Midia midiaInterna : midias) {
			if (midiaInterna.getFaixaEtariaMinima() >= idade) {
				midiasDaFaixa.add(midiaInterna);
			}
		}

		return midiasDaFaixa;
	}

	
	@Override
	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		ArrayList<Midia> midiasDaCategoria = new ArrayList<>();

		for (Midia midiaInterna : midias) {
			if (midiaInterna.getCategoria().equals(categoria)) {
				midiasDaCategoria.add(midiaInterna);
			}
		}

		return midiasDaCategoria;
	}

}
