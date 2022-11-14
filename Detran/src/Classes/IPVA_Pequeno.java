
package Classes;

public class IPVA_Pequeno extends IPVA {
    private int numeroPassageiro;

    public IPVA_Pequeno(){
        super();
    }
    
    public IPVA_Pequeno(int numeroPassageiro, String placa, float pesoCarro) {
        super(placa, pesoCarro);
        super.setValor(300);
        super.setStatus("Não pago\n");
        this.numeroPassageiro = numeroPassageiro;
    }

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }

    public void setNumeroPassageiro(int numeroPassageiro) {
        this.numeroPassageiro = numeroPassageiro;
    }

    @Override
    public double calculaIPVA() {
        super.setValor(super.getValor() + (super.getPesoCarro()*0.20));
        return super.getValor();
    }
    
    @Override
    public String toString() {
        return super.toString()+" Numero de passageiro: "+this.numeroPassageiro+"\n"; 
    }

    
    
    
    
    
}
