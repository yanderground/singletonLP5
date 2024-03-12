package org.example;

class Produto {
    private static Produto instance = null;
    private String nome;
    private double preco;

    private Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Produto getInstance(String nome, double preco) {
        if (instance == null) {
            instance = new Produto(nome, preco);
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

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
