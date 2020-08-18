package basico;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // não paralelo
//        Tarefa tarefa1 = new Tarefa(" 1");
//        Tarefa tarefa2 = new Tarefa(" 2");
//        tarefa1.run();
//        tarefa2.run();
//        System.out.println("Main terminou ");
        
        
        // Paralelo
        TarefaParalela tarefa1 = new TarefaParalela();
        TarefaParalela tarefa2 = new TarefaParalela();
        tarefa1.start();
        tarefa2.start();
        tarefa1.join();
        tarefa2.join();
        System.out.println("Main terminou ");
    }
} 








