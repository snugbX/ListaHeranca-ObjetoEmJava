
package banco;

import Classes.ContaPoupanca;
import Classes.ContaEspecial;

public class Banco {

    public static void main(String[] args) {

        // Conta Poupança objeto
        ContaPoupanca p = new ContaPoupanca("Juca",123456,1000,0);
        
        System.out.println(p.dadosConta());
        p.sacar(500);
        p.depositar(10);
        System.out.println(p.dadosConta());
        
        // Conta Especial objeto
        ContaEspecial e = new ContaEspecial("Claudia",3215987,100,500);
        
        System.out.println(e.dadosConta());
        e.sacar(500);
        e.depositar(10);
        System.out.println(e.dadosConta());
    }
    
}
