package Ex02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "Au au au";

    Cao(String nome_temp, String raca_temp) {
        this.nome = nome_temp;
        this.raca = raca_temp;
    }
    public String getnome() {
        return nome;
    }

    public String getraca() {
        return raca;
    }

   public void ladrar(){
        System.out.println(latido);
    }

   public void setladrar(String latido){
       this.latido = latido;
   }
}


