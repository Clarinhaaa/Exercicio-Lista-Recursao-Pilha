package listaDuplamenteEncadeada.lista;

import listaDuplamenteEncadeada.basicas.Contato;

public class Lista {
    private Celula<Contato> primeira;
    private Celula<Contato> ultima;
    private int totalElementos = 0;

    public void adicionarInicio(Contato elemento) {
        Celula<Contato> nova = new Celula<Contato>(elemento, null, this.primeira);

        if (this.totalElementos == 0) {
            this.ultima = nova;
        } else {
            this.primeira.setAnterior(nova);
        }

        this.primeira = nova;
        this.totalElementos++;
    }

    public void adicionarFinal(Contato elemento) {
        Celula<Contato> nova = new Celula<Contato>(elemento, this.ultima, null);

        if (this.totalElementos == 0) {
            this.primeira = nova;
        } else {
            this.ultima.setProxima(nova);
        }

        this.ultima = nova;
        this.totalElementos++;
    }

    public void adicionarPorPosicao(Contato elemento, int posicao) {
        if (posicao < 0 || posicao > this.totalElementos)
            throw new IllegalArgumentException("Posição inválida");

        if (posicao == 0) {
            this.adicionarInicio(elemento);
            return;
        }

        if (posicao == this.totalElementos) {
            this.adicionarFinal(elemento);
            return;
        }

        Celula<Contato> aux = this.pesquisarPorPosicao(posicao - 1);
        Celula<Contato> nova = new Celula<Contato>(elemento, aux, aux.getProxima());
        aux.setProxima(nova);
        nova.getProxima().setAnterior(nova);

        this.totalElementos++;
    }

    public Contato removerInicio() {
        Celula<Contato> aux = this.primeira;
        this.primeira = aux.getProxima();
        this.primeira.setAnterior(null);
        aux.setProxima(null);

        this.totalElementos--;

        return aux.getElemento();
    }

    public Contato removerFinal() {
        Celula<Contato> aux = this.ultima;
        this.ultima = aux.getAnterior();
        this.ultima.setProxima(null);
        aux.setAnterior(null);

        this.totalElementos--;

        return aux.getElemento();
    }

    public Contato removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= this.totalElementos)
            throw new IllegalArgumentException("Posição inválida");

        if (posicao == 0)
            return this.removerInicio();

        if (posicao == this.totalElementos - 1)
            return this.removerFinal();

        Celula<Contato> removida = this.pesquisarPorPosicao(posicao);
        removida.getAnterior().setProxima(removida.getProxima());
        removida.getProxima().setAnterior(removida.getAnterior());
        removida.setAnterior(null);
        removida.setProxima(null);

        this.totalElementos--;

        return removida.getElemento();
    }

    public void imprimir() {
        Celula<Contato> aux = this.primeira;

        System.out.print("[");
        while (aux.getProxima() != null) {
            System.out.println(aux.getElemento() + ", ");
            aux = aux.getProxima();
        }
        System.out.println(aux.getElemento() + "]");
    }

    public Contato pesquisarPorNome(String nome) {
        Celula<Contato> aux = this.primeira;
        try {
            while (aux.getElemento().getNome() != nome) {
                aux = aux.getProxima();
            }
            return aux.getElemento();
        } catch (NullPointerException e) {
            return null;
        }
    }

    public int tamanho() {
        return this.totalElementos;
    }

    private Celula<Contato> pesquisarPorPosicao(int posicao) {
        Celula<Contato> aux;

        if (posicao <= (this.totalElementos - 1) / 2) {
            aux = this.primeira;
            for (int i = 0; i < posicao; i++) {
                aux = aux.getProxima();
            }
        } else {
            aux = this.ultima;
            for (int i = this.totalElementos - 1; i > posicao; i--) {
                aux = aux.getAnterior();
            }
        }

        return aux;
    }
}
