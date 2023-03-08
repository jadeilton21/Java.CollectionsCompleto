package br.com.alura;

public class Aluno4 {




    private String nome;
    private int numeroMatricula;


    public Aluno4(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }


    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + "/  Número Da Matricula: " + this.numeroMatricula + "]";
    }
}
