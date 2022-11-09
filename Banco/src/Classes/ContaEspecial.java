/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Everlan
 */
public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo,double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public ContaEspecial() {
        super();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String dadosConta() {
        return super.dadosConta()+"Limite: "+this.limite+"\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void sacar(double valor) {
        if(valor <= super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
            System.out.printf("Saque realizado com sucesso!\n Valor saque: %.2f\nSaldo atual: %.2f\n",valor,super.getSaldo());
        }else if(valor <= (limite + super.getSaldo())){
            this.limite -= (valor - super.getSaldo());
            super.setSaldo(super.getSaldo() - valor);
            System.out.printf("Saque realizado com sucesso!\n Valor saque: %.2f\nSaldo atual: %.2f\nLimite atual: %.2f\n\n",valor,super.getSaldo(),this.limite);
        }else{
            System.out.printf("Saldo insuficiente!!\n Valor saque: %.2f\nSaldo atual: %.2f\n",valor,super.getSaldo());
        }
    }

    
    
    
    
    
}
