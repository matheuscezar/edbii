package br.com.waldson.aula11;

public class ArvoreBinariaBusca {
    private Node raiz = null;

    public boolean isEmpty() {
        return raiz == null;
    }

    public void insert(Node node) {
        if (raiz == null) {
            raiz = node;
            return;
        }
        raiz.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }

    public boolean remove(int key){ //return true if ok, false if no found
        Node n = search(key);
        if (n != null) {
            System.out.println("Elemento a ser removido encontrado");
        } else {
            System.out.println("Elemento a ser removido não encontrado");
            return false;
        }
        if (raiz == null) {
            return false;
        }
        if(raiz.getValue()==key){
            System.out.println("Removendo a raiz da árvore");
        }
        if(raiz.getValue()>key){
           raiz.getLeft().remove(key);
        }else
        if(raiz.getValue()<key){
            raiz.getRight().remove(key);
        }

        return true;
    }

}
