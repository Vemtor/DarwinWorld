package org.model.util;

public class Plant {
    private Vector2d position;
    private int energy;
    private boolean alvie;

    public Plant(Vector2d position, int energy){
        this.position = position;
        this.energy = energy;
        this.alvie = true;

    }

    public Vector2d getPosition() {
        return position;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isAlvie() {
        return alvie;
    }
}
