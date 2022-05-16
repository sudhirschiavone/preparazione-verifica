public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s1= new Semaforo(1);
        Semaforo s2= new Semaforo(1);

        Bagno b_uomini =new Bagno(s1);
        Bagno b_donne =new Bagno(s2);

        Persona p1 =new Persona("Giole", b_uomini);
        Persona p2 =new Persona("Ennrico", b_uomini);
        Persona p3 =new Persona("Mirko", b_uomini);

        Persona p4 =new Persona("Sofia", b_donne);
        Persona p5 =new Persona("Francesca", b_donne);
        Persona p6 =new Persona("Livia", b_donne);


        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();


        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        System.out.println("Tutti sono usciti dal bagno");
        
    }
}
