package questao02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consumidor extends Usuario {

	private ArrayList<String> interesse;
	
	protected Consumidor(String email, String nome, LocalDate data, ArrayList<String> interesse) {
		super(email, nome, data);
		this.interesse = interesse;
	}

	
	
	@Override
	public String toString() {
		return "Consumidor [interesse=" + interesse + "]";
	}



	protected List<String> getInteresse() {
		return interesse;
	}

	protected void setInteresse(ArrayList<String> interesse) {
		this.interesse = interesse;
	}
	
	
}
