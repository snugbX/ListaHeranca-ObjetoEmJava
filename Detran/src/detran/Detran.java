
package detran;

import Classes.IPVA_Pequeno;
import Classes.IPVA_grande;

import java.util.Scanner;

public class Detran {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        IPVA_Pequeno c1 = new IPVA_Pequeno();
        
        System.out.println("Digite a Placa do veiculo: ");
        c1.setPlaca(tc.nextLine());
        
        System.out.println("Informe o peso do veiculo: ");
        c1.setPesoCarro(tc.nextFloat());
        
        System.out.println("Informe a quantidade de passageiro do veiculo: ");
        c1.setNumeroPassageiro(tc.nextInt());
        
        System.out.println("Valor a pagar do IPVA: "+c1.calculaIPVA());
        
        System.out.println("Digite o valor a pagar o IPVA: ");
        c1.pagarIPVA(c1.getValor(), tc.nextDouble());
        
        System.out.println(c1.toString());
        
        //  Objetos de IPVA para veiculos de pequeno Porte
        
        IPVA_Pequeno c2 = new IPVA_Pequeno();
        
        System.out.println("Digite a Placa do veiculo: ");
        c2.setPlaca(tc.nextLine());
        
        System.out.println("Informe o peso do veiculo: ");
        c2.setPesoCarro(tc.nextFloat());
        
        System.out.println("Informe a quantidade de passageiro do veiculo: ");
        c2.setNumeroPassageiro(tc.nextInt());
        
        System.out.println("Valor a pagar do IPVA: "+c2.calculaIPVA());
        
        System.out.println("Digite o valor a pagar o IPVA: ");
        c2.pagarIPVA(c2.getValor(), tc.nextDouble());
        
        System.out.println(c2.toString());
        
        //  Objetos de IPVA para veiculos de Grande Porte
        IPVA_grande c3 = new IPVA_grande();
        
        System.out.println("Digite a Placa do veiculo: ");
        c3.setPlaca(tc.nextLine());
        
        System.out.println("Informe o peso do veiculo: ");
        c3.setPesoCarro(tc.nextFloat());
        
        System.out.println("Informe a quantidade de carga que o veiculo suporta: ");
        c3.setCargaSuportada(tc.nextInt());
        
        System.out.println("Valor a pagar do IPVA: "+c3.calculaIPVA());
        
        System.out.println("Digite o valor a pagar o IPVA: ");
        c3.pagarIPVA(c3.getValor(), tc.nextDouble());
        
        System.out.println(c3.toString());
        
        // Outro Objetos de IPVA para veiculos de Grande Porte
        IPVA_grande c4 = new IPVA_grande();
        
        System.out.println("Digite a Placa do veiculo: ");
        c4.setPlaca(tc.nextLine());
        
        System.out.println("Informe o peso do veiculo: ");
        c4.setPesoCarro(tc.nextFloat());
        
        System.out.println("Informe a quantidade de carga que o veiculo suporta: ");
        c4.setCargaSuportada(tc.nextInt());
        
        System.out.println("Valor a pagar do IPVA: "+c4.calculaIPVA());
        
        System.out.println("Digite o valor a pagar o IPVA: ");
        c4.pagarIPVA(c4.getValor(), tc.nextDouble());
        
        System.out.println(c4.toString());
    }
    
}
