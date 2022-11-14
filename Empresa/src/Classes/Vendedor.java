
package Classes;


public class Vendedor extends Empregado {
    private double valorVendas;
    private float comissao;

    public Vendedor() {
    }

    public Vendedor(String nome, int codigoSetor, double salario, float vencimento, float imposto, double valorVendas, float comissao) {
        super(nome, codigoSetor, salario, vencimento, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "\n__________Dados do Vendedor__________\n" + " nome: " + super.getNome() + "\n codigoSetor: " + super.getCodigoSetor() + "\n salario: " + super.getSalario() + "\n vencimento: " + super.getVencimento() + "\n imposto: " + super.getImposto() + "\n valorVendas: " + valorVendas + "\n comissao: " + comissao + "\n";
    }
    
    
    @Override
    public void cauculaSalario(){
        super.setSalario((super.getSalario() - (super.getSalario() * super.getImposto()))+(this.valorVendas * this.comissao));
    }
    
}
