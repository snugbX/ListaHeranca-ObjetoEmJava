
package Classes;

public class Veiculo {
    // Variaveis constantes
    public static final byte GASOLINA = 1;
    public static final byte ALCOOL = 2;
    public static final byte DIESEL = 3;
    public static final byte GAS = 4;
    
    
    private String placa;
    private String modelo;
    private byte combustivel;
    private String cor;
    private short ano;
    private double custo;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, byte combustivel, String cor, short ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.cor = cor;
        this.ano = ano;
    }

    public double getCusto() {
        return custo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public byte getCombustivel() {
        return combustivel;
    }

    public String getCor() {
        return cor;
    }

    public short getAno() {
        return ano;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustivel(byte combustivel) {
        this.combustivel = combustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "\n__________Dados do Veiculo__________\n placa: " + placa + "\n modelo: " + modelo + "\n combustivel: " + combustivel + "\n cor: " + cor + "\n ano: " + ano +"\n Custo veiculo: "+ custo +"\n";
    }
    
    public void calculaCusto(byte combustivel){
        switch(combustivel){
            case 1:
                this.custo = 12000;
            break;
            case 2:
                this.custo = 10500;
            break;
            case 3:
                this.custo = 11000;
            break;
            case 4:
                this.custo = 13000;
            break;
            default:
                System.out.println("\nInformação invalida para cauculo de custo do veiculo!!\n Por Favor!! informe o tipo do combustivel do veiculo!.\n");
        }
    }
    
}
