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
public class Funcionario {

    private String nome;
    private long cpf;
    private int senha;
    private String cargo;
    private int idUnicio;
    private NoFunc inicio;
    private NoFunc fim;
    private int tam;

    public int getIdUnicio() {
        return idUnicio;
    }

    public void setIdUnicio(int idUnicio) {
        this.idUnicio = idUnicio;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, long cpf, int senha, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.cargo = cargo;

    }

    public Funcionario() {
    }

    public boolean identificarFuncionario(int numCpf) {
        //if (getCpf() == cpfcadastrado && getSenha()== senhacadastrada{

        //if(){
        //vai ter a verificacao de cpf da tabela hash aqui
        return true;
        //}else{
        //return false;
    }
}


