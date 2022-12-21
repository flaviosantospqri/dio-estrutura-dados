package com.projeto.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;
    public ListaDuplamenteEncadeada(){
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }


    public int size(){
        return tamanhoLista;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void add(T elemento){

        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.setNoProximo(null);
        novoNo.setNoPrev(ultimoNo);

        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }
    public void add(int index,T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoProximo(noAuxiliar.getNoPrev());
            novoNo.getNoProximo().setNoPrev(novoNo);
        }else{
            novoNo.setNoPrev(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;

        }else{
            novoNo.getNoPrev().setNoProximo(novoNo);
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
           primeiroNo = primeiroNo.getNoProximo();
           if(primeiroNo != null){
               primeiroNo.setNoPrev(null);

           }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrev().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrev(noAuxiliar.getNoPrev());
            }else{
                ultimoNo = noAuxiliar;
            }

        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{Conteudo= " + noAuxiliar.getConteudo() +"}]---->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
