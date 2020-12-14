package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.Usuario;

public interface GestionUsuarioOnRemoto {

	public boolean registrarUsuario(Usuario usuario) throws Exception;

	public boolean actualizarUsuario(Usuario usuario) throws Exception;

	public Usuario buscarUsuario(int id) throws Exception;

	public boolean eliminarUsuario(int id) throws Exception;

}
