package br.com.alura;

public class TestarCursoComAluno4 {


    public static void main(String[] args) {

        Cursos4 javaCollecions = new Cursos4("Java Para Sempre","Jadeilton");

        javaCollecions.Adicionar(new Aula("Java Collecions",23));
        javaCollecions.Adicionar(new Aula("Java Productos",432));
        javaCollecions.Adicionar(new Aula("Java Peformace",342));


        Aluno4 aluno1 = new Aluno4("Jadeilton",3324432);
        Aluno4 aluno2 =new Aluno4("Matheus",4324324);
        Aluno4 aluno3 = new Aluno4("Nerdola",43242);


        javaCollecions.matricula(aluno1);
        javaCollecions.matricula(aluno2);
        javaCollecions.matricula(aluno3);


        System.out.println("--> Lista: ");
        javaCollecions.getAluno4().forEach(aluno -> {
            System.out.println(aluno);
        });


    }
}
