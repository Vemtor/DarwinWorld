package org.model.util;

import java.util.ArrayList;
import java.util.List;



public class Animal {

    private static final int energyNeededToReproduce = 10;
    private Vector2d position;
    private int energy;
    private ArrayList<Animal> children;
    private MapDirection direction;
    private int eatenFoodCounter;
    private final int birthDate;
    private int deadDate;
    private int startEnergy;
    private boolean isAlive;
    private List<Integer> genoList;
    private int currentGenoNum;

    private final int genLength = 8;


    public Animal(Vector2d position, int energy, List<Integer> genoList, int birthDate){
        this.position = position;
        this.energy = energy;
        this.genoList = genoList;
        this.birthDate = birthDate;
    }


    public Animal(Vector2d position, Animal animal1, Animal animal2){
        this(position, 0, new Genotype(animal1,animal2, 8).getGenom(), 0);

    }

    public Animal(Vector2d position){
        this(position,0,new Genotype().getGenom(),0);
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

    public List<Integer> getGenotype() {
        return genoList;
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

    public void nextGenoNum(){
        currentGenoNum = (currentGenoNum+1)%genLength;

    }

    public void move(){
        int x = this.genoList.get(currentGenoNum);
        Vector2d toPosition =
        if(isAlive && ){
        }
    }



    public void killAnimal() {
        if (isAlive) isAlive = false;
    }


}
