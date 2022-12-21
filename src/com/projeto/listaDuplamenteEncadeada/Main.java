package com.projeto.listaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDupla = new ListaDuplamenteEncadeada<>();

        minhaListaDupla.add("Conteudo1");
        minhaListaDupla.add("Conteudo2");
        minhaListaDupla.add("Conteudo3");
        minhaListaDupla.add("Conteudo4");
        minhaListaDupla.add("Conteudo5");
        minhaListaDupla.add("Conteudo6");
        minhaListaDupla.add("Conteudo7");

        System.out.println(minhaListaDupla);

        minhaListaDupla.remove(3);

        minhaListaDupla.add(3,"99");

        System.out.println(minhaListaDupla);
    }


}
