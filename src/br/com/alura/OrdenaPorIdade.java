package br.com.alura;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public abstract class OrdenaPorIdade implements Comparator<Funcionario> {


    public static void main(String[] args) {



        Funcionario f1 = new Funcionario("Jadeilton",22);
        Funcionario f2 = new Funcionario("Rasta",45);
        Funcionario f3 = new Funcionario("JahDe",2321);


        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade() {


            @Override
            public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
                return funcionario.getIdade() - outroFuncionario.getIdade();
            }
        });
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);


        Iterator<Funcionario> funcionarioIterator = funcionarios.iterator();
        System.out.println("--> Nome");
        while(funcionarioIterator.hasNext()){
            System.out.println(funcionarioIterator.next().getNome());
        }

        System.out.println("--> Idade");
        Iterator<Funcionario> funcionarioIterator1 = funcionarios.iterator();
        while(funcionarioIterator1.hasNext()){
            System.out.println(funcionarioIterator1.next().getIdade());
        }



    }

}
