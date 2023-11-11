package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ConversionImpl extends UnicastRemoteObject implements IConversion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConversionImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public double convertirMontant(double montant) throws RemoteException {
		// TODO Auto-generated method stub
		return  montant*3.37;
	}

}