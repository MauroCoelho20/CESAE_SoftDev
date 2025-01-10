package Ex01;

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private double consumoL100Km;
    private TipoCombustivel combustivel;

    public Carro (String marca, String modelo, int anoFabrico, int cc, int potenciaCv, double consumoL100Km, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.cc = cc;
        this.potenciaCv = potenciaCv;
        this.consumoL100Km = consumoL100Km;
        this.combustivel = combustivel;
    }
    public int idade() {
        return 2025 - this.anoFabrico;
    }

    public void ligar(){
        if (this.idade() > 30) {
            if (this.combustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fum.. Custa a pegar ... O carro esta ligado");
                System.out.println("Vrum Vrum Vrum");
            }else{
                System.out.println("Custa a pegar.. O carro esta ligado");
                System.out.println("Vrum Vrum Vrum");
            }

        }else {

            if(this.potenciaCv < 250){
                System.out.println("O carro esta ligado");
                System.out.println("Vrum Vrum Vrum");
            }else{
                System.out.println("O carro esta ligado");
                System.out.println("Vrum Vrum Vrum");
            }

        }
    }

    public Carro corrida (Carro adversario){
        if(this.potenciaCv>adversario.potenciaCv){
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) {
            return adversario;
        }else{

            if( this.cc > adversario.cc){
                return this;
            }else if ( this.cc < adversario.cc){
                return adversario;
            }else{

                if (this.anoFabrico > adversario.anoFabrico){
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico){
                    return adversario;
                }else{
                    return null;
                }
            }
        }
    }
    public void distancia (Carro adversario, double distancia){
        if (this.distancia  > adversario.distancia){

        }

    }

    public void exibirDetalhes() {

        System.out.println( this.marca + this.modelo + this.anoFabrico);

    }
}
