package com.projeto.atribuicaoreferencia;

public class MeuObj {
    private int num;

    public MeuObj(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
       return " "+ num;
    }
}
