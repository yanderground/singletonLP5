package org.example;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = Produto.getInstance("Camiseta", 29.99);
        Produto produto2 = Produto.getInstance("Calça Jeans", 59.99);


        System.out.println("Informações sobre o produto 1:");
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações sobre o produto 2:");
        produto2.exibirInformacoes();
        System.out.println();


        produto1.setPreco(39.99);


        System.out.println("Informações atualizadas sobre o produto 1:");
        produto1.exibirInformacoes();
    }
}
