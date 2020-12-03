package cz.educanet.aoc.day3;

import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class TreeFinder {
    public static int treeAmount(int xBy, int yBy) {
        File raw = new File("C:/Users/Kiku/Documents/GitHub/AoC2020v1/src/main/java/cz/educanet/aoc/resources/3.txt");
        ArrayList<char[]> refinedSlope = new ArrayList<>();
        int x = 0;
        int y = 0;
        int treesFound = 0;
        for (String s : Resources.inputToArraylist(raw))
            refinedSlope.add(s.toCharArray());
        for (char[] c : refinedSlope) {
            if (y >= refinedSlope.size())
                return treesFound;
            if (x >= c.length)
                x -= c.length;
            char[] row = refinedSlope.get(y);
            if (row[x] == '#')
                treesFound++;
            x += xBy;
            y += yBy;
        }
        return treesFound;
    }
}
