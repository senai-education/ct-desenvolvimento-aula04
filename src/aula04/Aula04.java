package aula04;

import java.util.ArrayList;
import model.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

/**
 *
 * @author SESI_SENAI
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        
        Animal bob = new Cachorro();
        listaDeAnimais.add(bob);
        
        Animal joaozinho = new Cavalo();
        listaDeAnimais.add(joaozinho);
        Animal merli = new Preguica();
        listaDeAnimais.add(merli);
          
        
        for (Animal animal : listaDeAnimais) {
            System.out.println(animal.emitirSom());
        }
       
 
    }
    
}
