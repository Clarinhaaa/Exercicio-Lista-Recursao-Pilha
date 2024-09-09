package listaDuplamenteEncadeada.principal;

import listaDuplamenteEncadeada.basicas.Contato;
import listaDuplamenteEncadeada.lista.Lista;

public class Main {
    public static void main(String[] args) {
        Contato con1 = new Contato("Ana Clara", "Rua do Amor, 123", "(82) 91234-5678");
        Contato con2 = new Contato("Ana Letícia", "Rua do Sol, 456", "(82) 95678-9012");
        Contato con3 = new Contato("Thiago", "Rua do Jardim, 789", "(82) 93456-7890");
        Contato con4 = new Contato("Gicelma", "Rua do Amor, 123", "(82) 98765-4321");

        Lista listaDupEnc = new Lista();

        //* ADICIONAR
        listaDupEnc.adicionarFinal(con1);
        listaDupEnc.adicionarInicio(con2);
        listaDupEnc.adicionarFinal(con3);
        listaDupEnc.adicionarPorPosicao(con4, 1);

        //* IMPRIMIR
        listaDupEnc.imprimir();
        System.out.println("TOTAL: " + listaDupEnc.tamanho());

        //* PESQUISAR
        System.out.println();
        System.out.println("CONTATO ENCONTRADO: " + listaDupEnc.pesquisarPorNome("Gicelma"));

        //* EXCLUIR
        System.out.println();
        System.out.println("CONTATO REMOVIDO: " + listaDupEnc.removerPorPosicao(2));
        System.out.println();

        listaDupEnc.imprimir();
        System.out.println("TOTAL: " + listaDupEnc.tamanho());
    }
}
