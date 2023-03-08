package br.com.alura;

import java.util.*;

public class Cursos {


    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Cursos(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adicionar(Aula aula){
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

    }


    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno){
       return this.alunos.contains(aluno);
    }

    public Aluno buscarMatricula(int numero){
        return this.matriculaParaAluno.get(numero);
    }

}

