
package Classes;


public class Mamifero extends Animal{
    private String alimento;
    
    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento){
        super(nome,comprimento,numeroPatas,cor,ambiente,velocidadeMedia);
        this.alimento = alimento;
    }

    public Mamifero() {
        super();
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    
    @Override
    public void dadosAnimal() {
        System.out.println("__________________Dados do Animal________________\n nome: " + super.getNome() + "\n comprimento: " + super.getComprimento() + " cm\n numeroPatas=: " + super.getNumeroPatas() + "\n cor: " + super.getCor() + "\n ambiente: " + super.getAmbiente() + "\n velocidadeMedia: " + super.getVelocidadeMedia() + " m/s\n Alimento: "+alimento+"\n");
    }
    
    
    
}
