public class Evento {

    private String nome;
    private String inicioEvento;
    private String fimEvento;
    private String numeroVeiculos;
    private String local;

    public Evento(String nome, String inicioEvento, String fimEvento,String numeroVeiculos, String local){
        this.nome = nome;
        this.inicioEvento = inicioEvento;
        this.fimEvento = fimEvento;
        this.numeroVeiculos = numeroVeiculos;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getInicioEvento() {
        return inicioEvento;
    }

    public String getFimEvento() {
        return fimEvento;
    }

    public String getLocal() {
        return local;
    }

    public String getNumeroVeiculos() {
        return numeroVeiculos;
    }
}
