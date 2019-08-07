package br.com.matheus;

public class Main {

    public static void main(String[] args) {
        int[] numeros = {
                10,
                20,
                30,
                40,
                50
        };
        Searcher s = new Searcher();
        int pos = s.search(numeros,10);
        if(pos>=0){
            System.out.println("Elemento encontrado");
        }
    }
}
