package Laboratorn;

/**
 * Created by Bohdan on 03.11.2015.
 */
public abstract class ForClass implements Isky {
    int id;
    int shoeSSize;
    String Direction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShoeSSize() {
        return shoeSSize;
    }

    public void setShoeSSize(int shoeSSize) {
        this.shoeSSize = shoeSSize;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }



    protected ForClass(int id, int shoeSSize, String direction) {
        this.id = id;
        this.shoeSSize = shoeSSize;
        Direction = direction;
    }


}
