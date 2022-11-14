
package Classes;

public class VeiculoDeLuxo extends Veiculo {
    private boolean arcodicionado;
    private boolean direcaoHidraulica;
    private boolean vidroEletrico;

    public VeiculoDeLuxo() {
    }

    public VeiculoDeLuxo(boolean arcodicionado, boolean direcaoHidraulica, boolean vidroEletrico, String placa, String modelo, byte combustivel, String cor, short ano) {
        super(placa, modelo, combustivel, cor, ano);
        this.arcodicionado = arcodicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.vidroEletrico = vidroEletrico;
    }

    public boolean getArcodicionado() {
        return arcodicionado;
    }

    public boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public boolean getVidroEletrico() {
        return vidroEletrico;
    }

    public void setArcodicionado(boolean arcodicionado) {
        this.arcodicionado = arcodicionado;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public void setVidroEletrico(boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    @Override
    public String toString() {
        
        return super.toString()+" arcodicionado: " + arcodicionado + "\n direção Hidráulica: " + direcaoHidraulica + "\n vidro elétrico: " + vidroEletrico + "\n";
    }
    
    @Override
    public void calculaCusto(byte combustivel){
        if(this.arcodicionado){
            super.setCusto(2000);
        }
        if(this.direcaoHidraulica){
            super.setCusto(super.getCusto() + 1500);
        }
        if(this.vidroEletrico){
            super.setCusto(super.getCusto() + 800);
        }
        switch(combustivel){
            case 1 -> super.setCusto(super.getCusto() + 12000);
            case 2 -> super.setCusto(super.getCusto() + 10500);
            case 3 -> super.setCusto(super.getCusto() + 11000);
            case 4 -> super.setCusto(super.getCusto() + 13000);
            default -> System.out.println("\nInformação invalida para cauculo de custo do veiculo!!\n Por Favor!! informe o tipo do combustivel do veiculo!.\n");
        }
    }
}
