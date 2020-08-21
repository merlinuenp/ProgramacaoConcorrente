package forkjoin;

public class RoboTeste {
    public static void main(String[] args) {
        // Robo convencional
        long inicio = System.currentTimeMillis();
        System.out.println("Caminhos (20, 20): " + (Robo.contar(20, 20)));
        System.out.println("Robô convencional: "+ (System.currentTimeMillis() - inicio));
        
        // Robo paralelo
        inicio = System.currentTimeMillis();
        RoboParalelo conta = new RoboParalelo(20, 20, false);
        long total = conta.compute();
        //System.out.println(total);
        System.out.println("Robô paralelo....: "+ (System.currentTimeMillis() - inicio));
    }
}
