package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.TipoCuenta;

public interface GestionTipoCuentaOnRemoto {

	public boolean registrarTipoCuenta(TipoCuenta tipoCuenta) throws Exception;

	public boolean actualizarTipoCuenta(TipoCuenta tipoCuenta) throws Exception;

	public TipoCuenta buscarTipoCuenta(int id) throws Exception;

	public boolean eliminarTipoCuenta(int id) throws Exception;
}
