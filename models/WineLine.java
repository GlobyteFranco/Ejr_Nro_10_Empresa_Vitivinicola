package models;

import java.util.Map;

public interface WineLine {
    public int returnPrice(int volume);

    public Map<StorageTypes, Integer> showStorage();
}
