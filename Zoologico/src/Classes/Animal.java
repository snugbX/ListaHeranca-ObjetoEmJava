
package Classes;

public class Animal {
    private String nome;
    private float comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;
    
    // Meus construtores
    
    public Animal(){
    }

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }
    // Meus metodos gets
    
    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }
    
    // Meus metodos sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
    // Meu metodo toString para a impressão dos dados de minha classe 
    
    public void dadosAnimal() {
        System.out.println("__________________Dados do Animal________________\n nome: " + nome + "\n comprimento: " + comprimento + " cm\n numeroPatas=: " + numeroPatas + "\n cor: " + cor + "\n ambiente: " + ambiente + "\n velocidadeMedia: " + velocidadeMedia + " m/s\n");
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", comprimento=" + comprimento + ", numeroPatas=" + numeroPatas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + '}';
    }
    
    
}
