package Repositorie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Wine;

public class WineRepo {
    private List<Wine> wineList;

    public WineRepo(List<Wine> wineList) {
        this.wineList = wineList;
    }

    public void addWine(Wine wine) {
        wineList.add(wine);
    }

    public List<Wine> getWineList() {
        return wineList;
    }

}
