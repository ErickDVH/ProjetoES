package modelo;

import java.util.ArrayList;

public class DadosApp {
    public static final DadosApp INSTANCE = new DadosApp();
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Reparacao> reparacoes;
    private ArrayList<Peca> pecas;


    private DadosApp(){
        veiculos = new ArrayList<>();
        reparacoes = new ArrayList<>();
        pecas = new ArrayList<>();
        Veiculo carro1 = new Veiculo("AE-12-DF", "Citroen", "AX", 2000,   "amarelo", 14, "Leiria");
        veiculos.add(carro1);
    }



    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void adicionarReparacao(Reparacao reparacao) {
        reparacoes.add(reparacao);
    }

    public void adicionarPeca(Peca peca){
        pecas.add(peca);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Reparacao> getReparacoes() {
        return reparacoes;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }
}
