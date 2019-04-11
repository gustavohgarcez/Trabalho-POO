package br.edu.ifg.trabalhopoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author danilo
 */
public class Cadastro {

    private List<Funcionario> listaDeFuncionarios;

    public Cadastro() {
        listaDeFuncionarios = new ArrayList<>();
    }
    
    public void adicionar(){
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("\n// Cadastrando Funcionário //\n");
        
        System.out.println("Informe o Código: ");
        funcionario.setCodigo(scanner.nextInt());
        System.out.println("Informe o Nome: ");
        scanner = new Scanner(System.in);
        funcionario.setNome(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        System.out.println("Informe o Idade: ");
        funcionario.setIdade(scanner.nextInt());
        
        Setor setor = new Setor();
        System.out.println("\n- Setor do Funcionário:\n");
        System.out.println("Código: ");
        setor.setCodigo(scanner.nextInt());
        System.out.println("Nome do Setor: ");
        scanner = new Scanner(System.in);
        setor.setNome(scanner.nextLine());
        funcionario.setSetor(setor);
        
        System.out.println("..............................\n");
        
        listaDeFuncionarios.add(funcionario);
    }
    
    public void remover(){
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("\n////////// Deletar //////////");
        System.out.println("Código do Funcionário: ");
        funcionario.setCodigo(scanner.nextInt());
        listaDeFuncionarios.remove(funcionario);
        System.out.println("Deletado com sucesso!");
        System.out.println("..............................\n");
    }
    
    public void verDetalhes(int codigo){
        
    }
    
    public void listar(){
        for (Funcionario itemDaLista : listaDeFuncionarios){
            System.out.println("\n//////// Funcionario ////////");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("Idade: "+itemDaLista.getIdade());
            System.out.println("Fabricante: "+itemDaLista.getSetor().getNome());
            
            System.out.println("..............................\n");
        }
    }
    
}
