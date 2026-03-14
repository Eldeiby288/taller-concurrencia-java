public class SumaHilo extends Thread {

    private int inicio;
    private int fin;
    private long suma = 0;

    public SumaHilo(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run() {
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
    }

    public long getSuma() {
        return suma;
    }
}