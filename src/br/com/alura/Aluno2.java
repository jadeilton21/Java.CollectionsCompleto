package br.com.alura;

import java.util.Objects;

public class Aluno2 {




    private String nome;
    private int numeroMatricula;


    public Aluno2(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("--> Nome errado...........");
        }
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
        return "Aluno2: {" +
                "Nome = '" + this.nome + '\'' +
                ", Numero Da Matricula = " + this.numeroMatricula +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Aluno2 outroAluno = (Aluno2) o;
        return this.nome.equals(o);

    }

    @Override
    public int hashCode() {
   return this.nome.hashCode();
  }

//    public int hashCode(){
//        return this.nome.charAt(0);
//    }
}
