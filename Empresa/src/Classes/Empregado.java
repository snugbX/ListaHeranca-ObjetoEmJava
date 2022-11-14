
package Classes;


public class Empregado {
    private String nome;
    private int codigoSetor;
    private double salario;
    private float vencimento;
    private float imposto;

    public Empregado() {
    }

    public Empregado(String nome, int codigoSetor, double salario, float vencimento, float imposto) {
        this.nome = nome;
        this.codigoSetor = codigoSetor;
        this.salario = salario;
        this.vencimento = vencimento;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalario() {
        return salario;
    }

    public float getVencimento() {
        return vencimento;
    }

    public float getImposto() {
        return imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setVencimento(float vencimento) {
        this.vencimento = vencimento;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Empregado{" + " nome=" + nome + ", codigoSetor=" + codigoSetor + ", salario=" + salario + ", vencimento=" + vencimento + ", imposto=" + imposto + '}';
    }
    
    
    public void cauculaSalario(){      
        this.salario -= (this.salario * this.imposto);
    } 
    
}
