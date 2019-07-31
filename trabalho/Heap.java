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
public class Heap {
    private int[] lista = new int[100];
    private int tam;

    public void subir(int i) {
        int j = i / 2;
        if (j >= 0) {
            if (lista[i] > lista[j]) {
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                subir(j);
            }
        }
    }

    public void descer(int i) {
        int j;
        if (i == 0) {
            j = 1;
        } else {
            j = 2 * i;
        }
        if (j <= tam) {
            if (j < tam) {
                if (lista[j + 1] > lista[j]) {
                    j = j + 1;
                }
            }
            if (lista[i] < lista[j]) {
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                this.descer(j);
            }
        }

    }

    public void inserir(int x) {
        if (tam < lista.length) {
            lista[tam] = x;
            tam++;
            this.subir(tam - 1);
        } else {
            System.out.println("ERRO! Lista cheia.");
        }
    }

    public int remover() {
        if (tam == 0) {
            System.out.println("ERRO! Lista vazia.");
            return -1;
        } else {
            int x = lista[0];
            lista[0] = lista[tam - 1];
            tam--;
            this.descer(0);
            return x;
        }
    }
}
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
public class Heap {
    private int[] lista = new int[100];
    private int tam;

    public void subir(int i) {
        int j = i / 2;
        if (j >= 0) {
            if (lista[i] > lista[j]) {
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                subir(j);
            }
        }
    }

    public void descer(int i) {
        int j;
        if (i == 0) {
            j = 1;
        } else {
            j = 2 * i;
        }
        if (j <= tam) {
            if (j < tam) {
                if (lista[j + 1] > lista[j]) {
                    j = j + 1;
                }
            }
            if (lista[i] < lista[j]) {
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                this.descer(j);
            }
        }

    }

    public void inserir(int x) {
        if (tam < lista.length) {
            lista[tam] = x;
            tam++;
            this.subir(tam - 1);
        } else {
            System.out.println("ERRO! Lista cheia.");
        }
    }

    public int remover() {
        if (tam == 0) {
            System.out.println("ERRO! Lista vazia.");
            return -1;
        } else {
            int x = lista[0];
            lista[0] = lista[tam - 1];
            tam--;
            this.descer(0);
            return x;
        }
    }
}
