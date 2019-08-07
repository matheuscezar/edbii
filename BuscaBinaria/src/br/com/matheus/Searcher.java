package br.com.matheus;

public class Searcher {


    public int search(int[] numeros, int i) {
        return binarySearch(numeros, i, 0, numeros.length-1);
    }

    private int binarySearch(int[] numeros, int i, int start, int end) {
        if(end < start){
            return -1;
        }
        int meio = Math.floorDiv(start+end, 2);
        if(i==numeros[meio]) return meio;
        if(i>numeros[meio]){
            return binarySearch(numeros, i, meio+1, end);
        }else{
            return binarySearch(numeros, i, start, meio-1);
        }

    }

}
