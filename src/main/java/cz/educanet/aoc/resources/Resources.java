package cz.educanet.aoc.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Resources {
    public static ArrayList<String> inputToArraylist(File input) {
        Scanner sc = null;
        ArrayList<String> temp = new ArrayList<>();
        try {
            sc = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            temp.add(sc.nextLine());
        }
        return temp;

    }
}
