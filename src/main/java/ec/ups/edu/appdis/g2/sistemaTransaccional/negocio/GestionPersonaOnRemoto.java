package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.Persona;

public interface GestionPersonaOnRemoto {

	public boolean registrarPersona(Persona persona) throws Exception;

	public boolean actualizarPersona(Persona persona) throws Exception;

	public Persona buscarPersona(String cedula) throws Exception;

	public boolean eliminarPersona(String cedula) throws Exception;
}
