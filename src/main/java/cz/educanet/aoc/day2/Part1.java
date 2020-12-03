package cz.educanet.aoc.day2;

import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class Part1 {

    public static void main(String[] args) {
        File rawPasses = new File("C:/Users/Kiku/Documents/GitHub/AoC2020/src/main/java/2/passes.txt");
        ArrayList<Password> passes = Password.arrayToPass(Resources.inputToArraylist(rawPasses), 1);
        System.out.println(passes.stream().filter(Password::isValid).count());
    }

}
