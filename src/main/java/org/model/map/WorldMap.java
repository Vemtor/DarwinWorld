package org.model.map;

import org.model.util.Animal;
import org.model.util.Plant;
import org.model.util.Vector2d;

import java.util.ArrayList;
import java.util.Map;


public class WorldMap {
    private final int mapHeight;
    private final int mapWidth;

    private final int animalStartNumber;
    private final int plantStartNumber;

    Map<Vector2d, Plant> plants;
    Map<Vector2d, ArrayList<Animal>> animals; //na danej pozycji moze stać kilka zwierząt

    public WorldMap(int MapHeight, int mapWidth, int animalStartNumber, int plantStartNumber ){
        this.mapHeight = MapHeight;
        this.mapWidth = mapWidth;
        this.animalStartNumber = animalStartNumber;
        this.plantStartNumber = plantStartNumber;
        Vector2d upRightCorner = new Vector2d(mapWidth, mapHeight);
        Vector2d downLeftCorner = new Vector2d(0, 0);
    }

    public WorldMap(int MapHeight, int mapWidth){
        this(MapHeight, mapWidth, 5, 5);
    }

    public void putStartPlants(){
        PositionsGenerator positionsGeneratorPlants = new PositionsGenerator(mapHeight, mapWidth, plantStartNumber);
        ArrayList<Vector2d> plantsPositions = positionsGeneratorPlants.randPositionPlant();
        for(Vector2d position: plantsPositions){
            plants.put(position, new Plant(position));
        }
    }

    public void putStartAnimals(){
        PositionsGenerator animalGeneratedPositions = new PositionsGenerator(mapHeight, mapWidth, animalStartNumber);
        ArrayList<Vector2d> animalPositions = animalGeneratedPositions.randPositionAnimal();
        for(Vector2d position: animalPositions){
            if(!isOccupiedAnimal(position)){
                //nic tu jeszcze nie stoi
                ArrayList<Animal> animalsOnThisPosition = new ArrayList<Animal>();
                animalsOnThisPosition.add(new Animal(position));
                animals.put(position, animalsOnThisPosition);
            }else{
                ArrayList<Animal> animalsOnThisPosition = animals.get(position);
                animalsOnThisPosition.add(new Animal(position));
            }
        }
    }

    public boolean isOccupiedAnimal(Vector2d position){
        return animals.containsKey(position);
    }

    public boolean isOccupiedPlant(Vector2d position){
        return plants.containsKey(position);
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public int getAnimalStartNumber() {
        return animalStartNumber;
    }

    public int getPlantStartNumber() {
        return plantStartNumber;
    }

    public Map<Vector2d, ArrayList<Animal>> getAnimals() {
        return animals;
    }

    public Map<Vector2d, Plant> getPlants() {
        return plants;
    }
}
