package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.TasaInteres;

public interface GestionTasaInteresOnRemoto {

	public boolean registrarTasaInteres(TasaInteres tasaInteres) throws Exception;

	public boolean actualizarTasaInteres(TasaInteres tasaInteres) throws Exception;

	public TasaInteres buscarTasaInteres(int id) throws Exception;

	public boolean eliminarTasaInteres(int id) throws Exception;
}
