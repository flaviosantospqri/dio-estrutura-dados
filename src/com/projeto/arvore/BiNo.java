package com.projeto.arvore;

public class BiNo<T extends Comparable<T>> {

    private T conteudo;
    private BiNo<T> noEsq;
    private BiNo<T> noDir;

    public BiNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = null;
        this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BiNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BiNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BiNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BiNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BiNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
