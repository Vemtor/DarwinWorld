package org.model;


import org.model.util.Animal;
import org.model.util.Genotype;
import org.model.util.Vector2d;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> geno1 = new ArrayList<Integer>();
        geno1.add(0);
        geno1.add(1);
        geno1.add(2);
        geno1.add(3);
        geno1.add(4);
        geno1.add(5);
        geno1.add(6);
        geno1.add(7);


        ArrayList<Integer> geno2 = new ArrayList<Integer>();
        geno2.add(10);
        geno2.add(11);
        geno2.add(21);
        geno2.add(31);
        geno2.add(41);
        geno2.add(51);
        geno2.add(61);
        geno2.add(71);



        Animal animal1 = new Animal(new Vector2d(1,1),20,geno1,0);
        Animal animal2 = new Animal(new Vector2d(1,1),30,geno2,0);
        System.out.println(animal1.getGenotype());
        System.out.println(animal2.getGenotype());
        Genotype genotype12 = new Genotype(animal1, animal2, 8);
        Animal animal3 = new Animal(new Vector2d(1,1), 30, genotype12.getGenom(), 0);

        System.out.println(genotype12.getGenom());


    }
}