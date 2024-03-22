package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

public class Music {

    private String playlist;

    public Music(String[] playList) {

    }

    public Integer selection(Integer startIndex, String selection) {
        //Create song arrayList
        ArrayList<String> songs = new ArrayList<String>(Arrays.asList(this.playlist));
        //Calculate from selected song to start index
        int up = Math.abs(songs.indexOf(selection) - startIndex);
        //calculates the difference between the size of the songs list and the last occurrence index of the selection song added to the startIndex
        int down = Math.abs(songs.size() + startIndex) - songs.lastIndexOf(selection);
        //Returns the minimum of the two differences calculated in steps 2 and 3, which indicates the shortest distance (number of positions) to reach the selection song from either the starting index or the end of the list.
        return Math.min(up, down);
        
    }
}
