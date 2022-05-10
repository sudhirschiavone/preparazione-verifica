public class Persona extends Thread{
    private String nome;
    private Bagno b;
    
    public Persona( String nome, Bagno b) {
        this.nome = nome;
        this.b = b;
    }
    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void run(){
        try{
            b.usa(nome);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
