package br.edu.ifg.projeto07;

import br.edu.ifg.projeto07.vo.Gato;
import br.edu.ifg.projeto07.serviço.Petshop;
import br.edu.ifg.projeto07.vo.Cachorro;

public class Main {

    public static void main(String[] args) {
        Petshop petshopLateMia = new Petshop();
        
        Gato sansao =  new Gato();
        sansao.setNome("Sansão");
        sansao.setIdade(2);
        sansao.setPeso(2.5f);
        
        Cachorro rex = new Cachorro();
        rex.setNome("Rex");
        rex.setIdade(4);
        rex.setPeso(13.7f);
        
        petshopLateMia.receberAnimal(sansao);
        petshopLateMia.receberAnimal(rex);
        
        System.out.println("O cachorro "+rex.getNome()+(rex.getVacinado()?"":" não")
                +" está vacinado!");
        System.out.println("O gato "+sansao.getNome()+(sansao.getVacinado()?"":" não")
                +" está vacinado!\n");
        
        rex = (Cachorro) petshopLateMia.vacinar(rex);
        System.out.println("O cachorro "+rex.getNome()+(rex.getVacinado()?"":" não")
                +" está vacinado!");
        
        sansao = (Gato) petshopLateMia.vacinar(sansao);       
        System.out.println("O gato "+sansao.getNome()+(sansao.getVacinado()?"":" não")
                +" está vacinado!");
    }
    
}
