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

public class Sistema {
    
    Heap heap = new Heap();
    Documento doc = new Documento();

    public void criarFuncionarios() {
        Funcionario funcionario1 = new Funcionario("Maria", 999999999, 1234567, "Secretario");
        Funcionario funcionario2 = new Funcionario("Joao", 888888888, 1234567, "Transportador");
        Funcionario funcionario3 = new Funcionario("Cecilia", 777777777, 1234567, "Secretario");
        Funcionario funcionario4 = new Funcionario("Rodolfo", 666666666, 1234567, "Secretario");
    }
    Scanner sc = new Scanner(System.in);

    public Documento cadastrarDocumento() {
        System.out.println("Nome do vendedor:");
        doc.setNomeVendedor(sc.nextLine());
        System.out.println("Nome do comprador:");
        doc.setNomeComprador(sc.nextLine());
        System.out.println("Peso da encomenda:");
        doc.setPesoEncomenda(sc.nextDouble());
        System.out.println("Tipo da encomenda(Comum ou de envio rapido)");
        doc.setTipoEncomenda(sc.nextLine());
        System.out.println("Detalhes da encomenda:");
        doc.setDetalhesEncomenda(sc.nextLine());
        return doc;
    }

    public void loginFuncionario() {
        System.out.println("Digite seu CPF:");
        int numCpf = sc.nextInt();
        System.out.println("Digite sua senha:");
        int numSenha = sc.nextInt();
        Funcionario func = new Funcionario();
        func.identificarFuncionario(numCpf);

    }

    public void exibirDocumento() {
        System.out.println("Nome do vendedor:" + doc.getNomeVendedor());
        System.out.println("Nome do comprador:" + doc.getNomeComprador());
        System.out.println("Peso da encomenda:" +  doc.getPesoEncomenda());
        System.out.println("Tipo da encomenda" + doc.getTipoEncomenda());
        System.out.println("Detalhes da encomenda:" + doc.getDetalhesEncomenda());
        System.out.println("Digite a prioridade (0-100):");
        doc.setPrioridade(sc.nextInt());
        Funcionario fun = new Funcionario();
        heap.inserir(doc.getPrioridade());
        doc.setResponsavelTransporte(fun.getNome());
    }

}
