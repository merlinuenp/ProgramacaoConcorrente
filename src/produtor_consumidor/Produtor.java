package produtor_consumidor;

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
//            System.out.println(this.getState().toString());
            novoItem = random.nextInt(100);
            buffer.depositar(novoItem);
//            System.out.println("Item depositado: "+ novoItem);
        }
    }
}
