package com.projeto.listaEncadeada;

public class ListaEncadeada<T> {
    No<T> refereciaEntrada;

    public ListaEncadeada() {
        this.refereciaEntrada = null;
    }

    public boolean isEmpty() {
        return refereciaEntrada == null;
    }

    public int size() {
        int tamanhoLista = 0;

        No<T> referenciaAux = refereciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getNextNo() != null) {
                    referenciaAux = referenciaAux.getNextNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T content) {
        No<T> novoNo = new No<>(content);

        if (this.isEmpty()) {
            refereciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refereciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getNextNo();
        }

        noAuxiliar.setNextNo(novoNo);
    }

    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = refereciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getNextNo();
        }

        return noRetorno;

    }

    private void validaIndice(int index) {
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException("A lista não possui o indice indicado.");
        }
    }

    public T get(int index) {
        return getNo(index).getContent();
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            refereciaEntrada = noPivo.getNextNo();
            return noPivo.getContent();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setNextNo(noPivo.getNextNo());

        return noPivo.getContent();
    }

    @Override
    public String toString() {
        String strRetorno ="";

        No<T> noAuxiliar = refereciaEntrada;

        for(int i = 0; i< this.size(); i++){
            strRetorno += "No{[" + "Conteudo=" + noAuxiliar.getContent() + "}]------>";
            noAuxiliar = noAuxiliar.getNextNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}


