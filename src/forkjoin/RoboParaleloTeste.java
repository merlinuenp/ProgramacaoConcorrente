package forkjoin;


public class RoboParaleloTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        RoboParalelo conta = new RoboParalelo(15, 15, false);
        long total = conta.compute();
        System.out.println(total);
        System.out.println("Demorou: "+ (System.currentTimeMillis() - inicio));
    }
}
