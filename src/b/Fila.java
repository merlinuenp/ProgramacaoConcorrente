package b;

public class Fila {
    Integer fila[];
    int frente, fim, tamanhoMax, tamanhoAtual; 
    
    public Fila(int tamanhoMax){
        fila = new Integer[tamanhoMax];
        this.tamanhoMax = tamanhoMax;
        frente = -1;
        fim = -1; 
        this.tamanhoAtual = 0; 
    }
    
    public synchronized void depositar(int item){
        try{
            while (tamanhoAtual == tamanhoMax ){
                System.out.println("Buffer cheio!");
                wait();
            }
            fim = (fim + 1) % tamanhoMax; 
            fila[fim] = item;
            tamanhoAtual++; 
            if (frente == -1) {
                frente = fim; 
            }
//            Thread.sleep(1000); // só para visualizar
            notifyAll();          
        }
        catch( InterruptedException e){}
    }
    
    
    public synchronized int retirar() throws InterruptedException{
        int item = 0;
        while (tamanhoAtual == 0){            
            wait();
        }
        item = fila[frente];
        fila[frente] = null;
        frente = (frente + 1) % tamanhoMax;
        tamanhoAtual--;         
//        Thread.sleep(1000); // só para visualizar
        notifyAll();
        return item; 
        
    }
    
}
