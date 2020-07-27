package b;

public class Principal {
    public static void main(String[] args) {
        Fila buffer = new Fila(100);
        Produtor produtor1 = new Produtor(buffer);
        Consumidor consumidor1 = new Consumidor(buffer);
        produtor1.start();
        consumidor1.start();
    }
}
