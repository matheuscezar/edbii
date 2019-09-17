package br.com.waldson.aula11;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.insert(new Node(10));
        arvore.insert(11);
        arvore.insert(9);
        arvore.insert(8);
        arvore.insert(16);


        arvore.remove(11);

    }
}
