package pilha;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> pilha = new LinkedList<T>();
    
    public void empilhar(T elemento) {
        this.pilha.addLast(elemento);
    }

    public T desempilhar() {
        return this.pilha.removeLast();
    }

    public T verificarTopo() {
        return this.pilha.getLast();
    }

    public boolean verificarVazia() {
        return this.pilha.isEmpty();
    }

    public int tamanho() {
        return this.pilha.size();
    }

    public void imprimir() {
        System.out.println(this.pilha.toString());
    }
}
