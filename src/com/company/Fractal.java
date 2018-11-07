package com.company;

public class Fractal {
    private int tamanho;
    private int interacoes;
    private FormaGeometricaEnum forma;

    public Fractal(int tamanho, int interacoes, FormaGeometricaEnum forma) {
        this.tamanho = tamanho;
        this.interacoes = interacoes;
        this.forma = forma;
    }

    public static void GeraArquivoSVG(Fractal f) {
    }
}

