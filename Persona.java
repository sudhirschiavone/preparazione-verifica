import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona extends Thread{
    String nome;
    Bagno b;

    public Persona() {
    }

    
    public Persona(String nome, Bagno b) {
        this.nome = nome;
        this.b = b;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Bagno getB() {
        return b;
    }


    public void setB(Bagno b) {
        this.b = b;
    }


    @Override
    public void run() {
        try {
            b.utilizza(this);
        } catch (Exception e) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }

    
}
