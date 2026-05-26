package models;

import java.util.Map;

public class Wine {
    private int totalVolume;
    private WineLine wineLine;

    public Wine(int totalVolume, WineLine wineLine) {
        this.totalVolume = totalVolume;
        this.wineLine = wineLine;
    }

    public int showPrice() {
        return wineLine.returnPrice(totalVolume);
    }

    public Map<StorageTypes, Integer> showStorage() {
        return wineLine.showStorage();
    }

}
