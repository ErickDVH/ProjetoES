package modelo;

import java.util.ArrayList;

public class Peca {

    private String nome;
    private boolean consumivel;
    private int minFilial;
    private int minSede;
    private float preco;
    private ArrayList<Integer> stock;

    public Peca(String nome, boolean consumivel, int minFilial, int minSede, float preco) {
        this.nome = nome;
        this.consumivel = consumivel;
        this.minFilial = minFilial;
        this.minSede = minSede;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public boolean isConsumivel() {
        return consumivel;
    }

    public int getMinFilial() {
        return minFilial;
    }

    public int getMinSede() {
        return minSede;
    }

    public float getPreco() {
        return preco;
    }
}
