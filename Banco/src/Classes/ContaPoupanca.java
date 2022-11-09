
package Classes;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo,int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public ContaPoupanca() {
        super();
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    
    public void calculaNovoSaldo(float taxa){
        if(this.diaDeRendimento>0){
            double valorgerado = this.diaDeRendimento*(super.getSaldo()*taxa);
            super.setSaldo(super.getSaldo()*valorgerado);
            System.out.printf("\nRendimento: %.2f\nSaldo atual: %.2f\nQuantidade de dias: %\n",valorgerado,super.getSaldo(),this.diaDeRendimento);
        }
    }

    @Override
    public String dadosConta() {
        return super.dadosConta()+"Dias de Rendimentos: "+this.diaDeRendimento+"\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
