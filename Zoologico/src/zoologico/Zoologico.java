package zoologico;

import Classes.Animal;
import Classes.Peixe;

public class Zoologico {

    public static void main(String[] args) {
       Animal a = new Animal("Camelo",150,4,"Amarelo","Terra",2);
       
       a.dadosAnimal();
       
       Peixe p = new Peixe("Tubarão",300,0,"cinzento","Mar", (float) 1.5,"Babatanas e cauda");
       p.dadosAnimal();
    }
    
}
