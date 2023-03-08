package br.com.alura;

import java.util.*;

public class Cursos3 {


    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno3> alunos3 = new HashSet<>();


    public Cursos3(String titulo, String instrutor) {
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

    public void matricula(Aluno3 aluno3){
        this.alunos3.add(aluno3);
    }

    public Set<Aluno3>getAlunos3(){
        return Collections.unmodifiableSet(alunos3);
    }


}
