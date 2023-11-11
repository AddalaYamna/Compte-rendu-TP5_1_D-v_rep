package rmiServer;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.ConversionImpl;
import rmiService.IConversion;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            // Créez et liez l'objet distant
            IConversion conversionObj = new ConversionImpl();
            Registry registry = LocateRegistry.createRegistry(1077);
            registry.rebind("ConversionService", (Remote) conversionObj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
