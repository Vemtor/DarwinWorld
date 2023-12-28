package org.model.util;


public enum MapDirection {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    NORTH_WEST,
    SOUTH_EAST,
    SOUTH_WEST,
    NORTH_EAST;

    public String toString(){
        return switch(this){
            case NORTH -> "Polnoc";
            case NORTH_EAST -> "Polnocny-Wschod";
            case EAST -> "Wschod";
            case SOUTH_EAST -> "Poludniowy-Wschod";
            case SOUTH -> "Poludnie";
            case SOUTH_WEST -> "Poludniowy-Zachod";
            case WEST -> "Zachod";
            case NORTH_WEST -> "Polnocy-Zachod";
        };
    }
    public MapDirection next(){
        return switch(this){
            case EAST -> SOUTH_EAST;
            case SOUTH_EAST -> SOUTH;
            case WEST -> NORTH_WEST;
            case NORTH_WEST -> NORTH;
            case NORTH -> NORTH_EAST;
            case NORTH_EAST ->  EAST;
            case SOUTH -> SOUTH_WEST;
            case SOUTH_WEST -> WEST;

        };
    }



    public Vector2d toUnitVector(){
        return switch (this) {
            case NORTH -> new Vector2d(0, 1);
            case NORTH_EAST -> new Vector2d(1, 1);
            case EAST -> new Vector2d(1, 0);
            case SOUTH_EAST -> new Vector2d(1, -1);
            case SOUTH -> new Vector2d(0, -1);
            case SOUTH_WEST -> new Vector2d(-1, -1);
            case WEST -> new Vector2d(-1, 0);
            case NORTH_WEST -> new Vector2d(-1, 1);
        };
    }


}