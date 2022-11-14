
package empresa;
import Classes.Administrador;
import Classes.Operario;
import Classes.Vendedor;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Administrador ad = new Administrador();
        
        System.out.println("Digite o nome do funcionario: ");
        ad.setNome(tc.nextLine());
        
        System.out.println("Digite o codigo do setor: ");
        ad.setCodigoSetor(tc.nextInt());
        
        System.out.println("Digite o Salario base: ");
        ad.setSalario(tc.nextDouble());
        
        System.out.println("Digite o indice acrecido caso vencimento: ");
        ad.setVencimento(tc.nextFloat());
        
        System.out.println("Digite o indice do imposto: ");
        ad.setImposto(tc.nextFloat());
        
        System.out.println("Digite o valor de ajuda de custo: ");
        ad.setAjudaDeCusto(tc.nextDouble());
        
        ad.cauculaSalario();
        
        System.out.println(ad.toString());
        
        
        Operario op = new Operario();
        
        System.out.println("Digite o nome do funcionario: ");
        op.setNome(tc.nextLine());
        
        System.out.println("Digite o codigo do setor: ");
        op.setCodigoSetor(tc.nextInt());
        
        System.out.println("Digite o Salario base: ");
        op.setSalario(tc.nextDouble());
        
        System.out.println("Digite o indice acrecido caso vencimento: ");
        op.setVencimento(tc.nextFloat());
        
        System.out.println("Digite o indice do imposto: ");
        op.setImposto(tc.nextFloat());
        
        System.out.println("Digite o valor da produção: ");
        op.setValorProducao(tc.nextDouble());
        
        System.out.println("Digite o indice da comissão: ");
        op.setComissao(tc.nextFloat());
        
        op.cauculaSalario();
        
        System.out.println(ad.toString());
        
        Vendedor ven = new Vendedor();
        
        System.out.println("Digite o nome do funcionario: ");
        ad.setNome(tc.nextLine());
        
        System.out.println("Digite o codigo do setor: ");
        ad.setCodigoSetor(tc.nextInt());
        
        System.out.println("Digite o Salario base: ");
        ad.setSalario(tc.nextDouble());
        
        System.out.println("Digite o indice acrecido caso vencimento: ");
        ad.setVencimento(tc.nextFloat());
        
        System.out.println("Digite o indice do imposto: ");
        ad.setImposto(tc.nextFloat());
        
        System.out.println("Digite o valor das vendas: ");
        ven.setValorVendas(tc.nextDouble());
        
        System.out.println("Digite o indice da comissão: ");
        op.setComissao(tc.nextFloat());
        
        ad.cauculaSalario();
        
        System.out.println(ad.toString());
        
    }
    
}
