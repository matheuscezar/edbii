package br.com.matheus;

public class Sorter {

    public void sort(int[] numeros) {
        mergeSort(numeros, 0, numeros.length-1);
    }

    private void mergeSort(int[] numeros, int inicio, int fim) {
        if(fim <= inicio) return;
        int meio = Math.floorDiv(inicio+fim,2);
        mergeSort(numeros, inicio, meio);
        mergeSort(numeros, meio+1, fim);
        merge(numeros, inicio, meio, fim);
    }

    private void merge(int[] numeros, int inicio, int meio, int fim) {
        int t1 = meio - inicio +1;
        int t2 = fim - meio;
        int[] aux1 = new int[t1];
        int[] aux2 = new int[t2];
        for(int i = 0; i< t1; ++i){
            aux1[i] =numeros[inicio+i];
        }
        for(int j = 0; j < t2; ++j){
            aux2[j] = numeros[meio + 1 + j];
        }
        int i1 = 0;
        int i2 = 0;
        int ip = inicio;
        while (i1<t1 && i2 < t2){
            if(aux1[i1]<aux2[i2]){
                numeros[ip] = aux1[i1];
                i1++;
            }else{
                numeros[ip]=aux2[i2];
                i2++;
            }
            ip++;
        }
        while ((i1<t1)){
            numeros[ip] = aux1[i1];
            ip++;
            i1++;
        }
        while ((i2<t2)){
            numeros[ip] = aux2[i2];
            ip++;
            i2++;
        }
    }
}
