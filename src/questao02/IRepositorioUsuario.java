package questao02;

import java.util.ArrayList;

public interface IRepositorioUsuario {

	void cadastrarUsuario(Usuario u);

	ArrayList<Usuario> getUsuarios();

	void setUsuarios(ArrayList<Usuario> usuarios);

	void removerUsuario(Usuario u);

	ArrayList<Usuario> listarUsuariosComIdadeComIdadeAcimaDe(int idade);

	ArrayList<Usuario> listarUsuariosDoTipo(Class tipo);

}