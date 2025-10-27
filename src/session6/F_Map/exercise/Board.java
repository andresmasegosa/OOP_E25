package session6.F_Map.exercise;

import java.util.Map;

/**
 * Exercise: Complete the implementation of the Board class.
 *
 * Aim:
 * This class represents a generic game board where each position can hold an object of type T.
 * The board uses a Map to associate positions with the objects placed on them.
 *
 * Tasks:
 * 1. Initialize the 'objects' map appropriately in the constructor.
 * 2. Implement the 'getObject' method to return the object stored at a given position.
 * 3. Implement the 'setObject' method to place (or replace) an object at a given position.
 *
 * Hints:
 * - Consider using a HashMap for storing the objects.
 * - Think about what should happen if you request an object from an empty position.
 */
public class Board<T> {

    private Map<Position,T> objects;

    public Board() {

    }

    public T getObject(Position position){
        return null;
    }

    public void setObject(Position position, T object){

    }
}
