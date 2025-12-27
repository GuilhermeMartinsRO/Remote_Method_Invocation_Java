
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws RemoteException {

        Double response=0.0;
        double pvalor;
        double svalor;
        String entrada;
        Scanner sc=new Scanner(System.in);

            try{
                Registry registry = LocateRegistry.getRegistry("localhost");
                Calculadora stub = (Calculadora) registry.lookup("Calculadora");

                do{

                    System.out.println("Digite qual operação deseja fazer (adição / multiplicação / divisão / subtração) ou sair: ");
                    entrada = sc.nextLine();

                    switch (entrada) {
                        case "adição" -> {

                            System.out.println("Digite o primeiro valor: ");
                            pvalor = sc.nextDouble();
                            System.out.println("Digite o segundo valor: ");
                            svalor = sc.nextDouble();
                            sc.nextLine();

                            response = stub.somar(pvalor, svalor);
                            response = Math.round(response * 100) / 100.0;
                        }
                        case "multiplicação" -> {

                            System.out.println("Digite o primeiro valor: ");
                            pvalor = sc.nextDouble();
                            System.out.println("Digite o segundo valor: ");
                            svalor = sc.nextDouble();
                            sc.nextLine();

                            response = stub.multiplicar(pvalor,svalor);
                            response = Math.round(response*100)/100.0;

                        }
                        case "divisão" -> {

                                System.out.println("Digite o primeiro valor: ");
                                pvalor = sc.nextDouble();

                            do{
                                System.out.println("Digite o segundo valor: ");
                                svalor = sc.nextDouble();
                                sc.nextLine();

                                if(svalor==0){
                                    System.out.println("O divisor deve ser diferente de 0");
                                }

                            }while (svalor == 0);


                            response = stub.dividir(pvalor,svalor);
                            response = Math.round(response*100)/100.0;

                        }
                        case "subtração" -> {

                            System.out.println("Digite o primeiro valor: ");
                            pvalor = sc.nextDouble();
                            System.out.println("Digite o segundo valor: ");
                            svalor = sc.nextDouble();
                            sc.nextLine();

                            response = stub.subtrair(pvalor,svalor);
                            response = Math.round(response*100)/100.0;

                        }
                        case "sair" -> System.exit(0);
                    }

                    System.out.println("Resposta do servidor: "+response);

                }while(true);



            }catch(Exception e){
                System.err.println("Erro no cliente: "+e);
            }

    }

}
