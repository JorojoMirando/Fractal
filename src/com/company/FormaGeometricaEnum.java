package com.company;

public enum FormaGeometricaEnum {
    CIRCULO(1, "Círculo"), QUADRADO(2, "Quadrado");

    private int id;
    private String descricao;

    FormaGeometricaEnum (int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public boolean is(FormaGeometricaEnum formaGeometricaEnum) {
        return formaGeometricaEnum != null &&
                (this.descricao.equals(formaGeometricaEnum.descricao) || this.id == formaGeometricaEnum.id);
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
