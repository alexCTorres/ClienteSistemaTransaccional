package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.Poliza;

public interface GestionPolizaOnRemoto {

	public boolean registrarPoliza(Poliza poliza) throws Exception;

	public boolean actualizarPoliza(Poliza poliza) throws Exception;

	public Poliza buscarPoliza(int id) throws Exception;

	public boolean eliminarPoliza(int id) throws Exception;

	public double calcularInteres(double capital, double tasaInteres, int plazoPoliza);
}
