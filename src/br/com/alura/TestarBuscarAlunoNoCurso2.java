package br.com.alura;

public class TestarBuscarAlunoNoCurso2 {


    public static void main(String[] args) {



        Cursos2 javaCollecions = new Cursos2("Java","Jadeilton");



        javaCollecions.adicionar(new Aula("Java Basico",32));
        javaCollecions.adicionar(new Aula("Java Intermediario",43));
        javaCollecions.adicionar(new Aula("Java Avançado",433));


        Aluno2 aluno1 = new Aluno2("Jadeilton",23432);
        Aluno2 aluno2 = new Aluno2("Fabricio",43242);
        Aluno2 aluno3 = new Aluno2("Armago",34244);
        Aluno2 aluno4 = new Aluno2("Alberilham",32131);



        javaCollecions.matricula(aluno1);
        javaCollecions.matricula(aluno2);
        javaCollecions.matricula(aluno3);
        javaCollecions.matricula(aluno4);


        System.out.println("--> O aluno Armago, Está Matriculado: " );
        Aluno2 alunoMatriculado = javaCollecions.buscarMatricula(34244);
        System.out.println(alunoMatriculado);








    }
}
