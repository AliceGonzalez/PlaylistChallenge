package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        Integer nextSong = (startIndex + 2) % playList.length;
        Integer previousSong = (startIndex - 1 + playList.length) % playList.length;

        int i;
        for (i = startIndex; i < startIndex + playList.length * 2; i++) ;
        if (playList[nextSong].equals(selection)){
        return i;
        }else {
            if (playList[previousSong].equals(selection)) {
                return i;
            }
        }
        return null;
    }


}
