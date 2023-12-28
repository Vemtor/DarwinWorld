package org.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Genotype {

    private final int genLength = 8;

    private List<Integer> genes;

    public List<Integer> getGenes() {
        return genes;
    }

    public reproduceGeno(List<Integer> g1, List<Integer> g2, int e1, int e2){
        Random rand = new Random();
        double randomNum = rand.nextDouble();

        double parent1ratio = e1/(e1+e2);
        double parent2ratio = e2/(e1+e2);

       int g1length = (int) ((parent1ratio)*genLength);
       int g2length = (int) ((parent2ratio)*genLength);
       List<Integer> GenoChild = new ArrayList<>()



    }

    public Genotype(Animal a1, Animal a2, int n){


    }




}
