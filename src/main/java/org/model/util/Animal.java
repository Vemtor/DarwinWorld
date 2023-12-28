package org.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Animal {

    private static final int energyNeededToReproduce = 10;
    private Vector2d position;
    private int energy;
    private ArrayList<Animal> children;
    private MapDirection direction;
    private int eatenFoodCounter;
    private final int birthDate;
    private int deadDate;
    private boolean isAlive;
    private Genotype genotype;


    public Animal(Vector2d position, int energy, Genotype genotype, int birthDate){
        this.position = position;
        this.energy = energy;
        this.genotype = genotype;
        this.birthDate = birthDate;
    }

    public Animal(Vector2d position, int energy, Genotype genotype){
        this(position,energy,genotype,0);
    }



    public int getEnergy() {
        return energy;
    }

    public Vector2d getPosition() {
        return position;
    }

    public int getEatenFoodCounter() {
        return eatenFoodCounter;
    }

    public Genotype getGenotype() {
        return genotype;
    }

    public ArrayList<Animal> getChildren() {
        return children;
    }

    public int getDeadDate() {
        return deadDate;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public MapDirection getDirection() {
        return direction;
    }

    public boolean getisAlive(){
        return isAlive;
    }

    public boolean canReproduce(){
        return this.energy >= energyNeededToReproduce && isAlive;
    }

    public boolean canMove(){
     //TODO
     return true;
    }



    public void killAnimal() {
        if (isAlive) isAlive = false;
    }


}
