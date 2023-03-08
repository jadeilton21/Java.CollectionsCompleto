package br.com.alura;

public class Cores implements Comparable<Cores>{




    private String titulo;
    private int tempo;




    public Cores(String titulo, int tempo ){
        this.tempo= tempo;
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }


    @Override
    public String toString() {
        return "[Cores: " + this.titulo + ", " + this.tempo + " Dias]";
    }

    @Override
    public int compareTo(Cores outraCores) {
        return this.titulo.compareTo(outraCores.titulo);
    }
}
