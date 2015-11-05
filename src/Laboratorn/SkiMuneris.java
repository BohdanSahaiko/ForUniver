package Laboratorn;


import Laboratorn.item.SnowBoard;

import java.util.ArrayList;
import java.util.List;

public class SkiMuneris extends ForClass  {
    private List<SnowBoard> snowBoards;
    protected SkiMuneris(int id, int shoeSSize, String direction) {
        super(id, shoeSSize, direction);
        snowBoards = new ArrayList<SnowBoard>();
    }

    @Override
    public int addSnow() {
        snowBoards.add(new SnowBoard());
        return snowBoards.size();
    }

    @Override
    public int getCustomizingPrice() {
        return 200;
    }

    @Override
    public int getTotalPrice() {

        int res = 0;
        for (SnowBoard sb : this.snowBoards) {
            res += sb.getPrice();
        }
        return res + getCustomizingPrice();
    }
}
