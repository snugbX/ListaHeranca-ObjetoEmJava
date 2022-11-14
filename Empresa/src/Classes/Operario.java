
package Classes;

public class Operario extends Empregado{
    private double valorProducao;
    private float commissao;

    public Operario() {
    }

    public Operario(String nome, int codigoSetor, double salario, float vencimento, float imposto, double valorProducao, float commissao) {
        super(nome, codigoSetor, salario, vencimento, imposto);
        this.valorProducao = valorProducao;
        this.commissao = commissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public float getComissao() {
        return commissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(float commissao) {
        this.commissao = commissao;
    }

    @Override
    public String toString() {
        return "\n__________Dados do Operario__________\n" + " nome: " + super.getNome() + "\n codigoSetor: " + super.getCodigoSetor() + "\n salario: " + super.getSalario() + "\n vencimento: " + super.getVencimento() + "\n imposto: " + super.getImposto() + "\n valorProducao: " + valorProducao + "\n commissao: " + commissao + "\n";
    }
    
    @Override
    public void cauculaSalario(){
        super.setSalario((super.getSalario() - (super.getSalario() * super.getImposto()))+(this.valorProducao * this.commissao));
    }
    
    
}
