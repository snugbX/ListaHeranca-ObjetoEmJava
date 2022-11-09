
package Classes;

import java.util.logging.Logger;


public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public String dadosConta() {
        return "_______________Dados da Conta Bancaria_______________\n cliente: " + cliente + "\n Numero da Conta: " + numConta + "\n Saldo: "+String.format("%.2f\n ", saldo);
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo-=valor;
            System.out.printf("Saque realizado com sucesso!\n Valor saque: %.2f\nSaldo atual: %.2f\n",valor,this.saldo);
        }else{
            System.out.printf("Saldo insuficiente!!\n Valor saque: %.2f\nSaldo atual: %.2f\n",valor,this.saldo);
        }
    }
    
    public void depositar(double valor){
        this.saldo+=valor;
        System.out.printf("Deposito efetuado com sucesso!!\nValor do deposito: %.2f\nSaldo atual: %.2f\n",valor,this.saldo);
    }
    
    
    
}
