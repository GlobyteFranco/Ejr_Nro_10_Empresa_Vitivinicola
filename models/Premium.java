package models;

import java.util.HashMap;
import java.util.Map;

public class Premium implements WineLine {
    private Map<StorageTypes, Integer> mapInfo = new HashMap<>();

    public Premium() {
        mapInfo.put(StorageTypes.BARRICA, 2);
    }

    @Override
    public int returnPrice(int volume) {
        return volume * 2000;
    }

    @Override
    public Map<StorageTypes, Integer> showStorage() {
        return mapInfo;
    }

}
