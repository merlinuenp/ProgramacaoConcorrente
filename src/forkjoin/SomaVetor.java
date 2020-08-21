package forkjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SomaVetor extends RecursiveTask<Integer> {
    private int[] arr;
 
    private static final int LIMITE = 500;
 
    public SomaVetor(int[] arr) {
        this.arr = arr;
    }
 
    @Override
    protected Integer compute() {
        if (arr.length > LIMITE) {
            return SomaVetor.invokeAll(criarSubtarefas())
              .stream()
              .mapToInt(SomaVetor::join)
              .sum();
        } else {
            return somar(arr);
        }
    }
 
    private Collection<SomaVetor> criarSubtarefas() {
        List<SomaVetor> subtarefas = new ArrayList<>();
        subtarefas.add(new SomaVetor(
          Arrays.copyOfRange(arr, 0, arr.length / 2)));
        subtarefas.add(new SomaVetor(
          Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
        return subtarefas;
    }
 
    private Integer somar(int[] arr) {
        return Arrays.stream(arr)
          .sum();
    }
}