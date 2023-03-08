package br.com.alura;

import java.util.*;

public class Cursos4 {




    private String titular;
    private String instrutor;
    private List<Aula>  aulas = new LinkedList<Aula>();
    private Set<Aluno4> aluno4 = new HashSet<>();


    public Cursos4(String titular, String instrutor) {
        this.titular = titular;
        this.instrutor = instrutor;
    }


    public String getTitular() {
        return titular;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }


    public void Adicionar(Aula aula){
        this.getAulas().add(aula);
    }

    public void matricula(Aluno4 aluno4){
        this.aluno4.add(aluno4);
    }

    public Set<Aluno4>getAluno4(){
        return Collections.unmodifiableSet(aluno4);
    }
}
