package modelo;

public class Veiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String dono;        //private Cliente dono
    private String donoAnterior;
    private int preco;
    private int numDonos;
    private String cor;
    private int jantes;
    private String local;
    private boolean vendido;
    //private LinkedList<modelo.Reparacao> reparacoes;

    public Veiculo(String matricula, String marca,String modelo, int preco, String cor, int jantes, String local) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.numDonos = numDonos;
        this.cor = cor;
        this.jantes = jantes;
        this.local = local;

        vendido = false;
        //reparacoes = new LinkedList<modelo.Reparacao>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getDono() {
        return dono;
    }

    public String getDonoAnterior() {
        return donoAnterior;
    }

    public double getPreco() {
        return preco;
    }

    public int getNumDonos() {
        return numDonos;
    }

    public String getCor() {
        return cor;
    }

    public int getJantes() {
        return jantes;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVendido() {
        return vendido;
    }


//    public LinkedList<modelo.Reparacao> getReparacoes(){
//        return new LinkedList<>(reparacoes);
//    }

}
