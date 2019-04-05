package br.edu.ifg.projeto07.serviço;

import br.edu.ifg.projeto07.vo.Animal;

public class Petshop {
    
    public void receberAnimal(Animal animal) {
        System.out.println("Recebemos o animal: "+animal.getNome());
        System.out.println("Seu peso atual é: "+animal.getPeso()+" kg.");
        System.out.println("A idade informada é: "+animal.getIdade()+" anos.");
    }
    
    public Animal vacinar(Animal animal){
        animal.setVacinado(true);
        return animal;
    }
}
