package br.com.alura;

public class TestarCursoComAluno5 {


    public static void main(String[] args) {


        Cursos5 javaCollecions   = new Cursos5("Java Básico","Jadeilton");


        javaCollecions.adicionar(new Aula("Java",1213));
        javaCollecions.adicionar(new Aula("Python",3424));
        javaCollecions.adicionar(new Aula("CC++",3242));
        javaCollecions.adicionar(new Aula("HTML",432423));





        Aluno5 aluno1 = new Aluno5("Jadeilton",23131);
        Aluno5 aluno2 = new Aluno5("Brother",23131);
        Aluno5 aluno3 = new Aluno5("Maluco",43242);

        javaCollecions.matricula(String.valueOf(aluno1));
        javaCollecions.matricula(String.valueOf(aluno2));
        javaCollecions.matricula(String.valueOf(aluno3));


        System.out.println("--> Lista: ");

        javaCollecions.getAluno5().forEach(aluno -> {
            System.out.println(aluno);
        });




    }
}
