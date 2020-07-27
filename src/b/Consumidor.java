package b;


public class Consumidor extends Thread {
    Fila buffer;
    
    public Consumidor(Fila fila){
        buffer = fila; 
    }
    
    @Override
    public void run(){
        int item;
        while (true){
            try {
                item = buffer.retirar();
                System.out.println("Item retirado: "+item);
            } catch (InterruptedException ex) {}           
        }
        
    }
}
