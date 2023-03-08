package br.com.alura;

import java.util.*;

public class Cursos2 {



    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno2> alunos2 = new LinkedHashSet<>();
    private Map<Integer, Aluno2> matriculaParaAluno = new HashMap<>();

    public Cursos2(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adicionar(Aula aula){
        this.getAulas().add(aula);
    }

    public void matricula(Aluno2 aluno2){
        this.alunos2.add(aluno2);
        this.matriculaParaAluno.put(aluno2.getNumeroMatricula(), aluno2);
    }

    public Set<Aluno2>getAlunos2(){
        return Collections.unmodifiableSet(alunos2);
    }

    public boolean estaMatriculado(Aluno2 aluno){
        return this.alunos2.contains(aluno);
    }

    public Aluno2 buscarMatricula(int numero){
        return this.matriculaParaAluno.get(numero);
    }
}
