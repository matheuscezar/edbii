package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public Node searchSmaller(int smaller, Node node){
        if(this.getLeft().equals(null)){
            return node;
        }
        if(node.getValue()<smaller){
            searchSmaller(smaller,this.getLeft());
        }

        return null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int remove(int key) {
        if(key == value){
            if(left==null && right==null){ //se é uma folha
                this.value = -1; // o valor de -1 é simbolico para representar o valor null que é o correto.
                this.left = null;
                this.right = null;
                System.out.println("Removendo elemento da folha");
                return 1;
            }
            if(left!=null&& right==null){ // se tem um filho na esquerda
                value = left.getValue();
                if(left.getRight()!=null) this.right = left.getRight();
                if(left.getLeft()!=null)this.left = left.getLeft();
                System.out.println("Removendo elemento com apenas filho a esquerda");
                return 1;
            }
            if(right!=null&& left==null){ //se tem um filho na direta
                value = right.getValue();
                if(right.getRight()!=null)this.right = right.getRight();
                if(right.getLeft()!=null)this.left = right.getLeft();
                System.out.println("Removendo elemento com apenas filho a direita ");
                return 1;
            }

            if(left!=null&&right!=null){ // se tem dois filhos
                Node aux = searchSmaller(this.getValue(),this.getRight());
                this.value = aux.getValue();
                System.out.println("Removendo elemento com dois filhos");
                return 1;
            }

        }else if(this.getValue() > key ){
                if(left!=null) {
                    left.remove(key);

                }
            }else if(this.getValue() < key){
                    if(right!=null) {
                        right.remove(key);
                    }
            }
            return 0;
    }
}
