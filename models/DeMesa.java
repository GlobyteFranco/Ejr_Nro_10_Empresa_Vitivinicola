package models;

import java.util.HashMap;
import java.util.Map;

public class DeMesa implements WineLine {
    private Map<StorageTypes, Integer> mapInfo = new HashMap<>();

    public DeMesa() {
        mapInfo.put(StorageTypes.BARRICA, 1);
    }

    @Override
    public int returnPrice(int volume) {
        return volume * 1200;
    }

    @Override
    public Map<StorageTypes, Integer> showStorage() {
        return mapInfo;
    }

}
