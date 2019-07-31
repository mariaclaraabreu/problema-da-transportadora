package trabalho.pkg1;

public class Hash {

    private ListaFuncionario tabela[] = new ListaFuncionario[11];

    public Hash() {
    }

    public int funcaoIRA(int chave) {
        double iva = 0.61803399;
        int aux = (int) (chave * iva);
        int posicao = (int) (11 * ((chave * iva) - aux));
        return posicao;
    }

    public void inserir(Funcionario funcionario) {
        int posicao = this.funcaoIRA((int) funcionario.getCpf());
        if (tabela[posicao] == null) {
            ListaFuncionario lista = new ListaFuncionario();
            lista.addFuncionario(funcionario);
            tabela[posicao] = lista;
        } else {
            tabela[posicao].addFuncionario(funcionario);
        }
    }

    public int login(int cpf, int senha) {
        int posicao = this.funcaoIRA(cpf);
        NoFunc aux = tabela[posicao].getInicio();
        while (aux != null) {
            if (aux.getFuncionario().getCpf() == cpf && aux.getFuncionario().getSenha() == senha) {
                if (aux.getFuncionario().getCargo() == "Secretario") {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                aux = aux.getProx();
            }
        }
        System.out.println("Usuario nao existe");
        return 2;
    }

    public Funcionario buscar(int cpf){
		int posicao = this.funcaoIRA(cpf);
		NoFunc aux = tabela[posicao].getInicio();
		while(aux != null){
			if(aux.getFuncionario().getCpf() == cpf){
				return aux.getFuncionario();
			}else{
				aux = aux.getProx();
			}
		}
		return null;
	}
	
	public void imprimirTabela(){
		NoFunc aux = null;
		for(int i=0; i<tabela.length; i++){
			if(tabela[i] != null){
				aux = tabela[i].getInicio();
				System.out.println("Elementos da posição " + i + ":");
				for(int j=0; j<tabela[i].getTam(); j++){
					System.out.print("[" + aux.getFuncionario().getNome() + "]" + "; ");
					if(aux.getProx() != null){
						aux = aux.getProx();
					}
				}
				System.out.println(" ");
			}
		}
	}
}
