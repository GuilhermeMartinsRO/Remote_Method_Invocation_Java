
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {

        try{

            CalculadoraImpl obj = new CalculadoraImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Calculadora",obj);
            System.out.println("Server ready");

        } catch (Exception e) {

            System.err.println("Erro no servidor: "+e);

        }

    }

}
