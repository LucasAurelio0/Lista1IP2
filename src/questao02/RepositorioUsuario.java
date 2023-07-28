package questao02;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario implements IRepositorioUsuario {

	private ArrayList<Usuario> usuarios= new ArrayList<>();


	@Override
	public void cadastrarUsuario(Usuario u) {
		boolean existeEmailIgual = false;
		if (u != null) {
			String emailTeste = u.getEmail();
			for (Usuario usuarioInterno : usuarios) {
				if (usuarioInterno.getEmail().equals(emailTeste)) {
					existeEmailIgual = true;
				}
			}

			if (existeEmailIgual != true) {
				this.usuarios.add(u);
			} else {
				System.out.printf("Email ja e vinculado a outro usuario e nao pode ser adicionado\n");
			}
		}
	}
	
	@Override
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	@Override
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public void removerUsuario(Usuario u) {
		usuarios.remove(u);

	}

	@Override
	public ArrayList<Usuario> listarUsuariosComIdadeComIdadeAcimaDe(int idade) {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<>();

		for (Usuario usuarioInterno : usuarios) {

			if (2023 - usuarioInterno.getDataNascimento().getYear() >= idade) {
				usuariosEncontrados.add(usuarioInterno);
			}
		}

		return usuariosEncontrados;
	}

	@Override
	public ArrayList<Usuario> listarUsuariosDoTipo(@SuppressWarnings("rawtypes")Class tipo) {

		ArrayList<Usuario> UsuariosDoTipo = new ArrayList<>();

		for (Usuario u : usuarios) {
			if (u.getClass() == tipo) {
				UsuariosDoTipo.add(u);
			}
		}
		return UsuariosDoTipo;
	}
}
