package rmiClient;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // Obtenez le registre RMI en utilisant localhost et le port 1099 (par défaut)
            Registry registry = LocateRegistry.getRegistry("localhost", 1077);

            // Obtenez l'objet distant en utilisant le nom spécifique ("ConversionService")
            IConversion conversionObj = (IConversion) registry.lookup("ConversionService");

            // Utilisez l'objet distant pour effectuer la conversion
            double result = conversionObj.convertirMontant(100.0);
            System.out.println("Converted amount: " + result);

        } catch (Exception e) {
            // Gérez les exceptions de manière appropriée (par exemple, RemoteException, NotBoundException)
            e.printStackTrace();
        }
    }

    // Interface IConversion incluse directement pour simplifier l'exemple
    interface IConversion {
        double convertirMontant(double mt) throws java.rmi.RemoteException;
    }
}
