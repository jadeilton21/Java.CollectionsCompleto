package br.com.alura;

public class Aluno5 {


    private String nome;
    private int numeroMatricula;


    public Aluno5(String nome, int numeroMatricula) {
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
        return "Aluno5: {" +
                "Nome = '" + this.nome + '\'' +
                ", Numero Da Matricula = " + this.numeroMatricula +
                '}';
    }
}
