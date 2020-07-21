package a;


public class TarefaParalela extends Thread {
    
    @Override
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Eu sou a tarefa: "+ this.getName());
        } 
    }
    
}
