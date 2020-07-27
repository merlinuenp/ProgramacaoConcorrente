package b;

import java.util.Random;

public class Produtor extends Thread{
    Fila buffer;

    public Produtor(Fila fila){
        buffer = fila;
    }
    
    @Override
    public void run(){
        int novoItem;
        Random random = new Random();
        while (true){
            novoItem = random.nextInt(100);
            buffer.depositar(novoItem);
            System.out.println("Item depositado: "+ novoItem);
        }
    }
}
