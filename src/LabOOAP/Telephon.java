package LabOOAP;

/**
 * Created by Bohdan on 03.11.2015.
 */
abstract public class Telephon {
int price;
    int time;

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;

    }

  protected Telephon(int time, int price) {
        this.time = time;
        this.price = price;
    }
}
