public class Semaforo {
    int valore=0;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    public Semaforo() {
    }
    synchronized public void Ferma(){
        while(valore == 0){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }
    synchronized public void Parti(){
        valore++;
        notify();
    }
    
}
