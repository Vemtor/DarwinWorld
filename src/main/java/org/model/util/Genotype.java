package org.model.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Genotype {

    private final int genLength = 8;

    private List<Integer> genom;

    public List<Integer> getGenes() {
        return genom;
    }



    public List<Integer> randomGenom(){
        Random mutNum = new Random();
        List<Integer> randGenomList = new ArrayList<>();
        for(int i = 0; i<genLength; i++){
            int genomDigit = mutNum.nextInt(genLength);
            randGenomList.add(genomDigit);

        }

        return randGenomList;
    }



    public List<Integer> reproduceGeno(Animal a1, Animal a2, int e1, int e2) {
        Random rand = new Random();
        double randomNum = rand.nextDouble();
        List<Integer> g1 = a1.getGenotype();
        List<Integer> g2 = a2.getGenotype();

        double parent1ratio = (double)e1 / (e1 + e2);
        double parent2ratio = (double)e2 / (e1 + e2);


        int g1length = (int) ((parent1ratio) * genLength);
        int g2length = (int) ((parent2ratio) * genLength);



        List<Integer> GenoChild = new ArrayList<>();
        int j = 0;

        if (randomNum > 0.5) {
            //prawa strona silniejszego
            if(e1>e2){
                for(int i=0; i<=g1length; i++){
                    GenoChild.add(g2.get(i));
                }
                for(int i=genLength-g2length; i<genLength; i++){
                    GenoChild.add(g1.get(i));
                }
            } else{
                for(int i=0; i<=g1length; i++){
                    GenoChild.add(g1.get(i));
                }
                for(int i=genLength-g2length; i<genLength; i++){
                    GenoChild.add(g2.get(i));
                }
            }
        } else{
            if(e1>e2) {
                //teraz pierwszy jest silniejszy i bierzemy jego lewą strone
                for (int i = 0; i <=g1length; i++) {
                    GenoChild.add(g1.get(i));
                }

                for(int i = 0; i<genLength-g2length; i++){
                    GenoChild.add(g2.get(i));
                }
            } else {
                for(int i = 0; i<=g2length; i++){
                    GenoChild.add(g2.get(i));
                }
                for(int i = genLength-g1length; i<genLength; i++){
                    GenoChild.add(g1.get(i));
                }

            }


        }


        Random rand1 = new Random();
        int mutCnt = rand1.nextInt(genLength);


        Random mutInd = new Random();
        Random mutNumber = new Random();

        for(int i = 0; i<=mutCnt; i++){
            int mutateIndex = mutInd.nextInt(genLength);
            int mutNumberSwap = mutNumber.nextInt(genLength);
            GenoChild.set(mutateIndex, mutNumberSwap);
        }


        return GenoChild;
    }


    public Genotype(Animal a1, Animal a2, int n){
        this.genom = reproduceGeno(a1, a2, a1.getEnergy(),a2.getEnergy());

    }

    public Genotype(){
        this.genom = randomGenom();
    }



    public List<Integer> getGenom() {
        return genom;
    }







}

