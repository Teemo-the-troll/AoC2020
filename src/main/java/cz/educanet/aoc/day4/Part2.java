package cz.educanet.aoc.day4;

import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Kiku/Documents/GitHub/AoC2020v1/src/main/java/cz/educanet/aoc/resources/4.txt");
        ArrayList<ArrayList<String>> passes = Passport.toPassport(Resources.inputToArraylist(file));
        System.out.println(passes.stream().filter(Passport::validify).count());
    }
}
