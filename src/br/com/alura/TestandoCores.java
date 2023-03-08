package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoCores {


    public static void main(String[] args) {


        Cores cor1 = new Cores("Branco",10);
        Cores cor2 = new Cores("Azul",29);
        Cores cor3 = new Cores("Cinza",20);
        Cores cor4 = new Cores("Rosa",230);
        Cores cor5 = new Cores("Preto",299);


        ArrayList<Cores> cor = new ArrayList<>();

        cor.add(cor1);
        cor.add(cor2);
        cor.add(cor3);
        cor.add(cor4);
        cor.add(cor5);
        System.out.println("--> Forma Natural: ");
        System.out.println(cor);
        System.out.println("--> Forma usando o Collections: ");
        Collections.sort(cor);
        System.out.println(cor);

        System.out.println("--> Forma usando um Collections Diferente: ");
        Collections.sort(cor, Comparator.comparing(Cores::getTitulo));
        System.out.println(cor);

        System.out.println("--> Forma mais enxuta de todas: ");

        cor.sort(Comparator.comparing(Cores::getTitulo));

        System.out.println(cor);



    }
}
