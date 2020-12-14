package ec.ups.edu.appdis.g2.sistemaTransaccional.negocio;

import ec.ups.edu.appdis.g2.sistemaTransaccional.modelo.TransferenciasExternas;

public interface GestionTransferenciasExternasOnRemoto {

	public boolean registrarTransferenciasExternas(TransferenciasExternas transExternas) throws Exception;

	public boolean actualizarTransferenciasExternas(TransferenciasExternas transExternas) throws Exception;

	public TransferenciasExternas buscarTransferenciasExternas(int id) throws Exception;

	public boolean eliminarTransferenciasExternas(int id) throws Exception;

}
