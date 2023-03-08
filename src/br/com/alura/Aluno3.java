package br.com.alura;

public class Aluno3 {


    private String nome;
    private int numeroMatricula;


    public Aluno3(String nome, int numeroMatricula) {
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
        return "Aluno3 = {" +
                "Nome = '" + this.nome + '\'' +
                ", Número Da Matricula = " + this.numeroMatricula +
                '}';
    }
}
