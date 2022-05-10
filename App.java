import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore sUomini=new Semaphore(5);
        Semaphore sDonna=new Semaphore(5);
        Bagno BagnoUomini =new Bagno(sUomini);
        Bagno BagnoDonne =new Bagno(sDonna);

        Persona p1=new Persona("Giovanni ", BagnoUomini);
        Persona p2=new Persona("Francesco ", BagnoUomini);
        Persona p3=new Persona("Dario ", BagnoUomini);
        Persona p4=new Persona("Mirko ", BagnoUomini);
        Persona p5=new Persona("Ricaldi ", BagnoUomini);
        Persona p6=new Persona("Lorenzo ", BagnoUomini);

        Persona p7=new Persona("fra ", BagnoDonne);
        Persona p8=new Persona("Giovanna ", BagnoDonne);
        Persona p9=new Persona("Livia ", BagnoDonne);
        Persona p10=new Persona("Gg ", BagnoDonne);
        Persona p11=new Persona("Joe ", BagnoDonne);
        Persona p12=new Persona("Lorenzo ", BagnoDonne);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
        p11.start();
        p12.start();
    }  
}
