package Bancario;
//classe atributo titular do cliente
public class Conta {

    Cliente titular;
    int numero;
    double saldo;


    void imprimirSaldo(){
        System.out.println("Saldo atual para a conta " + this.numero + ": " + this.saldo);
    }
}
