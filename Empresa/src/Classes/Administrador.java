
package Classes;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(String nome, int codigoSetor, double salario, int vencimento, float imposto, double ajudaDeCusto) {
        super(nome, codigoSetor, salario, vencimento, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "\n__________Dados do Administrador__________\n" + " nome: " + super.getNome() + "\n codigoSetor: " + super.getCodigoSetor() + "\n salario: " + super.getSalario() + "\n vencimento: " + super.getVencimento() + "\n imposto: " + super.getImposto() +"\n ajudaDeCusto: " + ajudaDeCusto + "\n";
    }

    @Override
    public void cauculaSalario() {
        super.cauculaSalario();
        super.setSalario(super.getSalario()+this.ajudaDeCusto);
    }

    
    
    
}
