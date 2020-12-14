package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.Cuenta;

public interface GestionCuentaOnRemoto {
	
	public boolean registrarCuenta(Cuenta cuenta) throws Exception;
	public boolean actualizarCuenta(Cuenta cuenta) throws Exception ;
	public Cuenta buscarCuenta(String numCuenta) throws Exception;
	public boolean eliminarCuenta(String numCuenta);
	public boolean enviarCorreoDatosCuenta(String correo);
}
