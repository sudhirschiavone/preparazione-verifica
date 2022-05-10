import java.util.concurrent.Semaphore;

public class Bagno {
    Semaphore s=new Semaphore(1);
    

     public Bagno(Semaphore s) {
        this.s = s;
    }


    public void usa(String nome){
        try {
            s.acquire();
            System.out.println(nome +"Sta usando il bagno");
            int random=((int)Math.random()*1000);
            Thread.sleep(random);
            s.release();
            System.out.println(nome +"é uscito dal bagno");
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
