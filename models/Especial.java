package models;

import java.util.HashMap;
import java.util.Map;

public class Especial implements WineLine {
    private Map<StorageTypes, Integer> mapInfo = new HashMap<>();

    public Especial() {
        mapInfo.put(StorageTypes.BARRICA, 2);
        mapInfo.put(StorageTypes.BOTELLA, 1);

    }

    @Override
    public int returnPrice(int volume) {
        return volume * 3200;
    }

    @Override
    public Map<StorageTypes, Integer> showStorage() {
        return mapInfo;
    }

}
