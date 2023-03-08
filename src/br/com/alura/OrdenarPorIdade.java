package br.com.alura;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarPorIdade implements Comparator<Funcionario> {


    public static void main(String[] args) {



        Funcionario f1 = new Funcionario("Jadeilton",22);
        Funcionario f2 = new Funcionario("Matheu",22);
        Funcionario f3 = new Funcionario("Marcos",343);


        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        System.out.println("Com forEach");
        funcionarios.forEach(funcionario -> {
            System.out.println(funcionario.getIdade());
        });

        Iterator<Funcionario> funcionarioIterator = funcionarios.iterator();

        System.out.println("Com o while");

        while (funcionarioIterator.hasNext()){
            System.out.println(funcionarioIterator.next().getIdade());
        }















    }



    @Override
    public int compare(Funcionario funcionariow, Funcionario outroFuncionario) {
        return funcionariow.getIdade() - outroFuncionario.getIdade();
    }
}
