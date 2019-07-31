/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;

/**
 *
 * @author Maria Clara
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int escolha;
        Scanner sc = new Scanner(System.in);
        Documento doc = new Documento();
        Sistema sist = new Sistema();
        sist.criarFuncionarios();
        // Hash hash = new Hash();
        Hash h = new Hash();
        Funcionario funcionario1 = new Funcionario("Maria", 1, 1234567, "Secretario");
        h.inserir(funcionario1);
        Funcionario funcionario2 = new Funcionario("Joao", 3, 1234567, "Transportador");
        h.inserir(funcionario2);
        Funcionario funcionario3 = new Funcionario("Cecilia", 5, 1234567, "Secretario");
        h.inserir(funcionario3);
        Funcionario funcionario4 = new Funcionario("Rodolfo", 8, 1234567, "Secretario");
        h.inserir(funcionario4);

        do {
            System.out.println("TRANSPORTADORA");
            System.out.println("ESCOLHA UMA OPCAO:");
            System.out.println("[1] CADASTRAR DOCUMENTO");
            System.out.println("[2] REMOVER PROCESSO DA LISTA");
            System.out.println("[3] TRANSPORTAR PROCESSO");
            System.out.println("[4] SAIR");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Documento doccc = sist.cadastrarDocumento();
                    doc.inserirDocumento(doccc);
                    break;
                case 2:
                    System.out.println("Digite seu CPF:");
                    long cpf = sc.nextLong();
                    System.out.println("Digite sua senha");
                    int senha = sc.nextInt();
                    Hash hash = new Hash();
                    int verificarCargo = hash.login((int) cpf, senha);
                    if (verificarCargo == 0) {
                        System.out.println("Secretario, remova o documento da lista");
                        doc.removerDocumento();
                    }else if(verificarCargo==1){
                        System.out.println("Transportadores nao podem executar esta acao");
                        break;
                    }
                        
                    }

            
        } while (escolha != 4);

    }
}
