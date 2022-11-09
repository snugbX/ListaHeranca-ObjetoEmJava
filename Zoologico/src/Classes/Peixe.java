
package Classes;

public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(){
        super();
    }
    
    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica){
        super(nome,comprimento,numeroPatas,cor,ambiente,velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    @Override
    public void dadosAnimal() {
        System.out.println("__________________Dados do Animal________________\n nome: " + super.getNome() + "\n comprimento: " + super.getComprimento() + " cm\n numeroPatas=: " + super.getNumeroPatas() + "\n cor: " + super.getCor() + "\n ambiente: " + super.getAmbiente() + "\n velocidadeMedia: " + super.getVelocidadeMedia() + " m/s\n Caracteristica: "+caracteristica+"\n");
    }
}
