
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {


    public CalculadoraImpl() throws RemoteException {}


    public Double somar(Double n1, Double n2) throws RemoteException {
        return n1+n2;
    }

    public Double subtrair(Double n1, Double n2) throws RemoteException {
        return  n1-n2;
    }

    public Double multiplicar(Double n1, Double n2) throws RemoteException {
        return n1*n2;
    }

    public Double dividir(Double n1, Double n2) throws RemoteException {
        return  n1/n2;
        //tratar divisão por 0 na entrada
    }
}
