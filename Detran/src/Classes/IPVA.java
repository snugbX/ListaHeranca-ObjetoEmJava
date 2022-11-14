
package Classes;


public class IPVA {
    private double valor;
    private String placa;
    private float pesoCarro;
    private String status;
    
    public IPVA(){
        this.valor = 300;
        this.status = "Não pago\n";
    }
    
    public IPVA(String placa, float pesoCarro){
        this.valor = 300;
        this.placa = placa;
        this.pesoCarro = pesoCarro;
        this.status = "Não pago\n";
    }
    
    // Metodos Gets 
    
    public double getValor(){
        return this.valor;
    }

    public String getPlaca() {
        return placa;
    }

    public float getPesoCarro() {
        return pesoCarro;
    }

    public String getStatus() {
        return status;
    }
    
    // Metodos sets
    
    public void setValor(double valor){
        this.valor = valor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPesoCarro(float pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "\n__________Dados do IPVA__________\n Valor: "+this.valor+"\n Placa Veiculo: "+this.placa+"\n Peso Veiculo: "+this.pesoCarro+"\n Status: "+this.status;
    }
    
    public double calculaIPVA(){
        return this.valor += (this.pesoCarro*0.10);
    }
    
    public void pagarIPVA(double ipva,double valor){
        if(valor >= ipva){
            this.status = "IPVA quitado!\n";
        }else{
            System.out.println("\nEsta faltando dinheiro!!\n");
        }
    }
}
