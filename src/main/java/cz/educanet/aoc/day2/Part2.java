package cz.educanet.aoc.day2;


import cz.educanet.aoc.resources.Resources;

import java.io.File;
import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
        File raw = new File("C:/Users/Kiku/Documents/GitHub/AoC2020v1/src/main/java/cz/educanet/aoc/resources/2.txt");
        ArrayList<Password> passwords = Password.arrayToPass(Resources.inputToArraylist(raw), 2);
        System.out.println(passwords.stream().filter(Password::isValid).count());
    }

}
