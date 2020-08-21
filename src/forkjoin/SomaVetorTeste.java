package forkjoin;

import java.util.Arrays;
import java.util.Random;

public class SomaVetorTeste {

    public static void main(String[] args) {
        int QUANTIDADE = 100_000;
        int arr[] = new int[QUANTIDADE];
        Random gerador = new Random();
        for (int i = 0; i < QUANTIDADE; i++) {
            arr[i] = gerador.nextInt();
        }
        
        long inicio = System.currentTimeMillis();
        Arrays.sort(arr);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo soma convencional: " + (fim - inicio));
        
//        inicio = System.currentTimeMillis();
//        Arrays.parallelSort(arr);
//        fim = System.currentTimeMillis();
//        System.out.println(fim - inicio);
        

        inicio = System.currentTimeMillis();
        SomaVetor sv = new SomaVetor(arr);
        sv.compute();
        fim = System.currentTimeMillis();
        System.out.println("Tempo soma paralela....: " + (fim - inicio));
//
//
//        inicio = System.currentTimeMillis();
//        int res = Arrays.stream(arr)
//                .map(a -> a * 10)
//                .sum();
//
//        System.out.println(res);
//        System.out.println("Demorou: " + (System.currentTimeMillis() - inicio));
//        
//        inicio = System.currentTimeMillis();
//        res = Arrays.stream(arr).parallel()
//                .map(a -> a * 10)
//                .sum();
//
//        System.out.println(res);
//        System.out.println("Demorou: " + (System.currentTimeMillis() - inicio));
    }

}
