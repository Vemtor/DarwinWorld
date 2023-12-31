package org.model.util;

public class Plant {
    private Vector2d position;
    private int energy;
    private boolean alive;

    public Plant(Vector2d position, int energy){
        this.position = position;
        this.energy = energy;
        this.alive = true;
    }

    public Plant(Vector2d position){
        this(position, 1);
    }


    public Vector2d getPosition() {
        return position;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isAlive() {
        return alive;
    }
}
