package br.com.alura;

public class Faixas implements Comparable<Faixas> {


    private String titulo;
    private int tempo;



    public Faixas(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }


    @Override
    public String toString() {
        return "[Faixa: " + this.titulo + ", " + this.tempo + " Anos]";
    }

    @Override
    public int compareTo(Faixas outraFaixa) {
        return this.titulo.compareTo(outraFaixa.titulo);
    }
}
