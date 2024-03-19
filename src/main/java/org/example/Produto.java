package org.example;

class Produto {
    private static Produto instance = null;
    private String nome;
    private double preco;


    public static Produto getInstance() {
        if (instance == null) {
            instance = new Produto();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
