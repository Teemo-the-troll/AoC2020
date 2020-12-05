package cz.educanet.aoc.day4;

import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class Part1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Kiku/Documents/GitHub/AoC2020v1/src/main/java/cz/educanet/aoc/resources/4.txt");
        System.out.println(Passport.toPassport(Resources.inputToArraylist(file)).size());
    }
}
