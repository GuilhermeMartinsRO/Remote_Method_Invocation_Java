
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

    Double somar(Double a, Double b) throws RemoteException;
    Double subtrair(Double a, Double b) throws RemoteException;
    Double multiplicar(Double a, Double b) throws RemoteException;
    Double dividir(Double a, Double b) throws RemoteException;

}
