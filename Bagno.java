public class Bagno {
    Semaforo s1= new Semaforo();

    public Bagno(Semaforo s1) {
        this.s1 = s1;
    }
    public void utilizza(Persona p){
        s1.Ferma();
        System.out.println(p.getNome()+" e' entrato in bagno");
        try {
            Thread.sleep((int) (Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(p.getNome() + " e' uscito dal bagno");
        s1.Parti();
    }

    
    
}
