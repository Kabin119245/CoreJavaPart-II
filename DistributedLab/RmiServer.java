import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements RmiServerIntf {

    public RmiServer() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }

    public int mul(int a, int b) throws RemoteException {
        return a * b;
    }

    public int div(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Cannot divide by zero");

        }

        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("RMI server started");
            LocateRegistry.createRegistry(1099);

            System.out.println("JAVA RMI registry created");

            RmiServer obj = new RmiServer();
            Naming.rebind("//localhost/CalculatorService", obj);

            System.out.println("Calculator service bound in registry");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
