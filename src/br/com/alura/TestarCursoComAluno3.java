package br.com.alura;

public class TestarCursoComAluno3 {


    public static void main(String[] args) {

        Cursos3 javaCollecions =new Cursos3("Java","Jadeilton");


        javaCollecions.adicionar(new Aula("Java Básica",21324));
        javaCollecions.adicionar(new Aula("Java Interno",23432));
        javaCollecions.adicionar(new Aula("Java Noturno",334234));




        Aluno3 aluno1 = new Aluno3("Jade",234432);
        Aluno3 aluno2 = new Aluno3("Jadeilton Lindo",3243435);
        Aluno3 aluno3 = new Aluno3("Gabriel",2343242);

        javaCollecions.matricula(aluno1);
        javaCollecions.matricula(aluno2);
        javaCollecions.matricula(aluno3);


        System.out.println("--> Testando Em Sequencia: ");
        javaCollecions.getAlunos3().forEach(aluno ->{
            System.out.println(aluno);
        } );

    }
}
