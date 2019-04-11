package br.edu.ifg.trabalhopoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadastro cadastroDeFunc = new Cadastro();
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("---------------------");
            System.out.println("-SELECIONE UMA OPÇÃO-");
            System.out.println("- 1- Adicionar Func.-");
            System.out.println("- 2- Listar Func.   -");
            System.out.println("- 3- Deletar Func.  -");
            System.out.println("- 4- Sair           -");        
            System.out.println("---------------------");
            System.out.println("Opção: ");
            int opcao = ler.nextInt();
        
            switch (opcao){
                case 1:
                    cadastroDeFunc.adicionar();
                    break;
                case 2:
                    cadastroDeFunc.listar();
                    break;
                case 3:
                    cadastroDeFunc.remover();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    
}
