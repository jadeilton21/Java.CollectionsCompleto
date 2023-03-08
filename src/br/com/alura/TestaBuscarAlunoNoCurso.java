package br.com.alura;

public class TestaBuscarAlunoNoCurso {


    public static void main(String[] args) {


        Cursos javaCollecions = new Cursos("Dominando as Coleções do Java.","Jadeilton");


        javaCollecions.adicionar(new Aula("Java Básico",19));
        javaCollecions.adicionar(new Aula("Java Intermediario",34));
        javaCollecions.adicionar(new Aula("Java Profissional",10));


        Aluno aluno1 = new Aluno("Jade",1738);
        Aluno aluno2 = new Aluno("Gabriel",4433);
        Aluno aluno3 = new Aluno("Fabiano",3432);
        Aluno aluno4 = new Aluno("Sabotagem",3432);


        javaCollecions.matricula(aluno1);
        javaCollecions.matricula(aluno2);
        javaCollecions.matricula(aluno3);
        javaCollecions.matricula(aluno4);


        System.out.println("--> Quem é o aluno com a Matricula 1738: ");
        Aluno alunoMatriculado = javaCollecions.buscarMatricula(1738);
        System.out.println(alunoMatriculado);



    }
}
