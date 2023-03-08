package br.com.alura;

public class Aula2 implements Comparable<Aula2> {





    private String titulo;
    private int tempo;


    public Aula2(String titulo, int tempo){
        this.tempo = tempo;
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
        return "[Aula: "+ this.titulo +", "+ this.tempo + " Minutos]";
    }

    @Override
    public int compareTo(Aula2 outrAula) {
        return this.titulo.compareTo(outrAula.titulo);
    }
}
