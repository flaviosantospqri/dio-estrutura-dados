package com.projeto.listaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("Conteudo 1");
        minhaListaCircular.add("Conteudo 2");
        minhaListaCircular.add("Conteudo 3");
        minhaListaCircular.add("Conteudo 4");
        minhaListaCircular.add("Conteudo 5");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);

        System.out.println(minhaListaCircular);


    }
}
