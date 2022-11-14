
package Classes;


public class IPVA_grande extends IPVA{
    private float cargaSuportada;

    public IPVA_grande() {
        super();
    }
    
    public IPVA_grande(float cargaSuportada, String placa, float pesoCarro) {
        super(placa, pesoCarro);
        super.setValor(300);
        super.setStatus("Não pago");
        this.cargaSuportada = cargaSuportada;
    }

    public float getCargaSuportada() {
        return cargaSuportada;
    }

    public void setCargaSuportada(float cargaSuportada) {
        this.cargaSuportada = cargaSuportada;
    }

    @Override
    public double calculaIPVA() {
        super.setValor(super.getValor()+ (super.getPesoCarro()*0.30));
        return super.getValor();
    }

    @Override
    public String toString() {
        return super.toString()+"\n Carga Suportada: "+this.cargaSuportada+"\n"; 
    }
    
    
    
    
}
