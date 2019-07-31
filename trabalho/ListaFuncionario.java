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
public class ListaFuncionario {
    
    private NoFunc inicio;
    private NoFunc fim;
    private int tam;

    public NoFunc getInicio() {
        return inicio;
    }

    public void setInicio(NoFunc inicio) {
        this.inicio = inicio;
    }

    public NoFunc getFim() {
        return fim;
    }

    public void setFim(NoFunc fim) {
        this.fim = fim;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public void addFuncionario(Funcionario funcionario) {
        NoFunc no = new NoFunc();
        no.setFuncionario(funcionario);
        if (tam == 0) {
            inicio = no;
            fim = no;
            tam++;
        } else {
            no.setProx(inicio);
            inicio.setAnt(no);
            inicio = no;
            tam++;
        }
    }

    public Funcionario removerFuncionario() {
        NoFunc aux = fim;
        switch (tam) {
            case 0:
                System.out.println("ERRO! Nenhum funcionario cadastrado");
                break;
            case 1:
                inicio = null;
                fim = null;
                tam--;
                return aux.getFuncionario();
            default:
                fim = fim.getAnt();
                fim.getProx().setAnt(null);
                fim.setProx(null);
                tam--;
                return aux.getFuncionario();
        }
        return null;
    }

    public void imprimir() {
        NoFunc aux = inicio;
        while (aux.getProx() != null) {
            System.out.println(aux.getFuncionario());
            aux = aux.getProx();
        }
        System.out.println(aux.getFuncionario());
    }

}

