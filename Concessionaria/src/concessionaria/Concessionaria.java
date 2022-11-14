
package concessionaria;

import Classes.Veiculo;
import Classes.VeiculoDeLuxo;

import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        Veiculo v1 = new Veiculo();
        
        System.out.println("Digite a placa do veiculo: ");
        v1.setPlaca(tc.nextLine());
        
        System.out.println("Digite o modelo do veiculo: ");
        v1.setModelo(tc.nextLine());
        
        System.out.print("Informe o numero do combustivel:\n 1 = GASOLINA\n 2 = ALCOOL\n 3 = DIESEL\n 4 = GAS\n Opção: ");
        switch(tc.nextByte()){
            case 1:
                v1.setCombustivel(v1.GASOLINA);
            break;
            case 2:
                v1.setCombustivel(v1.ALCOOL);
            break;
            case 3:
                v1.setCombustivel(v1.DIESEL);
            break;
            case 4:
                v1.setCombustivel(v1.GAS);
            break;
            default:
                System.out.print("Opção invalida!! por padrão o combustivel é Gasolina!.");
                v1.setCombustivel(v1.GASOLINA);
        }
        tc = new Scanner(System.in);
        
        System.out.println("Digite a cor do veiculo: ");
        v1.setCor(tc.nextLine());
        
        System.out.println("Digite o ano do veiculo: ");
        v1.setAno(tc.nextShort());
        
        v1.calculaCusto(v1.getCombustivel());
        
        System.out.println(v1.toString());
        
        //############ Objeto veiculo de luxo ##################//
        
        VeiculoDeLuxo v2 = new VeiculoDeLuxo();
        
        System.out.println("Digite a placa do veiculo: ");
        v2.setPlaca(tc.nextLine());
        
        System.out.println("Digite o modelo do veiculo: ");
        v2.setModelo(tc.nextLine());
        
        System.out.print("Informe o numero do combustivel:\n 1 = GASOLINA\n 2 = ALCOOL\n 3 = DIESEL\n 4 = GAS\n Opção: ");
        switch(tc.nextByte()){
            case 1:
                v2.setCombustivel(v2.GASOLINA);
            break;
            case 2:
                v2.setCombustivel(v2.ALCOOL);
            break;
            case 3:
                v2.setCombustivel(v2.DIESEL);
            break;
            case 4:
                v2.setCombustivel(v2.GAS);
            break;
            default:
                System.out.print("Opção invalida!! por padrão o combustivel é Gasolina!.");
                v2.setCombustivel(v2.GASOLINA);
        }
        tc = new Scanner(System.in);
        
        System.out.println("Digite a cor do veiculo: ");
        v2.setCor(tc.nextLine());
        
        System.out.println("Digite o ano do veiculo: ");
        v2.setAno(tc.nextShort());
        
        System.out.print("Informe se tem Ar codicionado:\n 1 = Sim\n 2 = Nao\n Opção: ");
        switch(tc.nextByte()){
            case 1:
                v2.setArcodicionado(true);
            break;
            case 2:
                v2.setArcodicionado(false);
            break;
            default:
                System.out.println("Opção invalida!! por padrão o veiculo não tem Ar codicionado!.");
                v2.setArcodicionado(false);            
        }
        
        System.out.print("Informe se tem Direção hidraulica:\n 1 = Sim\n 2 = Nao\n Opção: ");
        switch(tc.nextByte()){
            case 1:
                v2.setDirecaoHidraulica(true);
            break;
            case 2:
                v2.setDirecaoHidraulica(false);
            break;
            default:
                System.out.println("Opção invalida!! por padrão o veiculo não tem Direção hidraulica!.");
                v2.setDirecaoHidraulica(false);            
        }
        
        System.out.print("Informe se tem Vidro eletrico:\n 1 = Sim\n 2 = Nao\n Opção: ");
        switch(tc.nextByte()){
            case 1:
                v2.setVidroEletrico(true);
            break;
            case 2:
                v2.setVidroEletrico(false);
            break;
            default:
                System.out.println("Opção invalida!! por padrão o veiculo não tem Vidro eletrico!.");
                v2.setVidroEletrico(false);            
        }
        
        v2.calculaCusto(v2.getCombustivel());
        
        System.out.println(v2.toString());
        
    }
    
}
