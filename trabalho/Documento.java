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
public class Documento {
    private No inicio;
    private No fim;
    private int tam;
    private static int idUnico;
    private int prioridade;
    private String nomeVendedor;
    private String nomeComprador;
    private String nomeTransportador;
    private double pesoEncomenda;
    private String tipoEncomenda;
    private String detalhesEncomenda;
    private String responsavelTransporte;
    Scanner sc = new Scanner(System.in);
//    Sistema sist = new Sistema();
    



    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getNomeTransportador() {
        return nomeTransportador;
    }

    public void setNomeTransportador(String nomeTransportador) {
        this.nomeTransportador = nomeTransportador;
    }

    public double getPesoEncomenda() {
        return pesoEncomenda;
    }

    public void setPesoEncomenda(double pesoEncomenda) {
        this.pesoEncomenda = pesoEncomenda;
    }

    public String getTipoEncomenda() {
        return tipoEncomenda;
    }

    public void setTipoEncomenda(String tipoEncomenda) {
        this.tipoEncomenda = tipoEncomenda;
    }

    public String getDetalhesEncomenda() {
        return detalhesEncomenda;
    }

    public void setDetalhesEncomenda(String detalhesEncomenda) {
        this.detalhesEncomenda = detalhesEncomenda;
    }

    public String getResponsavelTransporte() {
        return responsavelTransporte;
    }

    public void setResponsavelTransporte(String responsavelTransporte) {
        this.responsavelTransporte = responsavelTransporte;
    }
    
    
    public Documento(String nomeVendedor, String nomeComprador, double pesoEncomenda, String tipoEncomenda, String detalhesEncomenda){
        this.nomeVendedor=nomeVendedor;
        this.nomeComprador=nomeComprador;
        this.pesoEncomenda=pesoEncomenda;
        this.tipoEncomenda=tipoEncomenda;
        this.detalhesEncomenda=detalhesEncomenda;
    }
    public Documento(){}
    
    
     public void inserirDocumento(Documento documento){
        No no = new No();
        no.setDocumento(documento);
        if(tam==0){
            inicio=no;
            fim=no;
            tam++;
            
        }else{
            no.setProx(inicio);
            inicio.setAnt(no);
            inicio=no;
            tam++;
        }
    }
    
    public Documento removerDocumento(){   
        Sistema sist = new Sistema();
        //sist.loginFuncionario();
        sist.exibirDocumento();
        No aux = inicio;
        switch (tam) {
            case 0:
                System.out.println("ERRO! Nenhum documento cadastrado");
                break;
            case 1:
                inicio=null;
                fim=null;
                tam--;
                return aux.getDocumento();
            default:
                fim=fim.getAnt();
                fim.getProx().setAnt(null);
                fim.setProx(null);
                tam--;
                return aux.getDocumento();
        }
        return null;
    }
    

    

}
